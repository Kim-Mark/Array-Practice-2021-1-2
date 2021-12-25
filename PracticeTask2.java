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
	// ����
	Scanner sc = new Scanner(System.in);
	public String name;
	public int salseIncome;
	
	// ������
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
	
	public void readInput() { // �Է¹ޱ� 
		System.out.print("�Ǹſ��� �̸��� �Է��Ͻÿ�: ");
		String a = sc.next();
		setName(a);
		System.out.print("�Ǹſ��� �Ǹž��� �Է��Ͻÿ�: ");
		int b = sc.nextInt();
		setSalesIncome(b);
	}
	
	public String toString() {
		String i = "";
		i += "�Ǹſ�: ";
		i += this.name;
		i += ", �Ǹž�: ";
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
	
	// �Ǹſ����� ��, �� �Ǹſ��� ���� ������ �о� ���̱�
	public void getdata() {
		System.out.print("�Ǹſ����� ���� �Է��ϼ���: ");
		NumofSalesman = sc.nextInt();
		
		// �Ǹſ����� �迭 ��ü ����
		salesPerson = new Salesman[NumofSalesman];
		
		// �� �Ǹſ��׵鿡 ���� ������ �о� ���̱�
		for(int i = 0; i < NumofSalesman; i++) {
			salesPerson[i] = new Salesman();
			System.out.println("�Ǹſ�" + (i+1) + "�� ������ �Է�");
			salesPerson[i].readInput();
		}
		}
	
	public void computeStats() {
		// �ִ� �Ǹž��� ù��° �Ǹſ��� �Ǹž����� ����
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
		System.out.println("��� �Ǹž�: " + avgSalesIncome + ", �ִ� �Ǹž�: " + MaxSalesIncome);
		System.out.println("�ִ� �Ǹž��� �޼��� �Ǹſ�: " + n);
		///////////
	}
	
	
	
}