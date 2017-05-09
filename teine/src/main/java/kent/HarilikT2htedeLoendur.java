package kent;

public class HarilikT2htedeLoendur implements Liides{
String s6na = "";
public HarilikT2htedeLoendur(String s6na){
  this.s6na = s6na;
}
public int mituT2hte(char c){
int counter = 0;
for( int i=0; i<s6na.length(); i++ ) {
  if( s6na.charAt(i) ==  c) {
      counter++;
    }
  }
  return counter;
}

public String kysiS6na(){
  return s6na;
}

}
