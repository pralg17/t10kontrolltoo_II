package shxtov;

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
public class JavaTests{
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void test1(){
		
		xValue test1=new xValue(3.0);
		assertEquals(9.0,test1.kordaja*3,0.1);
	}
	@Test
	public void test2(){
		
		xValue test2=new xValue(3.0);
		assertEquals(null,null,null);
	}
	@Test
	public void test3(){
		
		xValue test3=new xValue(3.0);
		assertEquals(0.0,test3.kordaja*0,0.1);
	}
	
	
	@Test
	public void test4(){
		Vabaliige test4= new Vabaliige(3.0,4.0);//   2*3+4
		assertEquals(10.0,test4.f(2),0.1);
		
	}
	
	@Test
	public void test5(){
		Vabaliige test5= new Vabaliige(3.0,0.0);//   2*3+0
		assertEquals(6.0,test5.f(2),0.1);
		
	}
	
	@Test
	public void test6(){
		Vabaliige test6= new Vabaliige(0.0,7.0);//   2*0+7
		assertEquals(7.0,test6.f(2),0.1);
		
	}


	@Test
	public void test7(){ 
		assertEquals("9.0", this.restTemplate.
		getForObject("/xValue?x=3.0&a=0", String.class));
		
	}

	
	
}