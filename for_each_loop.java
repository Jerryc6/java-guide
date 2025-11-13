public class for_each_loop{

	public static void main(String[]args){
		//Array declartion
		int arr[] = {1,2,3,4,5};

		//Using for-each loop to
		//print each element
		for(int e : arr){i		
			System.out.print(e +" ");
		}
	}

	/* When to use For-Each Loop?
	 * #ther is no need to access the index of the elements
	 * #Code readability is a priority.
	


	 * When to avoid For-Each Loop?
	 * #You need to access element by thier index.
	 * #Perform reverse iteration.
	 * #Directly want to modify element in primitive arrays.
	 *
	 * */
}
