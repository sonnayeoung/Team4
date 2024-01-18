package university.service;

import java.util.List;

import university.Department;
import university.Lecture;
import university.Professor;
import university.Student;


public interface FileService {

	/** 학과 파일정보 불러오기 : 신경재*/
	List<Department> dLoad(String departmentFileName);
	
	/** 학과 파일정보 저장하기 : 신경재*/
	boolean dSave(String departmentFileName, List<Department> dList);

	/** 교수 파일정보 불러오기 : 손나영*/
	List<Professor> pLoad(String professorFileName);
	
	/** 교수 파일정보 저장하기 : 손나영*/
	boolean pSave(String professorFileName);
	
	/** 학생 파일정보 불러오기 : 양선진*/
	List<Student> sLoad(String studentFileName);
	
	/** 학생 파일정보 저장하기 : 양선진*/
	boolean sSave(String studentFileName, List<Student> sList);
	
	/** 강의 파일정보 불러오기 : 심아진*/
	List<Lecture> lLoad(String lectureFileName);
	
	/** 강의 파일정보 저장하기 : 심아진*/
	boolean lSave(String lectureFileName, List<Lecture> lList);
	
	
	
	



}
