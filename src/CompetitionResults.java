import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompetitionResults {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final String outFileName = "stats_out.csv";
        List<Person> persons = new ArrayList<>();

            while (Person < 5) {
                System.out.println("Podaj wynik kolejnego gracza (lub 0 - stop):");
                String userInput = sc.nextLine();
                Person++;
                if (userInput.equals("0")) {
                    break;
                }
                String[] userParts = userInput.split(" ");
                Person newPerson = new Person(userParts[0], userParts[1], Integer.parseInt(userParts[2]));
                persons.add(newPerson);
        }
        System.out.println("Dane posortowano i zapisano do pliku stats.csv.");
    }
}







