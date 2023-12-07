import java.util.ArrayList;
import java.util.Scanner;

public class Altura {

    public static int numeroAlumnos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero de alumnos: ");
        return scanner.nextInt();
    }


    public static ArrayList<Double> leerAlturas(int numAlumnos){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> alturas = new ArrayList<>();
        System.out.println("Introduce las alturas de los alumnos: ");
        for (int i = 0; i < numAlumnos; i++) {
            alturas.add(scanner.nextDouble());
        }
        return alturas;
    }


    public static double calcularMedia(ArrayList<Double> alturas){
        double media = 0;
        for (int i = 0; i < alturas.size(); i++) {
            media+= alturas.get(i);
        }
        return media/alturas.size();
    }


    public static int calcularAlumnosAlturaSuperior(ArrayList<Double> alturas, double media){
        int alumnosAlturaSuperior=0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) > media){
                alumnosAlturaSuperior++;
            }
        }
        return alumnosAlturaSuperior;
    }


    public static int calcularAlumnosAlturaInferior(ArrayList<Double> alturas, double media){
        int alumnosAlturaInferior=0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) < media) {
                alumnosAlturaInferior++;
            }
        }
        return alumnosAlturaInferior;
    }


    public static void mostrarResultados(ArrayList<Double> alturas,  double media){
        System.out.println("Alturas de los alumnos: ");
        for (int i = 0; i < alturas.size(); i++) {
            System.out.print(alturas.get(i) + " ");
        }
        System.out.println();
        System.out.println("Media de las alturas: " + media);
        System.out.println("Numero alumnos superior a la media: " + calcularAlumnosAlturaSuperior(alturas,media));
        System.out.println("Numero alumnos inferior a la media: " + calcularAlumnosAlturaInferior(alturas,media));
    }


    public static void main(String[] args) {
        int numAlumnos = numeroAlumnos();
        ArrayList<Double> alturas = leerAlturas(numAlumnos);
        mostrarResultados(alturas, calcularMedia(alturas));
    }
}
