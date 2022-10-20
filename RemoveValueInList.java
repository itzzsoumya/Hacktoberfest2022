import java.util.*;
public class RemoveValueInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(90);
		list.add(100);
		System.out.println(list);
		
		//remove the element position wise
		list.remove(1);
		System.out.println(list);
		
		//remove the element value wise
		list.remove(Integer.valueOf(60));
		System.out.println(list);
  }
}
