package kirke;

import org.junit.*;
import static org.junit.Assert.*;
public class JookideTest{

  @Test
  public void Kogumass(){
    Joogipudel p1=new Joogipudel();
    Jook j1= new Jook();
    p1.maht = 0.5;
    p1.mass = 20;
    j1.erikaal = 0.25;
    p1.sisu = j1;
    assertEquals(20.125, p1.Kogumass(), 0.01);
  }
  @Test
  public void Omahind(){
    Joogipudel p1=new Joogipudel();
    Jook j1= new Jook();
    p1.taara_maksumus = 0.1;
    j1.liitri_omahind = 1.5;
    p1.sisu = j1;
    assertEquals(1.6, p1.Omahind(), 0.01);
}
@Test
public void T2itmine(){
  Joogipudel p1=new Joogipudel();
  Joogivaat v1= new Joogivaat();
  Jook j1= new Jook();
  v1.kogus_liitrites = 300;
  p1.maht = 0.5;
  assertTrue(p1 == v1.T2itmine(p1));
}
@Test
public void T2itmine2(){
  Joogipudel p1=new Joogipudel();
  Joogivaat v1= new Joogivaat();
  Jook j1= new Jook();
  v1.kogus_liitrites = 0.1;
  p1.maht = 0.5;
  assertTrue(null == v1.T2itmine(p1));
}

}
