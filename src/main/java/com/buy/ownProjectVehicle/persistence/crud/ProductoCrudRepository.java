package com.buy.ownProjectVehicle.persistence.crud;

import com.buy.ownProjectVehicle.persistence.entity.VehicleCrossover;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<VehicleCrossover,Integer> {
    List<VehicleCrossover> findByBrandOrderByPriceAsc(String brand);
    List<VehicleCrossover> findAllByOrderByStatusAscTractionDescYearDescPriceDesc();
}
