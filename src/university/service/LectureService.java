package university.service;

import java.util.List;

import university.Lecture;

public interface LectureService {
	
	// 1.  강의를 등록하는 메서드
	List<Lecture> addLecture(List<Lecture> lList, String lectureFileName);

	
	// 2. 강의를 수정하는 메서드
	boolean setLecture(List<Lecture> lList, String lecutreFileName);


	boolean printLecture(List<Lecture> lList, String lectureFileName);

	
	// 3. 강의를 삭제하는 메서드
	
	
}
