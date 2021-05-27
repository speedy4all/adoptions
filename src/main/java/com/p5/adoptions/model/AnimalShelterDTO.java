package com.p5.adoptions.model;


import com.p5.adoptions.model.validations.OnCreate;
import com.p5.adoptions.model.validations.OnUpdate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.List;

public class AnimalShelterDTO
{
    @Null(groups = OnCreate.class)
    @NotNull(groups = OnUpdate.class)
    private Integer id;

    @NotNull
    @NotBlank(message = "Must have value")
    private String name;

    @NotBlank
    @NotNull
    private String address;
    List<AnimalDTO> animals = new ArrayList<>();

    public Integer getId()
    {
        return id;
    }

    public AnimalShelterDTO setId(Integer id)
    {
        this.id = id;
        return this;
    }

    public String getName()
    {
        return name;
    }

    public AnimalShelterDTO setName(String name)
    {
        this.name = name;
        return this;
    }

    public String getAddress()
    {
        return address;
    }

    public AnimalShelterDTO setAddress(String address)
    {
        this.address = address;
        return this;
    }

    public List<AnimalDTO> getAnimals()
    {
        return animals;
    }

    public AnimalShelterDTO setAnimals(List<AnimalDTO> animals)
    {
        this.animals = animals;
        return this;
    }
}
