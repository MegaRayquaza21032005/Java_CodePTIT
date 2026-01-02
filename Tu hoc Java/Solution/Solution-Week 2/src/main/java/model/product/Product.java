package model.product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    protected String barcode;

    protected String name;

    protected ProductType type;

    protected long price;

    protected String description;

}
