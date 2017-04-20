package marko;

public class Ioon implements IoonINTERFACE{
    String name;
    double atom_mass;
    int charge;

    public Ioon(String name, double atom_mass, int charge) {
        this.name = name;
        this.atom_mass = atom_mass;
        this.charge = charge;
    }
    
    public int getCharge(){
        return charge;
    }
}
