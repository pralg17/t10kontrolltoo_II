public class HarilikT2heLoendur implements T2heLoendur{
 String s6na = "";
 public  HarilikT2heLoendur(String s6na){
   this.s6na = s6na;
 }
 public int paljuT2hti(char c){
 int counter = 0;
 for( int i=0; i<s6na.length(); i++ ) {
   if( s6na.charAt(i) ==  c) {
       counter++;
     }
   }
   return counter;
 }

 }
