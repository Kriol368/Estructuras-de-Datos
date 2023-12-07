import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Regalos {

    public static String reparte(int aterriza, Integer ... numeros){
        ArrayList<Integer> portales = new ArrayList<>();
        Arrays.sort(numeros);
        Collections.addAll(portales,numeros);
        String regalos = "";
        int actual = aterriza;
        int masCercano = 0;
        int distancia = Integer.MAX_VALUE;
        do {
            for (int i = 0; i < portales.size(); i++) {
                if (Math.abs(portales.get(i) - actual) < distancia) {
                    distancia = Math.abs(portales.get(i) - actual);
                    masCercano = i;
                } else if (Math.abs(portales.get(i) - actual) == distancia) {
                    if (portales.get(i) > portales.get(masCercano)) {
                        distancia = Math.abs(portales.get(i) - actual);
                        masCercano = i;
                    }
                }
            }
            regalos += portales.get(masCercano) + ", ";
            actual = portales.get(masCercano);
            portales.remove(masCercano);
            masCercano = 0;
            distancia = Integer.MAX_VALUE;
        }while (!portales.isEmpty());
        return regalos;
    }
    public static void main(String[] args) {
        System.out.println(reparte(0, 2, 4));
        System.out.println(reparte(3,2,5,1));
        System.out.println(reparte(3,2,4,7));
    }
}
