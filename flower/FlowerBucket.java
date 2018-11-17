package flower;


import lombok.Getter;
import lombok.ToString;
import java.util.ArrayList;

@ToString
@Getter
public class FlowerBucket {
    private ArrayList<Flower> flowers = new ArrayList();

    public void addFlower(Flower fl){
        flowers.add(fl);
    }
    public float getPrice(){
        float price = 0;
        for (Flower flower: flowers){
            price += flower.getPrice() * flower.getQuantity();
        }
        return price;
    }
}


