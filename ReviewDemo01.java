import java.util.Scanner;

public class ReviewDemo01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean isPrime = true;
		
		int k=2;
		while(k<number) {
			if(number % k == 0) {
				isPrime = false;
				break;
			}
			k++;
		}
		if(isPrime)
			System.out.println(number + "�� �Ҽ���.");
		else
			System.out.println(number + "�� �Ҽ��� �ƴϴ�.");
	}
}
