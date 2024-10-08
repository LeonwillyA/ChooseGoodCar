package com.buy.ownProjectVehicle.money;

import com.buy.ownProjectVehicle.domain.VehicleCrossoverDomain;
import org.apache.catalina.Valve;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

//Se necesitaba colocar el @Component para que no saliera error.
@Component
public class DiferentAmounMoney {
    private CountMoney countMoney;

    // Metodo donde devuelvo una lista de VehicleCrossoverDomain, donde recibo datos de VehicleCrossoverDomain y el valor que tengo hasta el momento
    public List<VehicleCrossoverDomain> restPrice(List<VehicleCrossoverDomain> vehicles, BigDecimal missingValue) {
        // Recorrer la lista de vehículos y restar el valor inicial que tengo hasta el momento
        for (VehicleCrossoverDomain vehicle : vehicles) {
            BigDecimal actualAmount = vehicle.getPriceDomain(); // Obtener el precio actual que tiene el vehiculo
            BigDecimal newRest = actualAmount.subtract(missingValue); // Restar el monto total que tengo ahorrado (missingValue)
            vehicle.setMoneyMissingDomain(newRest); // Guardar el monto que me falta por conseguir  en setMoneyMissingDomain() para tener el vehiculo
            //Set == Colocar
        }

        // Retornar la lista del monto de dinero que me falta para poder obtener cada uno de los vehiculos
        return vehicles;
    }
}
