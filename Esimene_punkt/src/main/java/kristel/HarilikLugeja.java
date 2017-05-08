//Antud fail on aluseks, lugemaks sõnas olevaid tähti

public class HarilikLugeja implements T2heLugeja{

  String sona = ""; //antud mingi sõna
	public HarilikLugeja(String sona){
    this.sona = sona;
  }
public int paljuT2hti (char c){
  int counter = 0;
  for (int i = 0; i<sona.length(); i++){ //loen palju tähti selles sõnas on
    if (sona.charAt(i) == c){
      counter++;
    }
  }
  return counter;
}
}
