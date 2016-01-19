package com.fooooooooo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(args[0] + "hello workd");
        Animal animal = AnimalFactory.createAnimal(AnimalFactory.CAT);
        animal.speak();
    }
}
