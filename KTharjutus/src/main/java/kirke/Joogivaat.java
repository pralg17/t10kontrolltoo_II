package kirke;
public class Joogivaat{
  double ruumala;
  Jook sisu;
  double kogus_liitrites;

public Joogipudel T2itmine(Joogipudel p){
  if (kogus_liitrites<p.maht){
    return null;
  }
  else {
    kogus_liitrites = kogus_liitrites - p.maht;
    return p;
  }
}

}
