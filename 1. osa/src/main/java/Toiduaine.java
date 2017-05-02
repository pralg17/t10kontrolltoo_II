public class Toiduaine {
    String nimetus;
    int valk;
    int rasv;
    int sysivesik;

    public Toiduaine(String nimetus, int valk, int rasv, int sysivesik){
        if(nimetus==null || nimetus.length()==0){
            throw new RuntimeException("Nimetus puudub");
        }
        if(valk+rasv+sysivesik>100){
            throw new RuntimeException("Protsent ei saa ületada sadat !");
        }
        this.nimetus=nimetus;
        this.valk=valk;
        this.rasv=rasv;
        this.sysivesik=sysivesik;
    }

}
