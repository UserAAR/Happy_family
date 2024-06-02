package Happy_family_hw1;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("dog","rock",7,55, new String[]{"eat", "drink", "sleep"});
        System.out.println(pet);
        Human hum = new Human("Rustem","Besirli",1988,98,pet,new Human("leyla","seferli",2001,87,pet,new Human(),new Human(),new String[][]{{"Wednesday"},{"Do homework"}}),new Human("sefer","seferli",2003,87,pet,new Human(),new Human(),new String[][]{{"Thursday"},{"Do homework"}}),new String[][]{{"Friday"},{"Sleep"}});
        System.out.println(hum);
        hum.feedPet();
    }
}
