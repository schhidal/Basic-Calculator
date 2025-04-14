package oop.polymorphism;

public class Main {
    public static void main(String[] args) {

        // create animal object
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myPig = new Pig();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();


    }

}
