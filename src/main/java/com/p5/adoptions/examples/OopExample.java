package com.p5.adoptions.examples;

import com.p5.adoptions.model.AnimalDTO;
import com.p5.adoptions.model.CatDTO;

public class OopExample
{

    public static void main(String[] args)
    {
        AnimalDTO animal = new AnimalDTO();
        AnimalDTO animal2 = new AnimalDTO("Hachi", "http://hachi.jpg", 1);
        AnimalDTO animal3 = new AnimalDTO()
                .setName("Hachi")
                .setPhotoUrl("photo");


        //Polymorphism
        CatDTO catDTO = new CatDTO("Machi", "photo", 1);
        AnimalDTO catAnimal = new CatDTO("Zoro", "photo", 2);

        catDTO.speak();
        catAnimal.speak();
    }
}
