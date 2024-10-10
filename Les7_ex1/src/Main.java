import java.util.ArrayList;

class Ball { }      // Класс "мяч"
class Accordion { } // Класс "аккордеон"
class Hat { }       // Класс "шляпа"
class Umbrella { }  // Класс "зонт"

public class Main {
    static LostAndFoundOffice lostAndFound = new LostAndFoundOffice();
    public static void main(String[] args) {
        Ball ball = new Ball();
        Accordion accordion = new Accordion();
        Umbrella umbrella = new Umbrella();
        Hat hat = new Hat();

        // Сдаём в бюро находок найденные вещи
        lostAndFound.put(ball);
        lostAndFound.put(accordion);
        lostAndFound.put(umbrella);

        checkObject(accordion, "Aккордеон");
        checkObject(ball, "Мяч");
        checkObject(null, "Пустая ссылка");
        checkObject(umbrella, "Зонт");
        checkObject(hat, "Шляпа");
    }
    private static void checkObject(Object object, String description) {
        if(lostAndFound.check(object)) {
            System.out.println('\'' + description + "' нашёлся!");
        } else {
            System.out.println('\'' + description + "' в бюро находок никто не приносил :(");
        }
    }
}


class LostAndFoundOffice {

    // создайте список things
    ArrayList<Object> things = new ArrayList<>();

    // реализуйте метод put()

    public void put(Object thing) {
        things.add(thing);
    }

    // реализуйте метод check()
    public boolean check(Object thing) {
        if (thing == null)
            return false;
        else{
            boolean f = false;
            for (Object object : things) { // логика проверки вещи в списке
                if (object.equals(thing)) {
                    f = true;
                }

            }
            return f;
        }

    }
}


