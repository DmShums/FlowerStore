package flower.store;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Store {
    private List<Item> items;

    public Store() {
        this.items = new ArrayList<>();
    }

    public List<Item> search(Filter filter) {
        return items.stream()
                .filter(filter::match)
                .collect(Collectors.toList());
    }
}
