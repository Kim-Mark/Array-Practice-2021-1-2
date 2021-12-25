import java.util.Scanner;

public class PracticeTask1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice; // 사용자 선택
		String courseName; // 교과목 명
		String name; // 이름
		int number; // 학번
		Student student; // Student 객체 참조 변수 
		
		// 출석부 객체 생성
		ClassRoll sbook = new ClassRoll();
		
		// 교과목명 ㄹ입력받기
		System.out.print("Enter the Coursename: ");
		courseName = sc.next();
		
		// 출석부의 교과목명을 입력받은 교과목명으로 변경
		sbook.courseName = courseName;
		
		//
		do {
			System.out.print("Choose the Option that you want: ");
			System.out.println("(1) add   (2) find   (3) exit");
			
			choice = sc.nextInt();
			
			// 사용자 선택에 따라 기능 구현
			if(choice == 1) {
				// 추가하는 학생의 이름, 학번 입력받은 후 출석부에 추가 
				System.out.print("Enter the number of the Student who you want to add: ");
				number = sc.nextInt();
				
				System.out.print("Enter the name of the Student who you want to add: ");
				name = sc.next();
				student = new Student(number, name);
				sbook.add(student); ///////////////
			}
			else if(choice == 2) {
				// 찾는 학생의 학번 입력받은 후 학생의 이름 출력
				System.out.print("Enter the number of the Student who you want to find: ");
				number = sc.nextInt();
				sbook.Search(number);
			}
		} while(choice != 3);
	}
}

// 학생 클래스
class Student{
	
	// 학번, 이름
	public int number;
	public String name;
	
	// 생성자 - 변수 초기화
	public Student(int Number, String Name) {
		this.number = Number;
		this.name = Name;
	}
	
	// 학생 정보 반환
	public String toString() {
		return "학번: " + this.number + ", 이름: " + this.name;
	}
	
}

// 출석부 클래스
class ClassRoll{
	public static final int NOT_FOUND = -1;
	String courseName; // 교과목 이름
	int in_students; // 학생들의 수
	int size_classRoll; // 출석부의 크기
	Student[] sbook; // 학생들의 객체 배열
	
	// 생성자
	// 크기가 10인 빈 출석부
	public ClassRoll() {
		this.size_classRoll = 10;
		this.in_students = 0;
	}
	
	//주어진 학생 출석부에 추가 - 한 Student 객체를 출석부에 추가 메소드
	public void add(Student newStudent) {
		if(in_students >= size_classRoll) {
			System.out.println("The Attendance book is full. Impossible to add more Students..");
		}
		else {
			// 출석부에 추가
			sbook[in_students] = newStudent;
			in_students++;
		}
	}
	
	// 주어진 학생 객체 - 학번의 출석부 내 위치를 알려주는 메소드 
	public int FindIndex (int searchNumber) {
		for(int i = 0; i < size_classRoll; i++) {
			if(searchNumber == sbook[i].number) {
				return i + 1;
			}
		}
		return NOT_FOUND;
	}
	
	// 주어진 학번을 가진 Student 객체를 출석부에서 찾아서 이름을 알려준다. 
	public String Search (int searchNumber) {
		for(int i = 0; i < size_classRoll; i++) {
			if(searchNumber == sbook[i].number) {
				return sbook[i].name;
			}
		}
		return "Not found";
	}
}