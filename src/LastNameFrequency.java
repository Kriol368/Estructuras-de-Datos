import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LastNameFrequency {


    public static void añadirAMapa(Map<String, String> apellidos, String line){
        String[] actual = line.split(",");
        if (actual.length == 2) {
            apellidos.put(actual[0], actual[1]);
        }else {
            System.out.println(line);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/media/alu10728670/Nuevo vol 3/Programación/IdeaProjects/Estructuras-de-Datos/src/LastnameFrequencies.csv"));
        String line;
        Map <String, String> apellidos = new HashMap<>();
        while ((line = reader.readLine()) != null) {
            añadirAMapa(apellidos,line);
        }
        reader.close();
        Scanner scanner = new Scanner(System.in);
        String entrada;
        System.out.println("Introduce apellidos");
        do {
            entrada = scanner.next();
            if (apellidos.containsKey(entrada)) {
                System.out.println(apellidos.get(entrada));
            }
        }while (scanner.hasNext());

    }
}
