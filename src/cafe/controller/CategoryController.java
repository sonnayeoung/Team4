package cafe.controller;

import java.util.ArrayList;
import java.util.Scanner;

import cafe.model.vo.Category;
import cafe.service.CategoryService;
import cafe.service.PrintService;
import cafe.service.PrintServiceImp;


public class CategoryController {

	private Scanner scan;
	private CategoryService categoryService;
	public PrintService printService = new PrintServiceImp();
	
	private static final int EXIT_CATEGORY = 5;
	
	public void run() {
		int menu;
		do {
			prinCategoryMenu();
			menu = scan.nextInt();
			runCategoryMenu(menu);
		}while(menu != 5);
	}

	private void prinCategoryMenu() {
		System.out.println("카테고리 관리 메뉴");
		System.out.println("-------------------");
		System.out.println("1. 카테고리 등록");
		System.out.println("2. 카테고리 수정");
		System.out.println("3. 카테고리 삭제");
		System.out.println("4. 카테고리 미리보기");
		System.out.println("5. 뒤로가기");
		System.out.println("-------------------");
		System.out.println("메뉴 선택 : ");		
	}

	private void runCategoryMenu(int menu) {
		switch(menu) {
		case 1:
			insertCategory();
			break;
		case 2:
			updateCategory();
			break;
		case 3:
			deleteCategory();
			break;
		case 4:
			printCategory();
			break;
		case 5:
			System.out.println("뒤로 돌아갑니다.");
		default:
			System.out.println("잘못된 메뉴입니다.");
		}
	}

	/** 4. 카테고리 전체 조회하는 메서드*/
	private void printCategory() {
		ArrayList<Category> list = categoryService.getCategoryList();
		if(list.size() == 0) {
			System.out.println("등록된 카테고리가 없습니다.");
			return;
		}
		for(Category c : list) {
			System.out.println(c);
		}
	}
	
	/** 3. 카테고리 삭제하는 메서드*/
	private void deleteCategory() {
		System.out.println("삭제할 카테고리 번호를 입력하세요: ");
		 int c_num = scan.nextInt();
		 
		 if (categoryService.deleteCategory(c_num)) {
	            System.out.println("카테고리를 삭제하였습니다.");
	        } else {
	            System.out.println("카테고리 삭제에 실패했습니다.");
	        }
	    }

	
	/** 2. 카테고리 수정하는 메서드*/
	private void updateCategory() {
        System.out.println("수정할 카테고리 이름을 입력하세요: ");
        String c_title = scan.next();

        Category updatedCategory = new Category(c_title);

        if (categoryService.updateCategory(updatedCategory)) {
            System.out.println("카테고리를 수정하였습니다.");
        } else {
            System.out.println("카테고리 수정에 실패했습니다.");
        }
	}

	/** 1. 카테고리 등록하는 메서드*/
	private void insertCategory() {
		System.out.println("카테고리 이름 : ");
		String c_title = scan.next();
		
		Category category = new Category(c_title);
		
		if(categoryService.insertCategory(category)) {
			System.out.println("카테고리를 등록하였습니다.");
		}else {
			System.out.println("카테고리 등록에 실패했습니다.");
		}
	}
}
