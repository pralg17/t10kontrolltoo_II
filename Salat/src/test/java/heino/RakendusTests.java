package heino;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class RakendusTests {

	@Autowired
	private TestRestTemplate restTemplate;


	@Test
    public void toiduaineLisamineAndmebaasi(){
	   assertEquals("Lisatud kartul205015", this.restTemplate.getForObject("/lisa?toiduaine_nimetus=kartul&valgud_protsent=20&rasvad_protsent=50&sysivesikud_protsent=15", String.class));
//getForObject - URLi andmine
    }

		//Vahemiku otsimise testimine
	@Test
    public void otsimineVahemikust(){
	   assertEquals("<tr><th>Id</th><th>Nimetus</th><th>Valgud</th><th>Rasvad</th><th>Susivesikud</th></tr><tr><td>9</td><td>kartul</td><td>20.0</td><td>5.0</td><td>15.0</td><td><tr><td>79</td><td>maasikas</td><td>80.0</td><td>2.0</td><td>10.0</td><td>",
		 this.restTemplate.getForObject("/rasvaotsing?rasvad_min=1&rasvad_max=20", String.class));

    }


		@Test
    public void kustutamineAndmebaasist(){
      //assertEquals("kartul  on kustutatud", this.restTemplate.getForObject("/kustuta?id=88" , String.class));
			assertEquals("Antud id-ga toiduainet ei leidu", this.restTemplate.getForObject("/kustuta?id=1" , String.class));
    }

//KartuliSalati arvutuste õigsuse testimine
//Kartuli puhul lõin numbrid kokku
@Test
		public void salatiKoguseTestimine(){
			assertEquals("<tr><th>Toiduaine nimetus </th><th>kogus </th></tr><br><tr><td> kartul</td><td> 34.0</td></tr><tr><td> hapukoor</td><td> 10.0</td></tr><tr><td> vorst</td><td> 7.0</td></tr><tr><td> muna</td><td> 10.0</td></tr><tr><td> juust</td><td> 15.0</td></tr>",
			  this.restTemplate.getForObject("/kartuliSalat?vajalik_kogus=76", String.class));
		}

//Salatis Valkude, rasvade ja süsivesikute arvutuse testimine
		@Test
				public void SalatiToidukomponentideTestimine(){
					assertEquals("<tr><th>Toiduaine nimetus </th><th>kogus </th><th>Valgud </th><th>Rasvad </th><th>Süsssivesikud </th></tr><br><tr><td> kartul</td><td> 34.0</td><td> 17.0</td><td> 2.72</td><td> 3.4</td></tr><tr><td> hapukoor</td><td> 10.0</td><td> 1.5</td><td> 5.0</td><td> 2.0</td></tr><tr><td> vorst</td><td> 7.0</td><td> 3.01</td><td> 2.1</td><td> 0.7</td></tr><tr><td> muna</td><td> 10.0</td><td> 1.0</td><td> 2.0</td><td> 3.2</td></tr><tr><td> juust</td><td> 15.0</td><td> 1.8</td><td> 4.5</td><td> 6.0</td></tr><br>Kokku:76.0",
					  this.restTemplate.getForObject("/salat", String.class));
				}

}
