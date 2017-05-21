package shxtov;

import java.io.*;

public class Vabaliige implements yLine{
	double kordaja;
	double vabaliige;
	public Vabaliige(double kordaja, double vabaliige){
		
		this.kordaja=kordaja;
		this.vabaliige=vabaliige;

	}
	
	
	@Override
    public double f(double x) {
        return x * kordaja + vabaliige;
    }
	
	
}	