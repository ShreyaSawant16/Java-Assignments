package mydemo;

public class SmallInArray {

	    public static void main(String[] args) {
	        int arr[] = {10, 20, 5, 40};

	        int min = arr[0];
	        for(int i : arr) {
	            if(i < min)
	                min = i;
	        }

	        System.out.println("Smallest = " + min);
	    }
	}

