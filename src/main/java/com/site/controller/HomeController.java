package com.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.site.entity.Book;
import com.site.repository.JpaRepository;

@Controller
public class HomeController {

	@Autowired
	JpaRepository jpaRepository;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/bookDetail")
	public String bookDetail(Book book) {
		
		//jpa CRUD 참고 블로그 : https://victorydntmd.tistory.com/327
		
		System.out.println("저자 : "+book.getAuthor());
		
		
		//1. Dto를 변환! Entity를 만든다.
		
		
		//2. Repository에게 Entity를 DB에 저장하도록 한다.
		//insert
		Book saved = jpaRepository.save(book);
		System.out.println("저장결과 : "+saved.getAuthor());
		System.out.println("현재 저장된 시퀀스 : "+saved.getId());
		
		//select
		List<Book> list = jpaRepository.findAll();
		Book resultBook = new Book();
		
		for(int i=0; i<list.size(); i++) {
			resultBook = list.get(i);
			System.out.println((i+1)+"번째, DB에 저장된 저자 이름 : "+resultBook.getAuthor());
		}
		
		//delete
		//jpaRepository.deleteById((long) 2);
		
		
		//update
		//수정은 별도의 메소드가 존재하지 않고,
		//PK값이 없으면 insert
		//PK값이 있으면 update로 구동된다.
		Book updateBook = new Book();
		updateBook.setId(70);
		updateBook.setAuthor("확인중 - 수정한 제목입니다.");
		//시간 테스트 : 2021-08-18 10:36:29.567
		jpaRepository.save(updateBook);
		
		
		
		return "";
	}

	
	
}//class
