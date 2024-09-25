package booking;
import java.util.Scanner;
import model.BedAndBreakfast;
public class BookingService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


                                                // Задание 2

        // можно забронировать одну из комнат
        BedAndBreakfast hotel = new BedAndBreakfast();

        /* Обратите внимание, здесь для удобства мы используем
        другую конструкцию для оформления цифрового меню.*/

        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 - Забронировать номер");
            System.out.println("2 - Освободить номер");
            System.out.println("3 - Проверить наличие свободных номеров");
            System.out.println("0 — Выход");

            int command = scanner.nextInt();
            /* switch-case конструкция заменяет if-else условия,
            код получается компактнее и быстрее читается */
            switch (command) {
                case 1:
                    // используется публичный метод
                    hotel.book();
                    // break позволяет выйти из условия, иначе - идём дальше
                    break;
                case 2:
                    hotel.free();
                    break;
                case 3:
                    if (hotel.isFull()) {
                        System.out.println("Больше нет мест¯\\_(ツ)_/¯");
                    } else {
                        System.out.println("Есть свободные номера!");
                    }
                    break;
                case 0:
                    System.out.println("Выход");

                    /* Метод exit() останавливает работу JVM, завершая программу.
                    В качестве аргумента принимает число — код ошибки.
                    Если оно не равно 0 — программа завершилась некорректно.*/
                    //System.exit(0); // код равен 0, программа была завершена намеренно
                    // break в этом случае не нужен
                    break;
                default:
                    System.out.println("Извините, такой команды пока нет.");
                    break;
            }
        }



//                  Задание 3
//        BankAccount bank = new BankAccount();
//        bank.setMoney(scanner.nextDouble());// передайте в банкомат сумму на счету
//        System.out.println("Количество денег на счету - " + bank.getMoney() + " р.");
//        bank.withdrawAll(); // вызовите метод вывода средств
//        System.out.println("Количество денег на счету - " + bank.getMoney() + " р.");
    }
}
class BankAccount {
    private long moneyAmount;

    // допишите код методов
    // используйте параметр newMoneyAmount для установки нового значения
    private double money = 0.0;
    public void setMoney(double money){
        this.money = money;
    }
    public double getMoney(){
        return money;
    }
    public void withdrawAll(){
        System.out.println("Со счёта снято "+money+" р.");
        money = 0;
    }
}


