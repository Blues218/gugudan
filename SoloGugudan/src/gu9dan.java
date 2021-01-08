import java.util.Scanner;

public class gu9dan { 
	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 값은?(2-9) : ");
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int[]result = new int[9];
		
		for(int i=0; i<result.length; i++) {
			result[i] = number * (i + 1);
		}
		for(int i = 1; i < 10; i++) {
		if(number < 2) {
			System.out.println("값이 틀립니다");
		} else if (number > 9) {
			System.out.println("값이 틀립니다");
		} else { 		
			System.out.println(number * i);
		
			}
		}
	}
}
	




