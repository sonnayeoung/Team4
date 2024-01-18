package university.service;

import java.util.List;

import university.Professor;

public interface ProfessorService {
	
	void professorManage() ;
	
	/** 교수정보를 추가하는 메소드*/
	boolean addProfessor(Professor professor);
	
	/** 교수정보를 수정하는 메소드*/
	List<Professor> setProfessor(List<Professor> list, Professor professor);
	
	void setPhoneNum(int index);
	
	void setGender(int index);
	
	void setDepartment(int index);
	
	void setName(int index);
	
	void setNum(int index);
	
	/** 교수정보를 삭제하는 메소드*/
	void deleteProfessor(int index);

	
}
