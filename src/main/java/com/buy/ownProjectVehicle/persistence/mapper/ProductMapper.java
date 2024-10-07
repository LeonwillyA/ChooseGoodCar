package com.buy.ownProjectVehicle.persistence.mapper;

import com.buy.ownProjectVehicle.domain.VehicleCrossoverDomain;
import com.buy.ownProjectVehicle.persistence.entity.VehicleCrossover;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "idProduct", target = "productIdDomain"),
            @Mapping(source = "brand", target = "branDomain"),
            @Mapping(source = "model", target = "modelDomain"),
            @Mapping(source = "year", target = "yearDomain"),
            @Mapping(source = "price", target = "priceDomain"),
            @Mapping(source = "transmission", target = "transmissionDomain"),
            @Mapping(source = "traction", target = "tractionDomain"),
            @Mapping(source = "link", target = "linkDomain"),
            @Mapping(source = "datePublication", target = "datePublicationDomain"),
            @Mapping(source = "daysWhitoutSell", target = "daysWhitoutSellDomain"),
            @Mapping(source = "negotiablePrice", target = "negotiablePriceDomain"),
            @Mapping(source = "ranking", target = "rankingDomain"),
            @Mapping(source = "newDifferentPrice", target = "newDifferentPriceDomain"),
            @Mapping(source = "amountNegotiablePrice", target = "amountNegotiablePriceDomain"),
            @Mapping(source = "plate", target = "plateDomain"),
            @Mapping(source = "kilometer", target = "kilometerDomain"),
            @Mapping(source = "status", target = "statusDomain"),
            @Mapping(source = "moneyMissing", target = "moneyMissingDomain")
    })
    VehicleCrossoverDomain toVehicleCrossoverDomain (VehicleCrossover vehicleCrossover);
    List<VehicleCrossoverDomain> toVehicleCrossoverDomains (List<VehicleCrossover> vehicleCrossovers);


    @InheritInverseConfiguration
    VehicleCrossover toVehicleCrossover(VehicleCrossoverDomain vehicleCrossoverDomain);
}
