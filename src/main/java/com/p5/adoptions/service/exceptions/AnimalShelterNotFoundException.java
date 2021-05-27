package com.p5.adoptions.service.exceptions;

public class AnimalShelterNotFoundException extends RuntimeException {

    public AnimalShelterNotFoundException() {
    }

    @Override
    public String getMessage() {
        return "Animal shelter not found";
    }
}
