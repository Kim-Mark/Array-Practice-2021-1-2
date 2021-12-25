import java.util.Scanner;

public class PracticeTask2 {

	public static void main(String[] args) {
		
		SalesReport clerk = new SalesReport();
		
		clerk.getdata();
		clerk.computeStats();
		clerk.displayResults();

	}

}

class Salesman{
	// 변수
	Scanner sc = new Scanner(System.in);
	public String name;
	public int salseIncome;
	
	// 생성자
	public Salesman() {
		this.salseIncome = 0;
	}
	
	public Salesman(String Name, int SalesIncome){
	this.name = Name;
	this.salseIncome = SalesIncome;
	}
	
	
	public void setName(String Name) {
		this.name = Name;
	}
	
	public void setSalesIncome(int SalesIncome) {
		this.salseIncome = SalesIncome;
	}
	
	public void readInput() { // 입력받기 
		System.out.print("판매원의 이름을 입력하시요: ");
		String a = sc.next();
		setName(a);
		System.out.print("판매원의 판매액을 입력하시요: ");
		int b = sc.nextInt();
		setSalesIncome(b);
	}
	
	public String toString() {
		String i = "";
		i += "판매원: ";
		i += this.name;
		i += ", 판매액: ";
		i += this.salseIncome;
		return i;
	}
	
	public int getSalesIncome() {
		return salseIncome;
	}

	public String getName() {
		return name;
	}
}

class SalesReport{
	
	Scanner sc = new Scanner(System.in);
	public int NumofSalesman; 
	public int MaxSalesIncome;
	public double avgSalesIncome;
	Salesman[] salesPerson;
	public String n;
	
	// 판매원들의 수, 각 판매원에 대한 데이터 읽어 들이기
	public void getdata() {
		System.out.print("판매원들의 수를 입력하세요: ");
		NumofSalesman = sc.nextInt();
		
		// 판매원들의 배열 객체 생성
		salesPerson = new Salesman[NumofSalesman];
		
		// 각 판매원그들에 대한 데이터 읽어 들이기
		for(int i = 0; i < NumofSalesman; i++) {
			salesPerson[i] = new Salesman();
			System.out.println("판매원" + (i+1) + "의 데이터 입력");
			salesPerson[i].readInput();
		}
		}
	
	public void computeStats() {
		// 최대 판매액을 첫번째 판매원의 판매액으로 설정
		double nextSales = salesPerson[0].getSalesIncome();
		MaxSalesIncome = salesPerson[0].getSalesIncome();
		
		double sum = nextSales;
		
		for(int i = 0; i < NumofSalesman; i++) {
			if(MaxSalesIncome <= salesPerson[i].getSalesIncome()) {
				MaxSalesIncome = salesPerson[i].getSalesIncome();
				n = salesPerson[i].name;
			}
		}
		
		for(int p = 1; p < NumofSalesman; p++) {
			sum += salesPerson[p].getSalesIncome();
		}
		avgSalesIncome = sum / NumofSalesman;
	}
	
	public void displayResults() {
		System.out.println("평균 판매액: " + avgSalesIncome + ", 최대 판매액: " + MaxSalesIncome);
		System.out.println("최대 판매액을 달성한 판매원: " + n);
		///////////
	}
	
	
	
}