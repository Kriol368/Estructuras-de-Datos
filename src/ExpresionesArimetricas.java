import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ExpresionesArimetricas {

    public static int pila(String operacion){
        String[] valores = operacion.split(" ");
        Stack<String> digitos= new Stack<>();
        for (int i = 0; i < valores.length; i++) {
            if((valores[i].equals("+")) || (valores[i].equals("-")) || (valores[i].equals("*")) || (valores[i].equals("/"))){
                int operando2 = Integer.parseInt(digitos.pop());
                int operando1 = Integer.parseInt(digitos.pop());
                switch (valores[i]){
                    case "+":
                        digitos.push(String.valueOf(operando1 + operando2));
                        break;
                    case "-":
                        digitos.push(String.valueOf(operando1 - operando2));
                        break;
                    case "*":
                        digitos.push(String.valueOf(operando1 * operando2));
                        break;
                    case "/":
                        digitos.push(String.valueOf(operando1 / operando2));
                        break;
                }
            }else {
                digitos.push((valores[i]));
            }
        }
        return  Integer.parseInt(digitos.pop());
    }

    public static int cola(String operacion){
        String[] valores = operacion.split(" ");
        Queue<String> digitos = new LinkedList<String>();

        for (int i = 0; i < valores.length; i++) {
            if((valores[i].equals("+")) || (valores[i].equals("-")) || (valores[i].equals("*")) || (valores[i].equals("/"))){
                int operando2 = Integer.parseInt(digitos.poll());
                int operando1 = Integer.parseInt(digitos.poll());
                switch (valores[i]){
                    case "+":
                        digitos.add(String.valueOf(operando1 + operando2));
                        break;
                    case "-":
                        digitos.add(String.valueOf(operando1 - operando2));
                        break;
                    case "*":
                        digitos.add(String.valueOf(operando1 * operando2));
                        break;
                    case "/":
                        digitos.add(String.valueOf(operando1 / operando2));
                        break;
                }
            }else {
                digitos.add((valores[i]));
            }
        }
        return  Integer.parseInt(digitos.poll());
    }


    public static void main(String[] args) {
        String operacion;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una operación: ");
        operacion = scanner.nextLine();
        System.out.println("Cola: " + cola(operacion));
        System.out.println("Pila: " + pila(operacion));
    }
}
