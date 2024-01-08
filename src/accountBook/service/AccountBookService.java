package accountBook.service;

import java.util.List;

import accountBook.AccountBook;

public interface AccountBookService {
	//기능을 정한 뒤 업무 분담
	
	//1. 가계부(리스트)에 내역을 추가하는 메소드 :  심아진
	boolean addAB(List<AccountBook> list, AccountBook ab);
	
	//2. 가계부(리스트)에 내역을 조회하는 메소드 :
	boolean printAB(List<AccountBook> list, String title);

	//3. 가계부(리스트)에 내역을 수정하는 메소드 : 
	boolean setAB(List<AccountBook> list, String title, int moeny);
	
	//4. 가계부(리스트)에 내역을 삭제하는 메소드 :
	boolean deleteAB(List<AccountBook> list, String title);
	
	//5. 현재 잔액을 출력하는 메소드
	boolean printCurrentMoney();
	
}
