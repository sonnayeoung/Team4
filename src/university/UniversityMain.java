package university;

public class UniversityMain {

	/*
	 * 대학생 관리 프로그램을 작성하세요.
	 * 
	 * - 기본 기능
	 *   - 교수 관리
	 *     - 교수 등록/수정/삭제
	 *   - 학생 관리
	 *     - 학생 등록/수정/삭제
	 *   - 과 관리 : 학생 전공은 과, 학부는 없다고 가정
	 *     - 과 등록/수정/삭제
	 *   - 강의 관리 
	 *     - 강의 등록/수정/삭제
	 *   - 수강 관리
	 *     - 수강 신청/성적관리
	 *   - 조회
	 *     - 성적 조회/학과 조회 등
	 * - 추가 기능 구현 해도 됨
	 * - 과에 학부 추가해도 됨
	 * - 제출일 : 1월 26일. 상황봐서 변경될 수 있음.
	 */
	
	/* 학과 > 교수 > 학생 > 강의(with 교수)> 수강신청*/
	
	/*
	 
	 [University]	//단어장
	  ㄴ 교수
	  ㄴ 학생
	  ㄴ 과
	  ㄴ 강의
	 
	 교수 : 교번, 이름, 담당 과목, 연락처, 성별
	 학생 : 학번, 이름, 수강 과목, 학과, 연락처, 성별
	 과 관리 : 학과 번호, 학과
	 강의 관리 : 강의 번호, 강의명, 담당교수, 인원, 강의 시간, 강의실
	 수강 관리 - 신청 : 강의를 출력해서 -> 강의명 선택 -> (인원 초과 X, 수강 시간 안 겹치면) 신청 아니면 신청 불가
	  			- 성적 : 이름, 수강명, 학점, 담당교수
	 조회 관리 - 성적 조회 : 출력
	  			- 학과 조회 : 출력
	 
	 */
	public static void main(String[] args) {
		UniversityProgram up = new UniversityProgram();
		up.run();
	}

}