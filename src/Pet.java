package Happy_family_hw1;

import java.util.Arrays;

public class Pet implements IPet {

    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;
    public Pet(String species,String nickname){
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.habits = habits;
        if (0 < trickLevel && trickLevel < 101) {
            this.trickLevel = trickLevel;
        } else {
            System.out.println("Please enter about 1-100");
        }
    }
    public Pet(){}

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        if (0 < trickLevel && trickLevel < 101) {
            this.trickLevel = trickLevel;
        } else {
            System.out.println("Please enter about 1-100");
        }

    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    @Override
    public void eat() {
        System.out.println("I am eating");
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am " + nickname + ". I miss you!");
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up");
    }

    public String toString() {
        return species + "{nickname=" + nickname + ", age=" + age + ", trickLevel=" + trickLevel + ", habits" + Arrays.toString(habits) + "}";
    }
}
