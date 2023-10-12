package flower.store;

import lombok.Getter;

public class Rose extends Flower{
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;

    public Rose(Flower item) {
        super(item);
        
    }
    
}
