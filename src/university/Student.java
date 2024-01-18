package university;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* 학생 클래스 : 양선진
 * 기본기능 - 학생 관리 - 학생 등록/수정/삭제 
 * 학생 : 학번, 이름, 학과, 연락처
 * 수강 과목? -> lecture에 넣는게 맞는거 같음. 학생 클래스에는 학생에 대한 정보만
 * 시리얼넘버도 넣어야되나?
 * 연락처 -> 앞의 010 때문에 int, long에 안들어감(0으로 시작하면 8진수로 해석해서 오류, 0을 빼던가 0x로 바꿈)
 * 		    참고 : https://nirsa.tistory.com/356
 * 		 -> String으로 넣음 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable{

	private static final long serialVersionUID = 506099044819552874L;
	private int studentId, score, stdScore;	//학번, 학점, 평균학점
	private String name, phoneNumber;	//이름, 학과, 연락처(01012345678 식으로 입력)
	private char gender;	//성별
	Department department;	//학과
	List<Lecture> lecture;	//듣고있는 강의
	 
	//학번, 이름이 같다면
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && studentId == other.studentId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, studentId);
	}
	
	/* 학번 이름 성별 / 학과 : 학과명 / 연락처 : 01012345678 */
	@Override
	public String toString() {
		return studentId + " " + name + " " + gender + " / 학과 : " + department + " / 연락처 : " + phoneNumber;
	}
	
	public Student(int studentId, String name, String phoneNumber, char gender, Department department) {
		this.studentId = studentId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.department = department;
	}
	
	//학과변경시
	public void setDepartment(Department department) {
		this.department = department;
	}
	 
}
