public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мяу!",4);
        cat.catchMouse();
        cat.giveVoice();

        Dog dog = new Dog("Гав!",4);
        dog.bringStick();
        dog.play();

        Hamster hamster = new Hamster("*Усердно ест семечку*",4);
        hamster.hideFood();
        hamster.sleep();

        Fish fish = new Fish("Молча смотрит!",0);
        fish.sleep();

        Spider spider = new Spider("Молча смотрит!",8);
        System.out.println("У паука " + spider.getPawsCount() + " лапок.");
    }
}
class Fish extends Pet{
    Fish(String voice, int pawCounts){
        super(voice,pawCounts);
    }
    @Override
    public void giveVoice(){
        System.out.println(getVoice());
    }
}
class Spider extends  Pet {
    Spider(String voice, int pawCounts){
        super(voice,pawCounts);
    }
    @Override
    public void giveVoice(){
        System.out.println(getVoice());
    }
}
class Dog extends Pet{
    Dog(String voice, int pawCounts){
    super(voice,pawCounts);
}

    @Override
    public void giveVoice(){
        System.out.println(getVoice());
    }
    public void bringStick(){
        System.out.println("Принёс палочку, какой хороший мальчик!");

    }
}
class Cat extends Pet {
    Cat(String voice, int pawCounts){
        super(voice,pawCounts);
    }
    @Override
    public void giveVoice(){
        System.out.println(getVoice());
    }
    public void catchMouse(){
        System.out.println("Поймал мышку!");
    }
}
class Hamster extends Pet {
    Hamster(String voice, int pawCounts){
        super(voice,pawCounts);
    }
    @Override
    public void giveVoice(){
        System.out.println(getVoice());
    }
    public void hideFood(){
        System.out.println("Вся еда - в щёчках!");
    }
}


