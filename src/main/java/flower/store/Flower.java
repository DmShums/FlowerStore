package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(Flower item)
    {
        this.flowerType = item.flowerType;
        this.color = item.color;
        this.price = item.price;
        this.sepalLength = item.sepalLength;
    }

    public String getColor() {
        return color.toString();
    }
}
