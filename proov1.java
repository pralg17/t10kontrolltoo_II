public class proov1{
	public static void main(String[] args){
		ristkylik laud1=new ristkylik(2, 1);
		ristkylik laud2=new ristkylik(1.5, 1);
		ristkylik laud3=new ristkylik(2, 1.5);
		System.out.println(laud1.pindala()+" "+laud1.ymbermoot());
		System.out.println(laud2.pindala());
		System.out.println(laud3.pindala());
		System.out.println(laud1);
		System.out.println(laud2.toString());
		
	}
}