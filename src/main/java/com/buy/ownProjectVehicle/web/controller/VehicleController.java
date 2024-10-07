package com.buy.ownProjectVehicle.web.controller;


import com.buy.ownProjectVehicle.domain.VehicleCrossoverDomain;
import org.springframework.ui.Model;
import com.buy.ownProjectVehicle.domain.service.VehicleCrossoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class VehicleController {
    @Autowired
    private VehicleCrossoverService vehicleCrossoverService;

        @GetMapping("/vehicles")
        public String getAllVehicles(Model model) {
            model.addAttribute("vehicles", vehicleCrossoverService.getAll());
            return "vehicle-list"; // Nombre de la vista (HTML) que mostraré
        }

    @GetMapping("/vehicles/brand/{brand}")
    public String getVehiclesByBrand(@PathVariable("brand") String brand, Model model) {
        // Desenvuelve el Optional
        Optional<List<VehicleCrossoverDomain>> optionalVehicles = vehicleCrossoverService.getByBrand(brand);

        // Verifica si hay vehículos presentes y añade la lista al modelo
        if (optionalVehicles.isPresent()) {
            model.addAttribute("vehicles", optionalVehicles.get());
        } else {
            model.addAttribute("vehicles", new ArrayList<>()); // O puedes manejar la ausencia de vehículos
        }

        return "vehicle-list";
    }

        @GetMapping("/vehicle/form")
        public String showAddVehicleForm(Model model) {
            model.addAttribute("vehicle", new VehicleCrossoverDomain());
            return "vehicle-form";
        }

        @PostMapping("/vehicle/save")
        public String saveVehicle(@ModelAttribute("vehicle") VehicleCrossoverDomain vehicle) {
            vehicleCrossoverService.save(vehicle);
            return "redirect:/vehicles";
        }

        @RequestMapping(value = "/vehicle/delete", method = {RequestMethod.POST, RequestMethod.DELETE})
        public String deleteVehicle(@RequestParam("id") Integer id) {
            vehicleCrossoverService.delete(id);
            return "redirect:/vehicles";
        }

}
