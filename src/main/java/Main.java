public class Main {
    public static void main(String[] args) {

        User user = new User();
        Calendar calendar = new Calendar();
        calendar.print(user.requestDate());

    }
}

/*
3. KalendarzStwórz program, który przyjmuje jako argumenty miesiąc oraz rok,
a następnie drukuje kalendarz dni w tym miesiącu. Tygodnie powinny byćdrukowane
w osobnychrzędach, natomiast dni tygodnia w osobnych kolumnach. Przykład:
11/2019PNWT ŚR CZ PT SB ND01 02 0304 05 06 07 08 09 1011 12 13 14 15 16 1718 19 20 21 22 23 2425 26 27 28 29 30
Podpowiedzi:
1.Aby sprawdzić na obiekcie typu LocalDate dzień tygodnia, możesz użyć metodyget DayOfWeek()
https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html#getDayOfWeek--
2.Aby uzyskać wszystkie dni miesiąca można np.dodawać w pętli po jednym dniu do daty, aż nie zmieni
( co możesz sprawdzać metodą getMonth()albo getMonthValue())
https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html#getMonth--
3.Aby mieć większą kontrolę nad tym, co drukujesz, możesz skorzystać z metody System.out.printf()
–szczegóły na temat formatowania tekstu możesz znaleźć tu:
 https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.htmlPrzykładowo,
aby wydrukować „01”zamiast „1”, możesz napisać:System.out.printf("%02d", 1);
*/