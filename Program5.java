import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// ���� �������� ���� ���ϱ�
		int[] frequency = new int[10]; // �� ������ �󵵼��� ������ �迭 
		int i;
		int score; // ����
		Scanner sc = new Scanner(System.in);
		
		// �� ������ �� �ʱ�ȭ
		for(i = 0; i < 10; i++) {
			frequency[i] = 0;
		}
		
		// ù��° ���� �Է�
		System.out.print("ù ��° ������ �Է��ϼ���: ");
		score = sc.nextInt();
		
		// ������ �ش��ϴ� �󵵼� ����
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
			
			System.out.print("���� ������ �Է��ϼ���: ");
			score = sc.nextInt();
		}
		
		// �� ������ �� ���
		System.out.println("\n���� ����\t������ ��");
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
