package flower;

import lombok.Data;

@Data
public class Rose extends Flower{
    private float price;
    private Color color;
    private CountryOfOrigin country;
    private FlowerType type;
    private int quantity;

    public Rose(int quantity) {
        this.price = 50;
        this.color = Color.RED;
        this.country = CountryOfOrigin.SPAIN;
        this.type = FlowerType.ROSE;
        this.quantity = quantity;
    }
}
