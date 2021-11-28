package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int count=8, n1=0,n2=1;
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 2; i <=count; i++) {
		int sum = n1+n2;
		System.out.println(sum);
		n1=n2;
		n2=sum;
		}
	}

}
