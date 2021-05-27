package com.p5.adoptions.model.adapters;

import com.p5.adoptions.model.CatDTO;
import com.p5.adoptions.model.DogDTO;
import com.p5.adoptions.repository.cats.Cat;
import com.p5.adoptions.repository.dogs.Dog;

import java.util.ArrayList;
import java.util.List;

public class DogAdapter {

    public static Dog fromDto(DogDTO dogDTO) {
        if(dogDTO.getName().equals("")) {
            dogDTO.setName("Generic dog");
        }
        return (Dog) new Dog().setName(dogDTO.getName()).setPhotoUrl(dogDTO.getPhotoUrl());
    }

    public static DogDTO toDto(Dog dog) {
        return new DogDTO(dog.getName(), dog.getPhotoUrl(), dog.getId());
    }

    public static List<DogDTO> toListDto(List<Dog> dogList) {
        List<DogDTO> dogDTOList = new ArrayList<>();

        dogList.forEach(dog -> dogDTOList.add(toDto(dog)));

        return dogDTOList;
    }

    public static List<Dog> fromListDto(List<DogDTO> dogDTOList) {
        List<Dog> dogs = new ArrayList<>();

        dogDTOList.forEach(dogDTO -> dogs.add(fromDto(dogDTO)));

        return dogs;
    }
}
