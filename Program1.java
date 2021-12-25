import java.util.Scanner;

public class Program1 {
	// 10명 학생들 점수 받아 ㅠㅕㅇ균 구하고 각 점수가 평균 이상인지 아닌지 판별
	public static void main(String[] args) {
		// 10명의 학생들 점수 배열
		int[] scores = new int[10];
		
		// 점수 합
		double sum = 0.0;
		// 평균
		double average;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.print((i + 1)+" 번째 학생의 점수를 입력하세요> ");
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		
		average = sum / 10.0;
		System.out.println("평균: " + average);
		
		for(int i = 0; i < 10; i++) {
			if(scores[i] < average) {
				System.out.println((i + 1) + "번째 학생의 점수는 평균 이하입니다.");
			}
			else if(scores[i] > average) {
				System.out.println((i + 1) + "번째 학생의 점수는 평균 이상입니다.");
			}
			else {
				System.out.println((i + 1) + "번째 학생의 점수는 평균과 같습니다.");
			}
		}

	}

}
