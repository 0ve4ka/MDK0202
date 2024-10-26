public class Smartphone extends MobilePhone{
    Smartphone(String number){
        super(number);

    }
    public final void makeCall(String targetNumber,String appName) {
        System.out.println("Позвоним через приложение  "+ appName + "по номеру" + targetNumber);
        System.out.println("Звоним с номера " + getNumber());
        System.out.println("Привет!");
    }
    public final void sendEmail(String messageText,String email){
        System.out.println("Отправляем сообщение: " + messageText + " по email " + email);
        System.out.println("Успешно!");
    }
}
