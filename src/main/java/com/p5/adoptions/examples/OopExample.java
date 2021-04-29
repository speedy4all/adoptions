package com.p5.adoptions.examples;

import com.p5.adoptions.model.Animal;
import com.p5.adoptions.model.Cat;

public class OopExample
{

    public static void main(String[] args)
    {
        Animal animal = new Animal();
        Animal animal2 = new Animal("Hachi", "http://hachi.jpg");
        Animal animal3 = new Animal()
                .setName("Hachi")
                .setPhotoUrl("photo");


        //Polymorphism
        Cat cat = new Cat("Machi", "photo");
        Animal catAnimal = new Cat("Zoro", "photo");

        cat.speak();
        catAnimal.speak();
    }
}
