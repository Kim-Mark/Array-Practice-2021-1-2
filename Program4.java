
public class Program4 {

	public static void main(String[] args) {
		// 자동차 판매원들의 분기멸 실적과 1년 평균 판매 차량 수
		// 이중 배열로 만들기
		int [][] salesTable = {{72, 85, 93, 97}, {136, 324, 32, 45}, {54, 67, 178, 65}, {67, 43, 89, 100}, {45, 76, 76, 320}};
		int i, j, sum;
		String[] names = {"홍길동", "임꺽정", "Mark", "Jake", "Peter"};
		double[] rowaverage = new double[5]; // 직원들 평균 판매량 저장 공간
		double[] column = new double[4]; // 분기별 평균 판매량 저장 공간
		
		System.out.println("판매원  1분기 2분기 3분기 4분기");
		
		for(i = 0; i < 5; i++) {
			System.out.print(names[i]);
			for(j = 0; j < 4; j++) {
				System.out.print("  " + salesTable[i][j]);
			}
			System.out.println();
		}
		
		// 각 판매원의 평균 판매 수
		for(i = 0; i < salesTable.length; i++) {
			sum = 0;
			for(j = 0; j < salesTable[i].length; j++) {
				sum += salesTable[i][j];
			}
			rowaverage[i] = sum / 4.0;
			System.out.println("판매원" + (i + 1)+ "의 평균 판매대수: " + rowaverage[i]);
		}
		System.out.println();
		
		// 분기별 평균 판매 수
		for(i = 0; i < 4; i++) {
			sum = 0;
			for(j = 0; j < 4; j++) {
				sum += salesTable[j][i];
			}
			column[i] = sum / 5.0;
			System.out.println((i + 1)+ "분기의 평균 판매대수: " + column[i]);
		}
		

	}

}
