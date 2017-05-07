import java.util.Arrays;
import java.util.Comparator;

public class ArraysTestAppl {

	public static void main(String[] args) {
		int [] ar1={1,10,5,20,3};
		Integer [] ar2 = {2,1,10,5,20,3};
//		for (int i=0 ; i<ar1.length ; i++)
//			System.out.println(ar1[i]);
		System.out.println("ar1 : "+Arrays.toString(ar1));
		
		int [] ar3 ={40,-3,20,80};
		int [] ar4 = ar1;
		int [][] arr1={ar1,ar3,ar4};
		System.out.println("arr1 : "+Arrays.deepToString(arr1));
		System.out.println("arr1 length: "+arr1.length);
		for (int i=0 ; i<arr1.length; i++)
			System.out.println("arr1 row : "+i + " - " + arr1[i]);
		
//		int [][] arr2={ar3,ar4};
//		int [][][] arrr1 = {arr1,arr2};
//		System.out.println("arrr1 : "+Arrays.deepToString(arrr1));
		
		int ind=4;
		ar4[ind]=10;
		//System.out.println("arr1 : "+Arrays.deepToString(arr1));
		
		//Sorting!!!
		Arrays.sort(ar1);
		//System.out.println("arr1 : "+Arrays.deepToString(arr1));
		
		//Arrays.sort(ar2, new EvenOddComporator());
		Arrays.sort(ar2, new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1 % 2 == 0 ? -1 : 1;
			}
			
		});
		System.out.println("ar2: " +Arrays.toString(ar2));
		
//		Arrays.sort(ar1);
//		System.out.println("ar1 : "+Arrays.toString(ar1));
//		//int [] ar5 = insertNumberSorted(ar1, 4);
//		int [] ar5 = removeNumberSorted(ar1, 20);
//		System.out.println("ar5 : "+Arrays.toString(ar5));
	}
	
	/**
	 * inserts the given number into the given sorted array with keeping order
	 * @param array - sorted array of integers
	 * @param number 
	 * returns new array with the inserted number
	 */
	public static int[]  insertNumberSorted(int [] array , int number){
		int size=array.length+1;
		int [] tmp = new int [size];
		int pos=Arrays.binarySearch(array, number);
		
		if (pos<0) pos=-(pos+1);
			
		System.arraycopy(array, 0, tmp, 0, pos);
		tmp[pos] = number;
		System.arraycopy(array, pos, tmp, pos+1,size-pos-1);	
			
		return tmp;		
	}
	
	/**
	 * 
	 * @param array - sorted array of integers
	 * @param number to be removed
	 * returns new array with no the given number 
	 * if number exists otherwise the reference to the given array
	 */
	public static int[]  removeNumberSorted(int [] array , int number){
		int ind=Arrays.binarySearch(array, number);
		if (ind<0) 
			return array;
		int [] tmp = new int [array.length-1];
		System.arraycopy(array, 0, tmp, 0, ind);
		System.arraycopy(array, ind+1, tmp, ind, tmp.length-ind);
			
		return tmp;		
	}
}
