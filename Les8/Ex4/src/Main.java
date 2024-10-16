public class Main {
    public static void main(String[] args) {
        PopulationInformer populatioInformer = new PopulationInformer();
        System.out.println(populatioInformer.getPopulationPercent(Continent.ASIA));
        System.out.println(populatioInformer.getPopulationPercent(Continent.AFRICA));
        System.out.println(populatioInformer.getPopulationPercent(Continent.NORTH_AMERICA));
        System.out.println(populatioInformer.getPopulationPercent(Continent.SOUTH_AMERICA));
        System.out.println(populatioInformer.getPopulationPercent(Continent.ANTARCTICA));
        System.out.println(populatioInformer.getPopulationPercent(Continent.AUSTRALIA));
    }
}
class PopulationInformer {

    public static String getPopulationPercent(Continent continent) {
switch (continent){
    case ASIA:
        return "59.5%";
    case AFRICA:
        return "16.9%";
    case NORTH_AMERICA:
        return "7.7%";
    case SOUTH_AMERICA:
        return "5.6%";
    case ANTARCTICA:
        return "<0.1%";
    case EUROPE:
        return "9.7%";
    case AUSTRALIA:
        return "0.5%";
    default:
        return "Такого материка не существует.";
}


    }
}