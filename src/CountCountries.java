import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CountCountries {


    public static void cuantosPaises(String line, Map<String,Integer> paises){
        String[] actual = line.split(",");
        String pais = actual[6];

        if (paises.containsKey(pais)){
            int numero = paises.get(pais) + 1;
            paises.replace(pais, numero);
        }else {
            paises.put(pais, 1);
        }
    }


    public static void main(String[] args) throws IOException {
        //OK
        String filePath = new File("").getAbsolutePath();
        filePath = filePath.concat("/src/Colfuturo-Seleccionados.csv");
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        Map<String, Integer> paises = new HashMap<>();
        while ((line = reader.readLine()) != null) {
            cuantosPaises(line, paises);
        }
        reader.close();
        System.out.println(paises);

    }
}
