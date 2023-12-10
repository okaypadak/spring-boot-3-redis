package dev.padak.backend.mapper;

import dev.padak.backend.dto.ProductDTO;
import dev.padak.backend.entity.ProductEntity;

public class ProductMapper {

    public static ProductDTO entityToDto(ProductEntity entity) {
        ProductDTO dto = new ProductDTO();
        dto.setId(entity.getId());
        dto.setBarcode(entity.getBarcode());
        dto.setDescription(entity.getDescription());
        dto.setDepartment(entity.getDepartment());
        dto.setGroup(entity.getGroup());
        dto.setUnit(entity.getUnit());
        dto.setUnitPurchasePrice(entity.getUnitPurchasePrice());
        dto.setUnitSalesPrice(entity.getUnitSalesPrice());
        dto.setDollarPurchasePrice(entity.getDollarPurchasePrice());
        dto.setDollarSalesPrice(entity.getDollarSalesPrice());
        dto.setEuroPurchasePrice(entity.getEuroPurchasePrice());
        dto.setEuroSalesPrice(entity.getEuroSalesPrice());
        dto.setPartNumber(entity.getPartNumber());
        dto.setActualStock(entity.getActualStock());
        dto.setMinimumStock(entity.getMinimumStock());
        dto.setVat(entity.getVat());
        dto.setVatIncluded(entity.getVatIncluded());
        dto.setExtraDescription(entity.getExtraDescription());
        dto.setLocation(entity.getLocation());
        dto.setTracking(entity.getTracking());
        return dto;
    }
}
