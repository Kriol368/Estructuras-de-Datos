import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {

    public static Map<String, String> Capitales(){
        Map<String, String> capitales = new HashMap<>();
        capitales.put("España", "Madrid");
        capitales.put("Francia", "París");
        capitales.put("Inglaterra", "Londres");
        capitales.put("Italia", "Roma");
        return capitales;
    }


    public static String Capital(String pais, Map<String, String> capitales){
        return capitales.get(pais);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pais;
        System.out.println("Introduce un pais: ");
        pais = scanner.next();
        System.out.println("La capital de " + pais + " es " + Capital(pais,Capitales()));
    }
}
