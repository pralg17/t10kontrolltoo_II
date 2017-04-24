package com.kontrolltoo;

public class AineRakendamine implements Aine{

	IoonRakendamine pos;
	IoonRakendamine neg;
	String name;
	double mass;
	boolean valid;
	int charge;

	public AineRakendamine(IoonRakendamine ioon1, IoonRakendamine ioon2){
		if(ioon1.getCharge() > 0){
			this.pos = ioon1;
			this.neg = ioon2;

		}else{
			this.pos = ioon1;
			this.neg = ioon2;
		}

		this.name = pos.nimetus + neg.nimetus;
		this.mass = pos.aatom_mass + neg.aatom_mass;

		this.charge = pos.laeng + neg.laeng;
		this.valid = charge == 0;
	}

	@Override
	public int giveMass() {
		return 0;
	}

	@Override
	public boolean isValid() {
		return false;
	}

	@Override
	public String getName() {
		return name;
	}


}
