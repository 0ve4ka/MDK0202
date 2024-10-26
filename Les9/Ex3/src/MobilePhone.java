public class MobilePhone extends Phone{

    MobilePhone(String number){
        super(number);
    }

    public final void sendSMS(String messageText,String targetNumber){
        System.out.println("Отправляем сообщение: " + messageText + " по номеру " + targetNumber);
        System.out.println("Успешно!");
    }
}
