import java.time.LocalDate;

public class Calendar {
    private static final int DAYS_IN_WEEK = 7;

    public void print(LocalDate date) {

        LocalDate datePrint = date.minusDays(date.getDayOfMonth() - 1);

        System.out.println("PN WT ŚR CZ PT SB ND");
        int k=0;

        for (int i = 0; i < DAYS_IN_WEEK; i++) {
            if (datePrint.getDayOfWeek().getValue() > i+1 ) {
                System.out.printf("   ");
                k++;
            } else {
                break;
            }
        }

        for (int j = 0; j < date.getMonth().length(date.isLeapYear()); j++) {

            if ((j+k) % DAYS_IN_WEEK == 0 && (j+k)>0) {
                System.out.printf("\n");
            }

            System.out.printf("%02d ", datePrint.plusDays(j).getDayOfMonth());



        }


    }
}
