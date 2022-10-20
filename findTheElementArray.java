import java.util.Arrays;

public class findTheElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {5,8,1,3,6};
		int value=1;
		System.out.println(Arrays.toString(array));
		boolean found=false;
		
		for(int i=0;i<array.length;i++) {
		
			if(array[i]==value) {
				found = true;
				break;
				
			}
			}
		if(found) {
			System.out.println(value + " is present. " );
		}
		else
			System.out.println(value + " is not present ");
		

}
}
