import java.util.*;

public class TelefonosII {
    public static Map<String, List<String>> Numeros() {
        Map<String, List<String>> numeros = new HashMap<>();
        numeros.put("Pedro", Arrays.asList("691876654", "654546372"));
        numeros.put("Juan", Arrays.asList("662537920", "688333999", "654456738"));
        numeros.put("Maria", Arrays.asList("619028564", "678028000"));
        numeros.put("Manolo", Arrays.asList("692010222"));
        return numeros;
    }


    public static void main(String[] args) {
        //OK
        Scanner scanner = new Scanner(System.in);
        String contacto;
        System.out.println("Introduce un contacto: ");
        contacto = scanner.next();
        Map<String, List<String>> numeros = Numeros();
        System.out.println(numeros.get(contacto));
    }
}

