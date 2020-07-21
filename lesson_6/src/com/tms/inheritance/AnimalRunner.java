package com.tms.inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raman Kashanok
 */
public class AnimalRunner {
    public static void main(String[] args) {

        Animal vaska1 = new HomeCat(3, "vaska1", "Zagorodni 56A", "belhard");
        Animal vaska2 = new WildCat(3, "vaska2", "tiger");
        Cat vaska3 = new HomeCat(3, "vaska3", "Zagorodni 56A", "belhard");
        Cat vaska4 = new WildCat(3, "vaska4", "tiger");
        HomeCat vaska5 = new HomeCat(3, "vaska5", "Zagorodni 56A", "belhard");
        WildCat vaska6 = new WildCat(3, "vaska6", "tiger");

        List<Animal> animals = new ArrayList<>();
        animals.add(vaska1);
        animals.add(vaska2);
        animals.add(vaska3);
        animals.add(vaska4);
        animals.add(vaska5);
        animals.add(vaska6);

        for (Animal animal : animals)
        {
            animal.voice();
        }



    }
}
