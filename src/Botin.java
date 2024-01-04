import java.util.HashMap;
import java.util.Map;

public class Botin {


    public static String repartir(int participantes, int ... billetes){
        Map<Integer, String> recompensa = new HashMap<>();
        for (int i = 0; i < participantes; i++) {
            recompensa.put(i, "");
        }
        int contador = 0;
        for (int i = 0; i < billetes.length; i++) {
            recompensa.replace(contador, recompensa.get(contador) + billetes[i] + " ");
            if (contador < participantes - 1){
                contador++;
            }else {
                contador = 0;
            }
        }

        return recompensa.toString();
    }

        public static void main(String[] args) {
            //OK
            System.out.println(repartir(2, 10, 20, 50, 200, 500));
            System.out.println(repartir( 3, 50, 20, 100, 200, 500, 10, 50));
    }
}
