import org.junit.*;
import static org.junit.Assert.*;

public class T2heTest{
  T2heLoendur lugeja = new HarilikT2heLoendur("tere");

  @Test
  public void paljuT2hti(){
    assertEquals(0, lugeja.paljuT2hti('a'));
    assertEquals(2, lugeja.paljuT2hti('e'));
    assertEquals(1, lugeja.paljuT2hti('t'));
  }
}

/* T E S T S
-------------------------------------------------------
Running T2heTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.013 sec - in T2heTest

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] --- maven-jar-plugin:2.6:jar (default-jar) @ app ---
[INFO] Building jar: /home/krisroos/public_html/Java/Aine_tööd/t10kontrolltoo_II/Esimene_punkt/target/app-1.jar
[INFO]
[INFO] --- spring-boot-maven-plugin:1.5.2.RELEASE:repackage (default) @ app ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 4.670 s
[INFO] Finished at: 2017-05-28T22:29:06+03:00
[INFO] Final Memory: 28M/241M
[INFO] ------------------------------------------------------------------------
*/
