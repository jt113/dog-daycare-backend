package com.example.dogdaycare.entity;
import javax.persistence.*;
@Entity
@Table(name="dog")
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="breed")
    private String breed;

    @Column(name="diet_preferences")
    private String dietPreferences;

    @Column(name="img_profile")
    private String imgProfile;

    @Column(name="owner_id")
    private int ownerId;

    public Dog(){}
    public Dog(String firstName, String lastName, String breed, String dietPreferences, String imgProfile, int ownerId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.breed = breed;
        this.dietPreferences = dietPreferences;
        this.imgProfile = imgProfile;
        this.ownerId = ownerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getDietPreferences() {
        return dietPreferences;
    }

    public void setDietPreferences(String dietPreferences) {
        this.dietPreferences = dietPreferences;
    }

    public String getImgProfile() {
        return imgProfile;
    }

    public void setImgProfile(String imgProfile) {
        this.imgProfile = imgProfile;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", breed='" + breed + '\'' +
                ", dietPreferences='" + dietPreferences + '\'' +
                ", imgProfile='" + imgProfile + '\'' +
                ", ownerId=" + ownerId +
                '}';
    }
}
