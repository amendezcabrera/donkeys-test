import model.Donkey;
import model.Horse;

public class Main {
    public static void main(String[] args) {
        Donkey donkey = new Donkey("Burrito Pacheco");
        Horse horse = new Horse();
        System.out.println("Nuestro burro se llama " + donkey.getName());
        System.out.println("Tambien tenemos un caballo");
        System.out.println("Tiene cola? " + horse.hasTail());
        if(!horse.hasCrin()){
            System.out.println("Tiene crin!!!");
        }else{
            System.out.println("No tiene crin!!!");
        }
    }
}