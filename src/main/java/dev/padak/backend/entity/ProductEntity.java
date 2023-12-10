package dev.padak.backend.entity;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product", schema = "public")
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "barcode")
	private String barcode;

	@Column(name = "description", nullable = false)
	private String description;

	@Column(name = "department")
	private String department;

	@Column(name = "group")
	private String group;

	@Column(name = "unit", nullable = false)
	private String unit;

	@Column(name = "unit_purchase_price", nullable = false)
	private BigDecimal unitPurchasePrice;

	@Column(name = "unit_sales_price", nullable = false)
	private BigDecimal unitSalesPrice;

	@Column(name = "dollar_purchase_price")
	private BigDecimal dollarPurchasePrice;

	@Column(name = "dollar_sales_price")
	private BigDecimal dollarSalesPrice;

	@Column(name = "euro_purchase_price")
	private BigDecimal euroPurchasePrice;

	@Column(name = "euro_sales_price")
	private BigDecimal euroSalesPrice;

	@Column(name = "part_number")
	private String partNumber;

	@Column(name = "actual_stock")
	private Integer actualStock;

	@Column(name = "minimum_stock")
	private Integer minimumStock;

	@Column(name = "vat", nullable = false)
	private Double vat;

	@Column(name = "vat_included", nullable = false)
	private Integer vatIncluded;

	@Column(name = "extra_description")
	private String extraDescription;

	@Column(name = "location")
	private String location;

	@Column(name = "tracking")
	private Integer tracking;

}
