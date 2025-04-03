package com.example.ex6.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_cat")
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK_Cat")
    private Integer id;
    
    @Column(name = "Name", length = 50)
    private String nom;
    
    @Column(name = "Birthdate")
    @Temporal(TemporalType.DATE)
    private Date birthdate;

    @ManyToOne
    @JoinColumn(name = "FK_Breed", referencedColumnName = "PK_Breed")
    private Breed breed;

    @Column(name = "FunFact", length = 255)
    private String funFact;

    @Column(name = "Description", length = 500)
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return nom;
    }

    public void setName(String nom) {
        this.nom = nom;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public String getFunFact() {
        return funFact;
    }

    public void setFunFact(String funFact) {
        this.funFact = funFact;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
