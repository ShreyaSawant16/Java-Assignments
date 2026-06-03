package mydemo;

public class LargestInArray {
	    public static void main(String[] args) {
	        int arr[] = {10, 20, 5, 40};

	        int max = arr[0];
	        for(int i : arr) {
	            if(i > max)
	                max = i;
	        }

	        System.out.println("Largest = " + max);
	    }
	}


