package com.kontrolltoo;

public class AineRakendamine implements Aine{

    private IoonRakendamine pos;
    private IoonRakendamine neg;
	private String name;
	private double mass;
	private boolean valid;
    private int charge;

	private AineRakendamine(IoonRakendamine ioon1, IoonRakendamine ioon2){
		if(ioon1.getCharge() > 0){
			this.pos = ioon1;
			this.neg = ioon2;

		}else{
			this.pos = ioon2;
			this.neg = ioon1;
		}

		this.charge = pos.laeng + neg.laeng;
		if (charge != 0) {
			throw new RuntimeException("Laengud ei ole null.");
		}

		this.name = pos.nimetus + neg.nimetus;
		this.mass = pos.aatom_mass + neg.aatom_mass;
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
