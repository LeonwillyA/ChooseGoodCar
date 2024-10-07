package com.buy.ownProjectVehicle.domain.repository;

import com.buy.ownProjectVehicle.domain.VehicleCrossoverDomain;
import com.buy.ownProjectVehicle.persistence.entity.VehicleCrossover;

import java.util.List;
import java.util.Optional;

public interface ProductRepositoryDomain {
    List<VehicleCrossoverDomain> getAll();
    Optional<List<VehicleCrossoverDomain>> getByBrand(String brand);
    VehicleCrossoverDomain save(VehicleCrossoverDomain vehicleCrossoverDomain);
    void delete(int productId);

}
