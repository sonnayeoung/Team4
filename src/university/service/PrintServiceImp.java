package university.service;

public class PrintServiceImp implements PrintService {

	@Override
	public void printMainMenu() {	// 메인 메뉴
		System.out.println("---------KH대학---------");
		System.out.println("1. 학과 관리");
		System.out.println("2. 교수 관리");
		System.out.println("3. 학생 관리");
		System.out.println("4. 강의 관리");
		System.out.println("5. 수강 관리");
		System.out.println("6. 조회");
		System.out.println("7. 종료");
		System.out.println("---------------");
		System.out.print("메뉴 선택 : ");
		
		
		
	}
	
	@Override
	public void printDPMenu() {	// 학과 출력 메뉴
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printProfessorMenu() {	// 교수 출력 메뉴
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printStudentMenu() {	 // 학생 출력 메뉴
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printLectureMenu() {	// 강의 출력 메뉴
		System.out.println("---------강의 관리---------");
		System.out.println("1. 강의 등록");
		System.out.println("2. 강의 수정");
		System.out.println("3. 강의 삭제");
		System.out.println("4. 뒤로가기");
		System.out.println("---------------");
		System.out.print("메뉴 선택 : ");
		
	}

	@Override
	public void printLectureUpdateMenu() { // 강의 업데이트 출력 메뉴
		System.out.println("---------강의 수정---------");
		System.out.println("1. 강의 번호 수정");
		System.out.println("2. 강의명 수정");
		System.out.println("3. 담당 교수 번호 수정");
		System.out.println("4. 담당 교수 이름 수정");
		System.out.println("5. 최대 수강 인원 수정");
		System.out.println("6. 강의 시간 수정");
		System.out.println("7. 강의실 수정");
		System.out.println("8. 뒤로가기");
		System.out.println("---------------");
		System.out.print("메뉴 선택 : ");
		
	}
	
	


}
