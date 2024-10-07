package com.buy.ownProjectVehicle.persistence;

import com.buy.ownProjectVehicle.domain.VehicleCrossoverDomain;
import com.buy.ownProjectVehicle.domain.repository.ProductRepositoryDomain;
import com.buy.ownProjectVehicle.persistence.crud.ProductoCrudRepository;
import com.buy.ownProjectVehicle.persistence.entity.VehicleCrossover;
import com.buy.ownProjectVehicle.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository  implements ProductRepositoryDomain {
    @Autowired
    private ProductoCrudRepository productoCrudRepository;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<VehicleCrossoverDomain> getAll(){
        List<VehicleCrossover> vehicleCrossovers = (List<VehicleCrossover>) productoCrudRepository.findAllByOrderByStatusAscTractionDescYearDescPriceDesc();
        return productMapper.toVehicleCrossoverDomains(vehicleCrossovers);
    }

    @Override
    public Optional<List<VehicleCrossoverDomain>> getByBrand(String brand){
        List<VehicleCrossover> vehicleCrossovers = productoCrudRepository.findByBrandOrderByPriceAsc(brand);
        return Optional.of(productMapper.toVehicleCrossoverDomains(vehicleCrossovers));
    }

    @Override
    public VehicleCrossoverDomain save(VehicleCrossoverDomain vehicleCrossoverDomain) {
        VehicleCrossover vehicleCrossover = productMapper.toVehicleCrossover(vehicleCrossoverDomain);
        return productMapper.toVehicleCrossoverDomain(productoCrudRepository.save(vehicleCrossover));
    }

    @Override
    public void delete(int idProduct){
        System.out.println("Eliminando el producto con ID: " + idProduct);
        productoCrudRepository.deleteById(idProduct);
    }
}
