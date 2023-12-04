import java.util.ArrayList;

public class ConvertirArray {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        int[] numerosArray = new int[numeros.size()];
        for (int i = 0; i < numeros.size(); i++) {
            numerosArray[i] = numeros.get(i);
        }
        for (int i = 0; i < numerosArray.length; i++) {
            System.out.println(numerosArray[i]);
        }
    }
}
