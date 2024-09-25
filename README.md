                                                                  Задание 1

package Work;

public class WorkCalculator {
    private int workingHours = 8;
    private String workerName;
    public double coefficient;

    public WorkCalculator(String newName) {
        workerName = newName;
    }

    public String getWorkerName() {
        return workerName;
    }

    public int calculate(int workDays) {
        return workDays * workingHours;
    }

    public double calculateWithCoefficient(int workDays) {
        return workDays * workingHours * coefficient;
    }
}

import java.util.Scanner;
import Work.WorkCalculator;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя работника:");
        WorkCalculator calculator = new WorkCalculator(scanner.next());

        System.out.println("Введите коэффициент в формате 1.5:");
        calculator.coefficient = scanner.nextDouble();

        System.out.println("Введите количество отработанных дней без коэффициента:");
        double hoursWithoutCoefficient = calculator.calculate(scanner.nextInt());

        System.out.println("Введите количество отработанных дней с коэффициентом:");
        double hoursWithCoefficient = calculator.calculateWithCoefficient(scanner.nextInt());

        double allWorkHours = hoursWithoutCoefficient + hoursWithCoefficient;
        // метод printf позволяет нам вывести строку с форматированием
        // символ %s заменит строку, а %.2f число с 2 знаками после запятой
        System.out.printf("Работник %s отработал %.2f часов.",
                calculator.getWorkerName(), allWorkHours);
    }
}

                                                                        Задание 2
  // можно забронировать одну из комнат
        BedAndBreakfast hotel = new BedAndBreakfast();
        Scanner scanner = new Scanner(System.in);

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
                    System.exit(0); // код равен 0, программа была завершена намеренно
                    // break в этом случае не нужен
                default:
                    System.out.println("Извините, такой команды пока нет.");
                    break;
            }
        }

 // сделайте класс общедоступным

    private int capacity = 10; // число свободных номеров (10) сохраните в переменную capacity

    private boolean full = false; // сохраните в переменную full значение false - есть номера в наличии


    public void book() { // метод для бронирования комнат
        if (! full) { // если есть свободные номера
            System.out.println("Забронирован ещё один номер!");
            capacity -=1; // уменьшите количество свободных номеров на один
            printRooms();
            if (capacity == 0) {
                full = true;
            }
        } else {
            System.out.println("Свободных номеров нет!");
        }
    }

    private void printRooms() {
        System.out.println("Свободных номеров - " + capacity);
    }

    public void free() { // метод для освобождения комнат
        if (capacity < 10) { // если свободных комнат меньше 10
            capacity+=1; // увеличиваем количество свободных мест на одно
            System.out.println("Освободился номер!");
            printRooms();
            full = false;
        } else {
            System.out.println("В гостинице только 10 номеров.");
        }
    }

    public boolean isFull() {
        return full;
    }


                                                                Задание 3
BankAccount bankAccount = new BankAccount();
        Scanner scan = new Scanner(System.in);
        BankAccount BA = new BankAccount();
        BA.setMoney(scan.nextDouble());// передайте в банкомат сумму на счету
        System.out.println("Количество денег на счету - " + BA.getMoney() + " р.");
        BA.withdrawAll(); // вызовите метод вывода средств
        System.out.println("Количество денег на счету - " + BA.getMoney() + " р.");


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

