import java.util.Scanner;

public class Program1 {
	// 10�� �л��� ���� �޾� �ФŤ��� ���ϰ� �� ������ ��� �̻����� �ƴ��� �Ǻ�
	public static void main(String[] args) {
		// 10���� �л��� ���� �迭
		int[] scores = new int[10];
		
		// ���� ��
		double sum = 0.0;
		// ���
		double average;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.print((i + 1)+" ��° �л��� ������ �Է��ϼ���> ");
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		
		average = sum / 10.0;
		System.out.println("���: " + average);
		
		for(int i = 0; i < 10; i++) {
			if(scores[i] < average) {
				System.out.println((i + 1) + "��° �л��� ������ ��� �����Դϴ�.");
			}
			else if(scores[i] > average) {
				System.out.println((i + 1) + "��° �л��� ������ ��� �̻��Դϴ�.");
			}
			else {
				System.out.println((i + 1) + "��° �л��� ������ ��հ� �����ϴ�.");
			}
		}

	}

}
