import java.util.ArrayList;
import java.util.HashSet;

public class Farm {

    private Farmer farmer;
    private int area = 100;
    private HashSet<Flower> types = new HashSet<>();
    private ArrayList<Flower> flowers = new ArrayList<>();

    public void add(Flower flower){
        types.add(flower);
        if(types.size() < 5){
            flowers.add(flower);
        }
    }

}
