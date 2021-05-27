package com.p5.adoptions.model;

import org.springframework.lang.NonNull;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class AnimalDTO {

    @NotNull
    protected Integer id;

    @NotEmpty(message = "Name can not be empty")
    protected String name;
    protected String photoUrl;

    public AnimalDTO()
    {
    }

    public AnimalDTO(String name, String photoUrl, Integer id)
    {
        this.name = name;
        this.photoUrl = photoUrl;
        this.id = id;
    }

    public void speak()
    {
        System.out.println("Animal speaks!");
    }

    protected void walk()
    {
        System.out.println("Animal walks!");
    }

    public String getName()
    {
        return this.name;
    }

    public AnimalDTO setName(String newName)
    {
        this.name = newName;
        return this;
    }

    public String getPhotoUrl()
    {
        return photoUrl;
    }

    public AnimalDTO setPhotoUrl(String photoUrl)
    {
        this.photoUrl = photoUrl;
        return this;
    }
    public Integer getId() {
        return id;
    }

    public AnimalDTO setId(Integer id) {
        this.id = id;
        return this;
    }
}
