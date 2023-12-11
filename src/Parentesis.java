import java.util.Scanner;
import java.util.Stack;

public class Parentesis {
    public static boolean esBalanceada(String cadena){
        Stack<String> anteriores = new Stack<>();
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '('){
                anteriores.push("(");
                contador++;
            } else if (cadena.charAt(i) == '[') {
                anteriores.push("[");
                contador++;
            }else if (cadena.charAt(i) == '{'){
                anteriores.push("{");
                contador++;
            } else if (cadena.charAt(i) == ')') {
                if (anteriores.pop() != "("){
                    return false;
                }else {
                    contador--;
                    if (contador < 0){
                        return false;
                    }
                }
            } else if (cadena.charAt(i) == ']') {
                if (anteriores.pop() != "["){
                    return false;
                }else {
                    contador--;
                    if (contador < 0){
                        return false;
                    }
                }
            } else if (cadena.charAt(i) == '}') {
                if (anteriores.pop() != "{"){
                    return false;
                }else {
                    contador--;
                    if (contador < 0){
                        return false;
                    }
                }
            }
        }
        if (contador == 0){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        String cadena;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        cadena = scanner.next();
        if (esBalanceada(cadena)){
            System.out.println("Esta balanceada");
        }else {
            System.out.println("No esta balanceada");
        }
    }
}


