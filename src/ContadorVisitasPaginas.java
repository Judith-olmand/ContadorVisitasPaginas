import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorVisitasPaginas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> paginas = new HashMap<>();

        String nombre;

        do {
            System.out.println("Introduce el nombre del pagina: ");
            nombre = sc.nextLine();
            if(nombre.equalsIgnoreCase("fin")){
                break;
            } else {
                if(paginas.get(nombre) == null){
                    paginas.put(nombre, 1);
                } else {
                    paginas.put(nombre, paginas.get(nombre) + 1);
                }
            }
        }while (!nombre.equalsIgnoreCase("fin"));

        for(String pagina: paginas.keySet()){
            System.out.println(pagina + " : " + paginas.get(pagina));
        }

        for (var pagina: paginas.entrySet()){
            System.out.println("Página: " + pagina.getKey() + " - Numero de veces visitada: " + pagina.getValue());
        }
    }
}
