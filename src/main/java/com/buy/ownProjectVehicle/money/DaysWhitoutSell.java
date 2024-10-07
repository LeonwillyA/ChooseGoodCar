package com.buy.ownProjectVehicle.money;

import com.buy.ownProjectVehicle.domain.VehicleCrossoverDomain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class DaysWhitoutSell {

    public long calculateDaysWithoutSell(VehicleCrossoverDomain vehicle) {
        // Verificar si el vehículo ya está vendido
        if ("Vendido".equalsIgnoreCase(vehicle.getStatusDomain())) {
            return 0; // Si ya está vendido, no se cuentan más días
        }

        // Obtener la fecha de ingreso del vehículo
        LocalDate entryDate = vehicle.getDatePublicationDomain(); // Método para obtener la fecha de ingreso
        LocalDate currentDate = LocalDate.now(); // Fecha actual

        // Calcular los días entre la fecha de ingreso y la fecha actual
        long daysWithoutSell = ChronoUnit.DAYS.between(entryDate, currentDate);

        return daysWithoutSell;
    }
}
