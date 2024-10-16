//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Date date = new Date(1, 2, 2014);
        System.out.println(date);
        date.setMonth(12);
        date.setDay(9);
        date.setYear(2099);
        System.out.println(date);
        System.out.println("Month: " + date.getMonth());
        System.out.println("Day: " + date.getDay());
        System.out.println("Year: " + date.getYear());

        date.setDate(3, 4, 2016);
        System.out.println(date);
    }
}