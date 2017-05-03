package Chris;

import java.util.ArrayList;
import java.util.List;
 

public class Toit{
	
	String nimetus;
	double vajalik_kogus;
	
	public ArrayList<Toidukomponent> Toidukomponendid = new ArrayList<Toidukomponent>();
	
	public String kogusSalatiks(double soovitudKogus){
		
		double kogused = 0;
		
		for(int i = 0; i < Toidukomponendid.size(); i++){
			kogused = kogused + Toidukomponendid.get(i).kogus;
		}
		
		vajalik_kogus = soovitudKogus / kogused;
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < Toidukomponendid.size(); i++){
			sb.append("<tr><td>" + Toidukomponendid.get(i).t.nimetus + " "  + "</td>");
			sb.append("<td>" + (vajalik_kogus * Toidukomponendid.get(i).kogus) + "</td></tr><br>");
		}
		
		String table_head = "<tr><th>Toiduaine</th><th> Kogus</th></tr><br>";
		return table_head + sb;
		
		
	}
	
}