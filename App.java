public class App{
    public static void main(String[] args) {
        River river1 = new River();
        river1.River("koeru", 12, "narva", 6);

        River river2 = new River();
        river2.River("narva", 10, "isa", 10);

        River river3 = new River();
        river3.River("isa", 7, "kana", 12);

        River river4 = new River();
        river4.River("kana", 4, "", 0);

        //String [] rivers = {"river1", "river2", "river3", "river4"};

      /*  String x = river1.riverName;

        while(!x.equals("")){
            System.out.println(x);
            
            x = x.whereFlows;

        }*/
        System.out.println(river3.getFlows());
    }
} 