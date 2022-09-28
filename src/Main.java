import model.Donkey;
import model.Horse;

public class Main {
    public static void main(String[] args) {
        Donkey donkey = new Donkey("Burrito Pacheco");
        Donkey donkey2 = new Donkey("Andres el burro");
        System.out.println("Tenemos dos burros, se llaman: \n" + donkey.getName() + "\n" + donkey2.getName());
    }
}