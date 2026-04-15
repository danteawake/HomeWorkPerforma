package Homework8;

    /*
    Задача 2:
    Создать класс, который будет хранить в себе коллекцию с названиями
    животных. Реализовать методы удаления и добавления животных по
    следующим правилам: добавляется всегда в начало коллекции, а удаляется
    всегда из конца. Показать работу объекта этого класса в main методе другого
    класса.
     */

public class Home2 {
    public static void main(String[] args) {
        AnimalsCollection animalsCollection = new AnimalsCollection();
        animalsCollection.addAnimal("Cat");
        animalsCollection.addAnimal("Dog");
        animalsCollection.addAnimal("Cow");
        animalsCollection.showAnimals();
        animalsCollection.removeAnimal();
        animalsCollection.showAnimals();
    }
}

