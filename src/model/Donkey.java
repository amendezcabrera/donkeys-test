package model;

public class Donkey extends Animal{
    public Donkey(String name) {
        this.name = "Pepito";
    }

    boolean tail = true;
    String name = "";

    public boolean hasTail() {
        return tail;
    }

    public String getName() {
        return name;
    }
}
