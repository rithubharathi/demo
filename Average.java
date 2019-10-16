import java.util.*;
 class FindAverage{
	public double findAverage(int a,int b,int c){
		double avg =(a+b+c)/3;
		return avg;
	}
}

public class Average {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		FindAverage fa = new FindAverage();
		double result = fa.findAverage(a,b,c);
		System.out.print(result);
		
	}
}
