import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorVisitasPaginas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> paginas = new HashMap<>();

        String pagina;

        do {
            System.out.println("Escribe el nombre de la página");
            pagina = sc.nextLine();
            if (pagina.equalsIgnoreCase("fin")){
                System.out.println(paginas.entrySet());
            } else {
                if (paginas.containsKey(pagina)){
                    paginas.put(pagina, paginas.get(pagina) + 1);
                } else{
                    paginas.put(pagina, 1);
                }
            }
        } while (!pagina.equalsIgnoreCase("fin"));
    }
}
