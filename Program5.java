import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// 시험 점수들의 분포 구하기
		int[] frequency = new int[10]; // 각 구간의 빈도수를 저장할 배열 
		int i;
		int score; // 점수
		Scanner sc = new Scanner(System.in);
		
		// 각 구간의 빈도 초기화
		for(i = 0; i < 10; i++) {
			frequency[i] = 0;
		}
		
		// 첫번째 점수 입력
		System.out.print("첫 번째 점수를 입력하세요: ");
		score = sc.nextInt();
		
		// 점수에 해당하는 빈도수 갱신
		while(score != -1) {
			
			if(score < 10) {
				frequency[0]++;
			}
			
			else if(score < 20) {
				frequency[1]++;
			}
			
			else if(score < 30) {
				frequency[2]++;
			}
			
			else if(score < 40) {
				frequency[3]++;
			}
			
			else if(score < 50) {
				frequency[4]++;
			}
			
			else if(score < 60) {
				frequency[5]++;
			}
			
			else if(score < 70) {
				frequency[6]++;
			}
			
			else if(score < 80) {
				frequency[7]++;
			}
			
			else if(score < 90) {
				frequency[8]++;
			}
			
			else {
				frequency[9]++;
			}
			
			System.out.print("다음 점수를 입력하세요: ");
			score = sc.nextInt();
		}
		
		// 각 구간의 빈도 출력
		System.out.println("\n시험 점수\t구간별 빈도");
		for(i = 0; i < 10; i++) {
			if(i != 9) {
				System.out.println((i * 10) + "~" + (i * 10 + 9) + "\t\t" + frequency[i]);
			}
			else {
				System.out.println((i * 10) + "~" + (i * 10 + 10) + "\t\t" + frequency[i]);
			}
		}

	}

}
