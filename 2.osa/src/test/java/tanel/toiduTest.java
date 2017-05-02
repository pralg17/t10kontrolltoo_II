package tanel;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class toiduTest{
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void lisamine(){
        String vastus= this.restTemplate.getForObject("/lisamine?nimetus=kartul&valk=15&rasv=0&sysivesik=30",String.class);

        assertEquals("kartul",vastus.substring(0,6));
        assertEquals("salvestatud!",vastus.substring(7,19));

    }

    @Test
    public void kustutamine(){
        String vastus= this.restTemplate.getForObject("/kustuta?nimetus=kartul",String.class);

        assertEquals("kartul",vastus.substring(0,6));
        assertEquals("on kustutatud!",vastus.substring(7,21));

    }

    @Test
    public void uuring(){
        String vastus= this.restTemplate.getForObject("/toiduuuring?nimetus=kartul",String.class);

        assertEquals("Nimetus: kartul Valgud: 15 Rasvad: 0 Sysivesikud: 30",vastus.substring(0,52));

    }

    @Test
    public void rasvad(){
        String vastus= this.restTemplate.getForObject("/rasvaotsing?min=50&max=100",String.class);

        assertEquals("proov3 Valgud: 15 Rasvad: 60 Sysivesikud: 10",vastus.substring(0,44));
    }


    public static void main(String[] args) {
        System.getProperties().put("server.port", 1117);
        System.getProperties().put("spring.datasource.url","jdbc:mysql://localhost/mysql");
        System.getProperties().put("spring.datasource.username", "root");
        System.getProperties().put("spring.datasource.password", "");
        SpringApplication.run(rakendus.class);
    }
}
//kartul salvestatud!
//kartul on kustutatud!