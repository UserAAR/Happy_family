package Happy_family_hw2;


import java.util.Arrays;
import java.util.Random;

public class Human implements IHuman {
    Random rand = new Random();
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedula;
    private Family family;

    public Human(String name, String surname, int year, int iq, String[][] schedula) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedula = schedula;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }


    public Human() {
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
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


    public String[][] getSchedula() {
        return schedula;
    }

    public void setSchedula(String[][] schedula) {
        this.schedula = schedula;
    }

    @Override
    public void greetpet() {
        System.out.println("Hello, " + family.getPet().getNickname());
    }

    @Override
    public void describePet() {
        System.out.println("I have an " + family.getPet().getSpecies() + " is " + family.getPet().getAge() + " years old, he is " + (family.getPet().getTrickLevel() > 50 ? "very sly" : "almost no sly"));
    }

    public void feedPet() {
        if (family.getPet().getTrickLevel() < rand.nextInt(100)) {
            System.out.println("Hm... I will feed Jack's " + family.getPet().getNickname() + "I think " + family.getPet().getNickname() + " is hungry.");
        } else {
            System.out.println("Hm... I won't feed Jack's " + family.getPet().getNickname() + " I think " + family.getPet().getNickname() + " is not hungry.");
        }
    }


    public String toString() {
        return "Human{name=" + getName() + ", surname=" + getSurname() + ", year=" + getYear() + ", iq=" + getIq() + ", schedule=" + Arrays.toString(getSchedula()) + "}";
    }
}
