import java.util.ArrayList;
import java.util.Collections;

public class Coches {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<>();
        coches.add("Toyota");
        coches.add("Seat");
        coches.add("Volvo");
        for (String coche : coches) {
            System.out.println(coche);
        }
        Collections.sort(coches);
        for (String coche : coches) {
            System.out.println(coche);
        }
    }
}
