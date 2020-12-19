package challenge;

import domain.*;

import java.util.List;

class Exercise2 {

    static  void addAnimalOfTheMonth(List<? super Animal> animals) {
        Zebra zebra = null;
        animals.add(zebra);
    }
}
