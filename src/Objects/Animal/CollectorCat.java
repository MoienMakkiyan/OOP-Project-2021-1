package Objects.Animal;

import java.util.ArrayList;

public class CollectorCat extends Animal {

    ArrayList<CollectorCat> collectorCats = new ArrayList<>(0);

    CollectorCat(String type) {
        super(type);
    }

    boolean checkMap() {
        return true;
    }
}

