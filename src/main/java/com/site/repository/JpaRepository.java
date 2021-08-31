package com.site.repository;

import org.springframework.data.repository.CrudRepository;

import com.site.entity.Book;

public interface JpaRepository extends org.springframework.data.jpa.repository.JpaRepository<Book, Long> { 
	
	//CrudRepository<Book, Long>
	//제너릭 부분 : 앞에는 Entity, 뒤에는 해당 Entity의 id값의 데이터타입

}//interface
