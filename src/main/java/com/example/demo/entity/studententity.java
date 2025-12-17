package com.example.demo.entity;

import jakarta.persistance.*;
import jakarta.validation.constraints.*;

@Entity
public class studententity{

    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is not valid")
    private String name;

    @Email(message = "Email Format is not valid.")
    private String email;

    public void setID(Long id){
        this.id = id;
    }

    public Long getID(){
        return id;ogihdfxb
    }

    public studententity(){
 
    }

    public studententity(Long id,String name,String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    

}