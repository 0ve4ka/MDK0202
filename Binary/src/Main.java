import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int input = -1;
        String temp_input;
        while (input != 0) {
            System.out.println("Какую команду хотите выполнить?");
            System.out.println("1) Показать список всех животных в зоопарке.");
            System.out.println("2) Добавить животное в список.");
            System.out.println("3) Удалить животное из списка.");
            System.out.println("4) Очистить список.");
            System.out.println("5) Проверить, есть ли в зоопарке животное.");
            System.out.println("0) Закрыть приложение");
            input = scan.nextInt();
            if (input == 1){

                for (String animal: animals)
                    System.out.println(animal);

            } else if (input == 2) {

                System.out.println("Ввод животных!");
                System.out.println("Чтобы остановить ввод напишите 0");
                while (true){
                    temp_input = scan.next();
                    if (temp_input.equals("0"))
                        break;
                    else
                        animals.add(temp_input);
                }

            } else if (input == 3) {
                if (animals.isEmpty())
                    System.out.println("Извините, но список пуст!");
                else {
                    System.out.println("Удаление животных!");
                    System.out.println("Чтобы остановить удаление напишите 0");


                    System.out.println("Какое животное вы хотите удалить из списка?");


                    while (true) {
                        temp_input = scan.next();
                        if (temp_input.equals("0"))
                            break;
                        if (animals.contains(temp_input)){

                            animals.remove(temp_input);
                            System.out.println(temp_input + " удален(а) из списка");

                        }
                        else
                            System.out.println("Извините, но такого животного нет в списке!");


                    }
                }
            }
            else if (input == 4) {

                if (animals.isEmpty())
                    System.out.println("Извините, но список и так пуст!");
                else {
                    animals.clear();
                    System.out.println("Список очищен!");

                }

            } else if (input == 5){

                if (animals.isEmpty())
                    System.out.println("Извините, но список пуст!");
                else {
                    System.out.println("Проверка на наличие животных!");
                    System.out.println("Чтобы остановить проверку напишите 0");
                    System.out.println("Какое животное вы хотите найти в списке?");


                    while (true) {
                        temp_input = scan.next();
                        if (temp_input.equals("0"))
                            break;
                        if (animals.contains(temp_input))
                            System.out.println(temp_input + " есть в списке");
                        else
                            System.out.println("Извините, но такого животного нет в списке!");

                }

                }

            } else if (input == 0)
                break;
            else
                System.out.println("Команды под таким номером не существует!");



        }
     System.out.println("Сегодня в зоопарке можно увидеть кормления " + animals.size() + " животных.");

       System.out.println("Это будут:");
        for (String animal : animals)
           System.out.println(animal);

       System.out.println("Рассписание кормлений");
        //крокодил, слон, шиншилла, лев, медведь.
        System.out.println("В 9:00 - " + animals.get(1));
        System.out.println("В 10:00 - "+ animals.get(4));
        System.out.println("В 11:00 - " + animals.get(0));
        System.out.println("В 12:00 - " + animals.get(2));
        System.out.println("В 13:00 - " + animals.get(3));
    }
}