package flower;


import lombok.Data;

@Data
public class Chamomile extends Flower{
    private float price;
    private Color color;
    private CountryOfOrigin country;
    private FlowerType type;
    private int quantity;

    public Chamomile(int quantity) {
        this.price = 5;
        this.color = Color.WHITE;
        this.country = CountryOfOrigin.UKRAINE;
        this.type = FlowerType.CHAMOMILE;
        this.quantity = quantity;

    }

}