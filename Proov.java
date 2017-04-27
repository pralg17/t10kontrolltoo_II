public class Proov{
	public static void main(String[] args) {
		Jogi j1=new Jogi("Pirakas", 150, 32, null, 0, 0);
		Jogi j2=new Jogi("Keskmik", 88, 15, j1.getNimi(), 18, j1.pikkusKokku());
		Jogi j3=new Jogi("Pisike", 12, 3, j2.getNimi(), 67, j2.pikkusKokku());
		Jogi j4=new Jogi("Keskpärane", 57, 12, j1.getNimi(), 112, j1.pikkusKokku());
		Jogi j5=new Jogi("Nääps", 8, 1, j3.getNimi(), 3, j3.pikkusKokku());
		
		
		System.out.println("\n");
 		System.out.println(j1);
		System.out.println(j2);
		System.out.println(j3);
		System.out.println(j4);
		System.out.println(j5);
		System.out.println("\n");

	}
}

