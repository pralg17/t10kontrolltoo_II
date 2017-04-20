package jan;


public class Kolmk6laTestid{
	Kolmk6la k = new Kolmk6la(60);
	
	
	@Test
	public void Kolmk6la() {
		assertEquals(60, k.getPotoon());
		assertEquals(64, k.getSuurTerts());
		assertEquals(67, k.getKvint());
	}
	
	
}