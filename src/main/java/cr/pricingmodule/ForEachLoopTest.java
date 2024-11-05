package cr.pricingmodule;

public class ForEachLoopTest {

	public static void main(String[] args) {
		
		int[] intArray = {1,2,3,4,5};
		int[] intArray1 = {1,2,3,4,5};
		for(int int2: intArray1) {
			for(int int1: intArray) {
				if(int1 == 3)
					break;
				
				System.out.println("IN: "+int1);
			}
			System.out.println("out: "+int2);
			
		}
		

	}

}
