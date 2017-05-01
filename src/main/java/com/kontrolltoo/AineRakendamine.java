package com.kontrolltoo;

public class AineRakendamine implements Aine{

    public IoonRakendamine pos;
    public IoonRakendamine neg;
	private String name;
    private double mass;
    private int charge;

    public AineRakendamine(IoonRakendamine ioon1, IoonRakendamine ioon2){
		if(ioon1.getCharge() > 0){
			this.pos = ioon1;
			this.neg = ioon2;

		}else{
			this.pos = ioon2;
			this.neg = ioon1;
		}

        this.charge = pos.charge + neg.charge;
		if (charge != 0 && pos.charge > neg.charge && neg.charge < pos.charge  ) {
			throw new RuntimeException("Laeng ei ole null.");
		}

		this.name = pos.name + neg.name;
        this.mass = pos.atom_mass + neg.atom_mass;
	}

	@Override
	public double giveMass() {
		return mass;
	}


	@Override
	public String getName() {
		return name;
	}

	@Override
    public int getCharge() {
        return charge;
    }
}
