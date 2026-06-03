package mydemo;

public class ArmstrongNumber {

	    public static void main(String[] args) {
	        int n = 153, original = n, sum = 0;

	        while(n > 0) {
	            int d = n % 10;
	            sum += d * d * d;
	            n /= 10;
	        }

	        if(original == sum)
	            System.out.println("Armstrong");
	        else
	            System.out.println("Not Armstrong");
	    }
	}
