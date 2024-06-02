package Happy_family_hw1;

import java.util.Random;
public class Human implements IHuman {
    Random rand = new Random();
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedula;

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedula) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedula = schedula;
    }
    public Human(String name,String surname,int year,Human mother,Human father){
        this(name,surname,year);
    }
    public Human(String name,String surname,int year){
        this.name = name;
        this.surname = surname;
        this.year = year;
    }


    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedula() {
        return schedula;
    }

    public void setSchedula(String[][] schedula) {
        this.schedula = schedula;
    }

    @Override
    public void greetpet() {
        System.out.println("Hello, " + pet.getNickname());
    }

    @Override
    public void describePet() {
        System.out.println("I have an " + pet.getSpecies() + " is " + pet.getAge() + " years old, he is " + (pet.getTrickLevel() > 50 ? "very sly" : "almost no sly"));
    }
    public void feedPet(){
        if(pet.getTrickLevel()<rand.nextInt(100)){
            System.out.println("Hm... I will feed Jack's "+pet.getNickname()+"I think "+pet.getNickname()+" is hungry.");
        }else{
            System.out.println("Hm... I won't feed Jack's "+pet.getNickname()+" I think "+pet.getNickname()+" is not hungry.");
        }
    }


    public String toString() {
        return "Human{name=" + getName() + ",surname=" + getSurname() + ", year=" + getYear() + ", iq=" + getIq() + ", mother=" + getMother().getName() + " " + getMother().getSurname() + ", father=" + getFather().getName() + " " + getFather().getSurname() + ", pet=" + getPet() + "}";
    }

}
