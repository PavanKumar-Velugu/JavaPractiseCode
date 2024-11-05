package logic.corejava;

public class GetMissingNumberInArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20};
		int b[] = {1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20};
		
		if(a.length > b.length) {
			int sum = returnSumOfArrayElement(a, a.length);
			int sum1 = returnSumOfArrayElement(b, b.length);
			System.out.println("Missing Number in array: ");
			System.out.print(sum - sum1);
		} else {

			int sum = returnSumOfArrayElement(a, a.length);
			int sum1 = returnSumOfArrayElement(b, b.length);
			System.out.println("Missing Number in array: ");
			System.out.print(sum1 - sum);
		}
	}

	private static int returnSumOfArrayElement(int[] a, int len) {
		
		int sum=0;
		for(int i=0; i<len; i++) {
			//System.out.println(""+num);
			sum=sum+a[i];
		}
		System.out.println(">>>"+sum);
		return sum;
	}

}
