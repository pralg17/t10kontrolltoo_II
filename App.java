public class App{
    public static void App(String[] args) {
        River river1 = new River();
        river1.River("koeru", 12, 6);

        River river2 = new River();
        river2.River("narva", 10, river1, 10);
        
        River river3 = new River();
        river3.River("isa", 7, river2, 12);

        River river4 = new River();
        river4.River("kana", 4, river3, 5);

        river4.getRiverTosea();
        System.out.println(river4.getLenghtToSea());

        river1.getRiverTosea();
        System.out.println(river1.getLenghtToSea());
    }
} 

