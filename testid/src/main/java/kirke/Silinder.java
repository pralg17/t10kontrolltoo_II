package kirke;

public class Silinder extends Pystkeha{
  double r;
  public Silinder(double raadius, double korgus){
    super(korgus);
    r=raadius;
  }
  @Override
  public double pohjaPindala(){
    return r*r*Math.PI;
  }
}
