import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Coches {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<>();
        String coche;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Introduce coches (linea en blanco para acabar): ");
            coche = scanner.next();
            if (!coche.isEmpty()) {
                coches.add(coche);
            }
        }while (!coche.isEmpty());
        Collections.sort(coches);
        System.out.println(coches);
    }
}
