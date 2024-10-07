package com.buy.ownProjectVehicle.domain.service;

import com.buy.ownProjectVehicle.domain.VehicleCrossoverDomain;
import com.buy.ownProjectVehicle.domain.repository.ProductRepositoryDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleCrossoverService {
    @Autowired
    private ProductRepositoryDomain productRepositoryDomain;

    public List<VehicleCrossoverDomain> getAll(){
        return productRepositoryDomain.getAll();
    }

    public Optional<List<VehicleCrossoverDomain>> getByBrand(String brand){
        return productRepositoryDomain.getByBrand(brand);
    }

    public VehicleCrossoverDomain save(VehicleCrossoverDomain vehicleCrossoverDomain){
        return  productRepositoryDomain.save(vehicleCrossoverDomain);
    }


    public void delete(int productId){

        productRepositoryDomain.delete(productId);
    }

}

