import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos {
    public static Map<String, Integer> Numeros(){
        Map<String, Integer> numeros = new HashMap<>();
        numeros.put("Pedro", 678356748);
        numeros.put("Juan", 692826770);
        numeros.put("Maria", 642128890);
        numeros.put("Manolo", 647338992);
        return numeros;
    }


    public static int Numero(String contacto, Map<String, Integer> numeros){
        return numeros.get(contacto);
    }
    public static void main(String[] args) {
        //OK
        Scanner scanner = new Scanner(System.in);
        String contacto;
        System.out.println("Introduce un contacto: ");
        contacto = scanner.next();
        System.out.println("El numero de " + contacto + " es " + Numero(contacto,Numeros()));
    }
}
