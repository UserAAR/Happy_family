package Happy_family_hw2;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("dog", "rock", 7, 55, new String[]{"eat", "drink", "sleep"});
        System.out.println(pet);
        Family family = new Family(new Human("Leyla", "Soltanova", 1994, 86, new String[0][0]), new Human("Rufet", "Soltanov", 1991, 94, new String[0][0]));
        family.addChild(new Human("Ceyhun", "Soltanov", 2015, 91, new String[0][0]));
        family.addChild(new Human("Zeyd", "Soltanov", 2017, 99, new String[0][0]));
        family.addChild(new Human("Firuze", "Soltanova", 2021, 89, new String[0][0]));
        family.addChild(new Human("Ferid", "Soltanov", 2021, 75, new String[0][0]));


        System.out.println("--------------------------------------------\n" +
                "Children info-->");
        family.deleteChild(1);
        family.deleteChild(new Human("Firuze", "Soltanova", 2021, 89, new String[0][0]));

        for (Human child : family.getChildren()) {
            System.out.println(child);
        }

        System.out.println("--------------------------------------------\n" +
                "Father info-->");
        System.out.println(family.getFather());
        System.out.println("--------------------------------------------\n" +
                "Mother info-->");
        System.out.println(family.getMother());
        System.out.println("--------------------------------------------\n" +
                "Pet info-->");
        family.setPet(pet);
        System.out.println(family.getPet());

        System.out.println("--------------------------------------------\n" +
                "Count info-->");
        System.out.println(family.countFamily());

        System.out.println("--------------------------------------------\n" +
                "Family info-->");
        System.out.println(family);


    }
}
