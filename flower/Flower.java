package flower;

import lombok.Data;


@Data
public class Flower{
    private FlowerType type;
    private CountryOfOrigin countryOfOrigin;
    private Color color;
    private float price;
    private int quantity;
}


