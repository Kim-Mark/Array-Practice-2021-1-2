
public class Program4 {

	public static void main(String[] args) {
		// �ڵ��� �Ǹſ����� �б�� ������ 1�� ��� �Ǹ� ���� ��
		// ���� �迭�� �����
		int [][] salesTable = {{72, 85, 93, 97}, {136, 324, 32, 45}, {54, 67, 178, 65}, {67, 43, 89, 100}, {45, 76, 76, 320}};
		int i, j, sum;
		String[] names = {"ȫ�浿", "�Ӳ���", "Mark", "Jake", "Peter"};
		double[] rowaverage = new double[5]; // ������ ��� �Ǹŷ� ���� ����
		double[] column = new double[4]; // �б⺰ ��� �Ǹŷ� ���� ����
		
		System.out.println("�Ǹſ�  1�б� 2�б� 3�б� 4�б�");
		
		for(i = 0; i < 5; i++) {
			System.out.print(names[i]);
			for(j = 0; j < 4; j++) {
				System.out.print("  " + salesTable[i][j]);
			}
			System.out.println();
		}
		
		// �� �Ǹſ��� ��� �Ǹ� ��
		for(i = 0; i < salesTable.length; i++) {
			sum = 0;
			for(j = 0; j < salesTable[i].length; j++) {
				sum += salesTable[i][j];
			}
			rowaverage[i] = sum / 4.0;
			System.out.println("�Ǹſ�" + (i + 1)+ "�� ��� �ǸŴ��: " + rowaverage[i]);
		}
		System.out.println();
		
		// �б⺰ ��� �Ǹ� ��
		for(i = 0; i < 4; i++) {
			sum = 0;
			for(j = 0; j < 4; j++) {
				sum += salesTable[j][i];
			}
			column[i] = sum / 5.0;
			System.out.println((i + 1)+ "�б��� ��� �ǸŴ��: " + column[i]);
		}
		

	}

}
