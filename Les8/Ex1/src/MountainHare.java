public class MountainHare {
    // добавьте переменные и конструктор
   private int age;
   private double  weight;
   private int jumpLength;
   static String color;
public MountainHare(int age, double weigth, int jumpLength){
        this.age = age;
        this.weight = weigth;
        this.jumpLength = jumpLength;
}
    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}
