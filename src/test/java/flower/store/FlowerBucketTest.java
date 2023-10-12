package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FlowerBucketTest {
    private FlowerBucket flowerBucket;

    @BeforeEach
    public void setUp() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPriceCalculation() {
        Flower rose = createFlower(FlowerType.ROSE, 50); // Rose with a price of 50
        FlowerPack flowerPack = new FlowerPack(rose, 10); // 10 roses
        flowerBucket.addFlowerPack(flowerPack);

        Assertions.assertEquals(500, flowerBucket.getPrice()); // 10 roses * 50 price each
    }

    private Flower createFlower(FlowerType type, int price) {
        Flower flower = new Flower();
        flower.setFlowerType(type);
        flower.setPrice(price);
        return flower;
    }
}
