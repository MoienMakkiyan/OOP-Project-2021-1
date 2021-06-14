package Objects.Animal;

import java.util.ArrayList;

public class HunterDog extends Animal {

    public static ArrayList<HunterDog> hunterDogs = new ArrayList<>(0);


    HunterDog(String type) {
        super(type);
    }
}

