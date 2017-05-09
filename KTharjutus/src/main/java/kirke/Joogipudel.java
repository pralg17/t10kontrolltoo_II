package kirke;
public class Joogipudel{
  double maht;
	String pudelityyp;
  double mass;
  double taara_maksumus;
  Jook sisu;
public double Kogumass(){
  if (sisu == null){
    return mass;
  }
  else {
    return mass + maht * sisu.erikaal;
  }
}
public double Omahind(){
  if (sisu == null){
    return taara_maksumus;
  }
  else {
    return taara_maksumus + sisu.liitri_omahind;
  }

}
}
