package oop.interfaces;

public class Main implements Animal{
public static void main(String[] args) {
   
    
Main dog = new Main();
dog.animalSound();
dog.run();



}


public void animalSound(){
System.out.println("Singing");
}
public void run(){
System.out.println("Running");
}
}

