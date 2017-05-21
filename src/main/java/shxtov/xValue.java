package shxtov;

import java.io.*;

public class xValue implements yLine{

	double kordaja;
	public xValue(double kordaja){
		
		this.kordaja=kordaja;

	}
	
	
	@Override
    public double f(double x) {
        return x * kordaja;
    }
	
	
}