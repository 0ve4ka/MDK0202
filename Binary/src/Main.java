import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer> > holidays = new HashMap<>();

        ArrayList<Integer> dates = new ArrayList<>();
        dates.add(1);
        dates.add(7);
        holidays.put("Январь",dates);

        dates = new ArrayList<>();
        dates.add(23);
        holidays.put("Февраль",dates);

        dates = new ArrayList<>();
        dates.add(8);
        holidays.put("Март",dates);

        dates = new ArrayList<>();
        dates.add(1);
        dates.add(9);
        holidays.put("Май",dates);

        dates = new ArrayList<>();
        dates.add(12);
        holidays.put("Июнь",dates);

        dates = new ArrayList<>();
        dates.add(4);
        holidays.put("Ноябрь",dates);

        System.out.println(holidays);
    }
}