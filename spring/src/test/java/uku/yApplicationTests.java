package uku;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)

public class yApplicationTests{
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	
	//esimene punkt
	@Test
	public void katse1(){
		
		xKordaja test1=new xKordaja(3.0);
		assertEquals(9.0,test1.kordaja*3,0.1);
	}
	@Test
	public void katse2(){
		
		xKordaja test2=new xKordaja(3.0);
		assertEquals(null,null,null);
	}
	@Test
	public void katse3(){
		
		xKordaja test3=new xKordaja(3.0);
		assertEquals(0.0,test3.kordaja*0,0.1);
	}
	
	
	
	
	//teine punkt
	@Test
	public void katse4(){
		Vabaliige test4= new Vabaliige(3.0,2.0);//   2*3+2
		assertEquals(8.0,test4.f(2),0.1);
		
	}
	
	@Test
	public void katse5(){
		Vabaliige test5= new Vabaliige(3.0,0.0);//   2*3+0
		assertEquals(6.0,test5.f(2),0.1);
		
	}
	
	@Test
	public void katse6(){
		Vabaliige test6= new Vabaliige(0.0,7.0);//   2*0+7
		assertEquals(7.0,test6.f(2),0.1);
		
	}
	
	//kolmas punkt
	
	
	@Test
	public void katse7(){ 
		assertEquals("9.0", this.restTemplate.
		getForObject("/xKordaja?x=3.0&a=0", String.class));
		
	}

	
	
}