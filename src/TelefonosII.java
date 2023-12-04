import java.util.*;

public class TelefonosII {
    public static Map<String, ArrayList<Integer>> Numeros(){
        Map<String, ArrayList<Integer>> numeros = new HashMap<>();
        numeros.put("Pedro", (ArrayList<Integer>) Arrays.asList(691876654,654546372));
        numeros.put("Juan", (ArrayList<Integer>) Arrays.asList(662537920,688333999,654456738));
        numeros.put("Maria", (ArrayList<Integer>) Arrays.asList(619028564,678028000));
        numeros.put("Manolo", (ArrayList<Integer>) Arrays.asList(692010222));
        return numeros;
    }


    public static String Numeros(String contacto, Map<String, Integer> numeros){
        String numerosContacto = "";
        ArrayList<Integer> numerosArray = new ArrayList<>();
        numerosArray.add(numeros.get(contacto));
        for (int i = 0; i < numerosArray.size(); i++) {
           numerosContacto += numerosArray.get(i) + ", ";
        }
        return numerosContacto;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contacto;
        System.out.println("Introduce un contacto: ");
        contacto = scanner.next();
        System.out.println("Los numeros de " + contacto + " son " + Numeros());

    }
}
