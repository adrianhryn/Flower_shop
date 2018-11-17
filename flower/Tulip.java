package flower;

import lombok.Data;

@Data
public class Tulip extends Flower{
    private float price;
    private Color color;
    private CountryOfOrigin country;
    private FlowerType type;
    private int quantity;

    public Tulip(int quantity) {
        this.price = 10;
        this.color = Color.PURPLE;
        this.country = CountryOfOrigin.ITALY;
        this.type = FlowerType.TULIP;
        this.quantity = quantity;

    }

}