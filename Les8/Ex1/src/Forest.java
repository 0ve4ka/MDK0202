import java.util.ArrayList;

public class Forest {
    private ArrayList<MountainHare> hares;

    // объявите недостающие переменные и добавьте конструктор
    private static String season;

    public Forest(ArrayList<MountainHare> hares) {
        this.hares = hares;
    }
    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков

    public static  void setSeason(String newSeason){
        season = newSeason;
        if (season.equals("Зима") || season.equals("зима")){
            MountainHare.color = "белый";
        }
        else if (season.equals("Лето") || season.equals("лето"))
            MountainHare.color = "серо-рыжий";
        else
            System.out.println("Есть только лето/Лето или зима/Зима!");
    }


    // добавьте метод printHares()
public void printHairs(){
    for (MountainHare hare:hares)
        System.out.println(hare.toString());
}

}