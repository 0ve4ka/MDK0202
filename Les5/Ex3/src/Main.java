import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner scan = new Scanner(System.in);
        BankAccount BA = new BankAccount();
        BA.setMoney(scan.nextDouble());// передайте в банкомат сумму на счету
        System.out.println("Количество денег на счету - " + BA.getMoney() + " р.");
        BA.withdrawAll(); // вызовите метод вывода средств
        System.out.println("Количество денег на счету - " + BA.getMoney() + " р.");

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
