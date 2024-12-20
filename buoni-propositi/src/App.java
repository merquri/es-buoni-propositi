import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // buoni propositi

        Scanner sc = new Scanner(System.in);

        // creo arraylist di stringhe e aggiungo i propositi

        ArrayList<String> listaPropositi = new ArrayList<>() {{
            add("Trovare un lavoro");
            add("Fare piu' attivita' fisica");
            add("Fare un progetto con Java");
            add("Trasferirsi in Portogallo");
            add("Andare al mare");
        }};

        // ciclo per la rimozione dei propositi

        while (!listaPropositi.isEmpty()) {
            // mostro la lista dei propositi, con un if che mette la virgola se l'indice non è l'ultimo
            System.out.println("\n\nI buoni propositi per il 2025 sono:");
        for (int i = 0; i < listaPropositi.size(); i++) {
        System.out.print(listaPropositi.get(i));
        if (i != listaPropositi.size() - 1) System.out.print(", "); }

        // chiedo all'utente di inserire il proposito che ha conseguito
        System.out.println("\n\nQuale proposito hai conseguito?");
        String propositoIn = sc.nextLine();

        // controllo se il proposito è presente in lista, altrimenti lo rimuovo
        if (!listaPropositi.remove(propositoIn)) {
            System.out.println("Questo proposito non è presente in lista.");
        } listaPropositi.remove(propositoIn);
    }

    System.out.println("Congratulazioni! Hai realizzato tutti i tuoi propositi del 2025!");

        sc.close();
    }
}
