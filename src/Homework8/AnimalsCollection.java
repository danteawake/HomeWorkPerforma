package Homework8;

import java.util.Deque;
import java.util.LinkedList;

public class AnimalsCollection {
    Deque<String> animalCollection = new LinkedList<>();

    public void addAnimal(String animal) {
        animalCollection.addFirst(animal);
    }

    public void removeAnimal() {
        animalCollection.removeLast();
    }

    public void showAnimals() {
        System.out.println(animalCollection);
    }
}
