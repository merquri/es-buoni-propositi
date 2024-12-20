import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // buoni propositi

        // todo: mostrare 5 buoni propositi all'avvio
        // chiedere all'utente di indicare quale dei propositi è stato conseguito
        // mostra la lista aggiornata
        // continua a chiedere fino a quando tutti i propositi saranno conseguito

        Scanner sc = new Scanner(System.in);

        ArrayList<String> propositi = new ArrayList<>() {{
            add("Trovare un lavoro");
            add("Fare più attività fisica");
            add("Fare un progetto con Java");
            add("Trasferirsi in Portogallo");
            add("Andare al mare");
        }};

        for (String n : propositi)
        System.out.println(n);
    }
}
