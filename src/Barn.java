import java.util.ArrayList;

public class Barn {

    private ArrayList<Animal> smallAnimals = new ArrayList<>();
    private ArrayList<Animal> bigAnimals = new ArrayList<>();

    public void add(Animal animal){
        if(animal.size.equals(Size.BIG) && bigAnimals.size() <= 10){
            bigAnimals.add(animal);
        }else {
            System.out.println("full");
        }
        if(animal.size.equals(Size.SMALL) && smallAnimals.size() <= 10){
            smallAnimals.add(animal);
        }else {
        System.out.println("full");
        }
    }

    public void remove(Animal animal){
        if(animal.size.equals(Size.BIG) && bigAnimals.size() > 0){
            bigAnimals.add(animal);
        }else {
            System.out.println("empty");
        }
        if(animal.size.equals(Size.SMALL) && smallAnimals.size() <= 10){
            smallAnimals.add(animal);
        }else {
            System.out.println("empty");
        }
    }

}
