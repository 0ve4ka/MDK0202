public class TransactionValidator {
    // объявите константы
    public final static int MIN_AMOUNT = 1;
    public  final static int MAX_AMOUNT = 5*1000;

    // внутри метода добавьте проверки на минимальную и максимальную сумму перевода
    // объявите метод isValidAmount()

    public static boolean isValidAmount(double amount){

        if (amount < MIN_AMOUNT){
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        }
        else if (amount > MAX_AMOUNT){
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        }
        else
            return true;
    }
}
