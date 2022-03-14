package package3;
import java.util.Arrays;

public class ArrayOp {
	public static int[] copyOf(int[] array) {
		return Arrays.copyOf(array, array.length);
	}
	
}
public class CopyMethod {
	public static void main(String[] args) {

		int arr[]= {4,5,6,7,67};
		
		int copyOfArr[]=ArrayOp.copyOf(arr);
		
		System.out.print(Arrays.toString(arr));

		
	}
}


