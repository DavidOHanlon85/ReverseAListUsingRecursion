package slideDeckChallenges;

import java.util.ArrayList;

public class ReverseAList {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(12);
		nums.add(89);
		nums.add(99);
		
		reverse(nums);
		
		System.out.println(nums.toString());
	}

	public static ArrayList<Integer> reverse(ArrayList<Integer> arrayList) {
		if (arrayList.size() <= 1) {
			//arrayList.add(arrayList.get(0));
		} else {
			Integer val = arrayList.remove(0);
			reverse(arrayList);
			arrayList.add(val);
		}
		
		return arrayList;
	}
	
	public static ArrayList<Integer> reverse2(ArrayList<Integer> arrayList) {
	    if(arrayList.size() > 1) {                   
	        Integer value = arrayList.remove(0); // remove and store locally the first element
	        reverse(arrayList); // recursive call with smaller arraylist
	        arrayList.add(value); // when the call stack returns here add local store of the first element to the array
	        // as the call stack unwinds it continually adds the elements to the array 
	    }
	    return arrayList; 
	}


}
