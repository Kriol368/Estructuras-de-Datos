import java.util.HashMap;
import java.util.Map;

public class LaMejorTerminacion {

    public static Map<Character, Integer> terminaciones(String ... numeros){
        Map<Character,Integer> terminaciones = new HashMap<>();
        for (int i = 0; i < numeros.length; i++) {
            char ultimo = (numeros[i].charAt(numeros[i].length()-1));
            if (terminaciones.containsKey(ultimo)){
                int valor = terminaciones.get(ultimo) + 1;
                terminaciones.replace(ultimo,valor);
            }else {
                terminaciones.put(ultimo, 1);
            }
        }
        return terminaciones;
    }


    public static void main(String[] args) {
        System.out.println(terminaciones("00004", "03847", "39804"));
        System.out.println(terminaciones("58975", "25894", "52985", "98598"));
    }
}
