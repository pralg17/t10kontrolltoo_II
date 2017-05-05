package Geenid;
import org.junit.*;
//import static org.junit.Assert.*;

public class KontrollTest{

	Alleel alleel1 = new Alleel("alleel1", false);
    Alleel alleel2 = new Alleel("alleel2", true);
    Alleel alleel3 = new Alleel("alleel3", false);
    Geen geen1 = new Geen(alleel1, alleel2);
    Geen geen2 = new Geen(alleel1, alleel3);
    Geen geen3 = new Geen(alleel3, alleel3);


@Test
public void KontrollTestOige1(){
	Assert.assertEquals(geen1.test(), true);
}
@Test
public void KontrollTestOige2(){
	Assert.assertEquals(geen2.test(), false);
}	
@Test
public void KontrollTestVale(){
	Assert.assertEquals(geen3.test(), false);
}
}