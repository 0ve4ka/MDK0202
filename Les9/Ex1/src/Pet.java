public abstract class Pet {
    private String voice;
    private int pawsCounts;


    public String getVoice() {
        return voice;
    }

    public int getPawsCount() {
        return pawsCounts;
    }

    public Pet(String voice, int pawCounts){
        this.voice = voice;
        this.pawsCounts = pawCounts;
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
    public void play(){
        System.out.println("Playing");
    }
    public abstract void giveVoice();
}
