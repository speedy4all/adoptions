package com.p5.adoptions.examples;

import com.p5.adoptions.model.Animal;
import com.p5.adoptions.model.CatDTO;

public class OopExample
{

    public static void main(String[] args)
    {
        Animal animal = new Animal();
        Animal animal2 = new Animal("Hachi", "http://hachi.jpg", 1);
        Animal animal3 = new Animal()
                .setName("Hachi")
                .setPhotoUrl("photo");


        //Polymorphism
        CatDTO catDTO = new CatDTO("Machi", "photo", 1);
        Animal catAnimal = new CatDTO("Zoro", "photo", 2);

        catDTO.speak();
        catAnimal.speak();
    }
}
