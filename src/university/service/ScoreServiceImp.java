package university.service;

import java.util.List;

import university.Lecture;
import university.Student;
import university.UniversityProgram;

public class ScoreServiceImp implements ScoreService {
	
	private StudentService studentService = new StudentServiceImp();
	private int index;

	//강의 평균 점수
	@Override
	public void showStudentStandardScore(List<Student> sList) {
		//학생 목록
		studentService.printStudentList(sList);
		System.out.println("학점을 볼 학생 선택 : ");
		
		//해당 학생의 인덱스 Student 인스턴스 생성
		index = UniversityProgram.scan.nextInt() - 1;
		Student std =  sList.get(index);
		//수강하고 있는 강의 리스트
		List<Lecture> lList = sList.get(index).getLecture();
		
		//입력한 인덱스 학생의 강의별 학점을 들고와서 강의 개수만큼 나눠서 학점 출력
		//포문을 돌려서
			//해당 학생의 모든 점수를 저장
		//전체 합계 초기화
		int sumScore=0;
		// for 문으로 모두 합함 / lList.get(index).getLecture().size()		
		for(int i=0; i<lList.size(); i++) {
			//강의 안에 해당 학생(덱스)의 스코어
			List <Student> stdL = lList.get(i).getStudents();
			for(int j=0; j<stdL.size(); j++) {
				if(std.getStudentId() == stdL.get(j).getStudentId()) {
					sumScore += stdL.get(j).getScore();
				}
			}
		}
		
		//합계(sumScore) / 학생이 듣고있는 강의 개수(size)
		int standardScore = sumScore / lList.size();
		System.out.println(sList.get(index).getName() + "학생의 평균 점수는 " + standardScore + "점 입니다.");
	}
	
	//각 강의 점수 조회
	@Override
	public void showStudentLectureScore(List<Student> sList) {
		studentService.printStudentList(sList);
		System.out.println("학점을 볼 학생 선택 : ");
		index = UniversityProgram.scan.nextInt() - 1;
		Student std = sList.get(index);
		
		//입력한 인덱스 학생의 각 강의의 학점 보여주기
		for(int i=0;i<std.getLecture().size();i++) {
			System.out.println(((Student) sList.get(i).getLecture()).getScore());
		}
	}

}
