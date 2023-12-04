import java.util.ArrayList;

public class AddAll {
    public static ArrayList<Integer> Añadir(ArrayList<Integer> numeros1, ArrayList<Integer> numeros2){
       numeros1.addAll(numeros2);
        return numeros1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> numeros1 = new ArrayList<>();
        ArrayList<Integer> numeros2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numeros1.add(i);
            numeros2.add(i+5);
        }
        ArrayList<Integer> añadidos = new ArrayList<>();
        añadidos = Añadir(numeros1,numeros2);
        for (int i = 0; i < añadidos.size(); i++) {
            System.out.print(añadidos.get(i) + " ");
        }
    }
}
