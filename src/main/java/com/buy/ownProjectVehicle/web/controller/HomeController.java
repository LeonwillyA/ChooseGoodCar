package com.buy.ownProjectVehicle.web.controller;

import com.buy.ownProjectVehicle.domain.VehicleCrossoverDomain;
import com.buy.ownProjectVehicle.domain.service.VehicleCrossoverService;
import com.buy.ownProjectVehicle.money.CountMoney;
import com.buy.ownProjectVehicle.money.DaysWhitoutSell;
import com.buy.ownProjectVehicle.money.DiferentAmounMoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller

public class HomeController {

    @Autowired
    private VehicleCrossoverService vehicleCrossoverService;

    private final DiferentAmounMoney differencer;

    public HomeController(VehicleCrossoverService vehicleCrossoverService,DiferentAmounMoney differencer) {
        this.vehicleCrossoverService = vehicleCrossoverService;
        this.differencer = differencer;
    }


    @GetMapping("/vehi")
    public String showVehicles(Model model) {
        // Agregar datos dinámicos al modelo
        List<VehicleCrossoverDomain> vehicles = vehicleCrossoverService.getAll();
        DaysWhitoutSell daysWithoutSellCalculator = new DaysWhitoutSell();

        for (VehicleCrossoverDomain vehicle : vehicles) {
            long days = daysWithoutSellCalculator.calculateDaysWithoutSell(vehicle);
            vehicle.setDaysWhitoutSellDomain((int) days); // Asignar los días calculados al objeto vehículo
        }

        model.addAttribute("vehicles", vehicles);
        CountMoney countMoney = new CountMoney();


        BigDecimal dolares = countMoney.suuma();
        // Calcular el nuevo precio restando 'missingValue'
        BigDecimal missingValue = new BigDecimal(String.valueOf(dolares));
        List<VehicleCrossoverDomain> updatedVehicles = differencer.restPrice(vehicles, missingValue);
        model.addAttribute("vehicles", updatedVehicles);



        model.addAttribute("countMoney", countMoney);
        model.addAttribute("greeting", "Bienvenido a Categoría de Vehículos");

        //model.addAttribute("vehicles", vehicleCrossoverService.getAll());
        // Retornar la vista 'index.html' que estará en 'src/main/resources/templates/index.html'
        return "index";
    }
}
