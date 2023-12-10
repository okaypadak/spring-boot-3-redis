package dev.padak.backend.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ProductDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 7486129824993278105L;

    private Integer id;
    private String barcode;
    private String description;
    private String department;
    private String group;
    private String unit;
    private BigDecimal unitPurchasePrice;
    private BigDecimal unitSalesPrice;
    private BigDecimal dollarPurchasePrice;
    private BigDecimal dollarSalesPrice;
    private BigDecimal euroPurchasePrice;
    private BigDecimal euroSalesPrice;
    private String partNumber;
    private Integer actualStock;
    private Integer minimumStock;
    private Double vat;
    private Integer vatIncluded;
    private String extraDescription;
    private String location;
    private Integer tracking;

}
