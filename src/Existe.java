import java.util.ArrayList;

public class Existe {

    public static boolean existe(ArrayList<Integer> numeros){
        return numeros.contains(3);
    }
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numeros.add(i);
        }
        if (existe(numeros)){
            System.out.println("Existe");
        }else {
            System.out.println("No existe");
        }

    }
}
