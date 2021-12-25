import java.util.Scanner;

public class PracticeTask1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice; // ����� ����
		String courseName; // ������ ��
		String name; // �̸�
		int number; // �й�
		Student student; // Student ��ü ���� ���� 
		
		// �⼮�� ��ü ����
		ClassRoll sbook = new ClassRoll();
		
		// ������� ���Է¹ޱ�
		System.out.print("Enter the Coursename: ");
		courseName = sc.next();
		
		// �⼮���� ��������� �Է¹��� ����������� ����
		sbook.courseName = courseName;
		
		//
		do {
			System.out.print("Choose the Option that you want: ");
			System.out.println("(1) add   (2) find   (3) exit");
			
			choice = sc.nextInt();
			
			// ����� ���ÿ� ���� ��� ����
			if(choice == 1) {
				// �߰��ϴ� �л��� �̸�, �й� �Է¹��� �� �⼮�ο� �߰� 
				System.out.print("Enter the number of the Student who you want to add: ");
				number = sc.nextInt();
				
				System.out.print("Enter the name of the Student who you want to add: ");
				name = sc.next();
				student = new Student(number, name);
				sbook.add(student); ///////////////
			}
			else if(choice == 2) {
				// ã�� �л��� �й� �Է¹��� �� �л��� �̸� ���
				System.out.print("Enter the number of the Student who you want to find: ");
				number = sc.nextInt();
				sbook.Search(number);
			}
		} while(choice != 3);
	}
}

// �л� Ŭ����
class Student{
	
	// �й�, �̸�
	public int number;
	public String name;
	
	// ������ - ���� �ʱ�ȭ
	public Student(int Number, String Name) {
		this.number = Number;
		this.name = Name;
	}
	
	// �л� ���� ��ȯ
	public String toString() {
		return "�й�: " + this.number + ", �̸�: " + this.name;
	}
	
}

// �⼮�� Ŭ����
class ClassRoll{
	public static final int NOT_FOUND = -1;
	String courseName; // ������ �̸�
	int in_students; // �л����� ��
	int size_classRoll; // �⼮���� ũ��
	Student[] sbook; // �л����� ��ü �迭
	
	// ������
	// ũ�Ⱑ 10�� �� �⼮��
	public ClassRoll() {
		this.size_classRoll = 10;
		this.in_students = 0;
	}
	
	//�־��� �л� �⼮�ο� �߰� - �� Student ��ü�� �⼮�ο� �߰� �޼ҵ�
	public void add(Student newStudent) {
		if(in_students >= size_classRoll) {
			System.out.println("The Attendance book is full. Impossible to add more Students..");
		}
		else {
			// �⼮�ο� �߰�
			sbook[in_students] = newStudent;
			in_students++;
		}
	}
	
	// �־��� �л� ��ü - �й��� �⼮�� �� ��ġ�� �˷��ִ� �޼ҵ� 
	public int FindIndex (int searchNumber) {
		for(int i = 0; i < size_classRoll; i++) {
			if(searchNumber == sbook[i].number) {
				return i + 1;
			}
		}
		return NOT_FOUND;
	}
	
	// �־��� �й��� ���� Student ��ü�� �⼮�ο��� ã�Ƽ� �̸��� �˷��ش�. 
	public String Search (int searchNumber) {
		for(int i = 0; i < size_classRoll; i++) {
			if(searchNumber == sbook[i].number) {
				return sbook[i].name;
			}
		}
		return "Not found";
	}
}