package mydemo;

public class AverageOfArray {

	    public static void main(String[] args) {
	        int arr[] = {1, 2, 3, 4};
	        int sum = 0;

	        for(int i : arr) {
	            sum += i;
	        }

	        double avg = (double) sum / arr.length;

	        System.out.println("Average = " + avg);
	    }
	}

