package testingGit;

public class selectionSort {

	public static void main(String[] args) {
		
		Integer[] myArray = {2, 6, 4, 22, 433, 65, 5, 9, 324, 6};
		
		  sort(myArray);
		for(int i = 0; i < myArray.length; i++ ){
			System.out.println(myArray[i]);
		}
	}
	
	public static void sort(Integer[] num){
		
		int i, j, first, temp;
		for(i = num.length - 1;i > 0; i -- ){
			first = 0;
			for(j = 1; j <= i; j++){
				if(num[j] < num[first])
					first = j;
			}
			temp = num[first];
			num[first] = num[i];
			num[i] = temp;
		}
	}
	
	public static void exchange(Integer[] a, int i, int j){
		
	}


	

}
