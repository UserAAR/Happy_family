package Happy_family_hw2;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[]{};
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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void deleteChild(Human child) {
        Human[] newChildren = new Human[getChildren().length - 1];
        int k = 0;
        for (int i = 0; i < newChildren.length; i++) {
            if (getChildren()[i].hashCode() == child.hashCode() || getChildren()[i].equals(child)) {
                continue;
            } else {
                newChildren[k] = children[i];
                k += 1;
            }
        }
        setChildren(newChildren);
    }

    public boolean deleteChild(int index) {
        Human[] newChildren = new Human[getChildren().length - 1];
        int counter = 0;
        int k = 0;
        for (Human child : getChildren()) { //Ceyhun,Zeyd,Firuze
            if (counter != index) {
                newChildren[k] = child;//0-->Ceyhun counter=1
                if (child.hashCode() == getChildren()[index].hashCode()) {
                    return false;
                }
                counter += 1;
                k += 1;
            } else {
                counter += 1;
            }
        }
        setChildren(newChildren);
        return true;
    }

    public void addChild(Human child) {
        Human[] newChildren = new Human[getChildren().length + 1];
        int k = 0;
        for (Human childs : getChildren()) {
            newChildren[k] = childs;
            k += 1;
        }
        newChildren[k] = child;
        setChildren(newChildren);
    }

    public int countFamily() {
        return 2 + getChildren().length;
    }


    public String toString() {
        return "Mother = "+getMother().getName() + "," +"Father = " + getFather().getName() + "," + Arrays.toString(children) + " " + getPet();
    }

}
