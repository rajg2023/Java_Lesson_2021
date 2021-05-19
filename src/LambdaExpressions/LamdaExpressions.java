package LambdaExpressions;


@FunctionalInterface
interface Pen{
	void getPen();
}

class ChinesePen implements Pen{
	public void getPen() {
		System.out.println("Chinese Pen ordered -- Arriving soon !!");
	}
}

public class LamdaExpressions {

	public static void main(String[] args) {
		
		//Anonymous CLass implementation
		Pen pen2 = new Pen() {
			@Override
			public void getPen() {
				System.out.println("Chinese Pen ordered from Anonymous Class implementation-- Arriving soon !!");
			}
			};	
			pen2.getPen();
			
			
			
		//Using Lamda Expressions	
		Pen pen = new ChinesePen();
		pen.getPen();
		Pen penLamda=()->{
			System.out.println("Chinese Pen Ordered thru Lamda -- Arriving soon");
		};
         penLamda.getPen();
	}
	
	
	
	
	
	
	
	

}
