import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class User {

    public LocalDate requestDate() {
        LocalDate date;
        try {
            System.out.println("Type date in pattern: MM/uuuu");
            Scanner scanner = new Scanner(System.in);
            String dateString = scanner.nextLine();
            String dateStringTable[] = dateString.split("/");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            date = LocalDate.parse("01/" + dateStringTable[0] + "/" + dateStringTable[1], formatter);

        } catch (Exception e) {
            throw new RuntimeException("Incorrect input. \n" + e);
        }

        return date;

    }
}
