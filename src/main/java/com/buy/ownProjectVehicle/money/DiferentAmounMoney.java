package com.buy.ownProjectVehicle.money;

import com.buy.ownProjectVehicle.domain.VehicleCrossoverDomain;
import org.apache.catalina.Valve;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class DiferentAmounMoney {
    private CountMoney countMoney;

    // Método para actualizar los precios
    public List<VehicleCrossoverDomain> restPrice(List<VehicleCrossoverDomain> vehicles, BigDecimal missingValue) {
        // Recorrer la lista de vehículos y restar el valor del descuento a cada precio
        for (VehicleCrossoverDomain vehicle : vehicles) {
            BigDecimal actualAmount = vehicle.getPriceDomain(); // Obtener el precio actual
            BigDecimal newRest = actualAmount.subtract(missingValue); // Restar el valor
            vehicle.setMoneyMissingDomain(newRest); // Actualizar con el nuevo precio
        }

        // Retornar la lista con los vehículos actualizados
        return vehicles;
    }
}
