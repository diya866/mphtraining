package com.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.config.DBConfig;
import com.test.dao.BookDao;
import com.test.model.Book;

public class TestMain {
public static void main(String[] args) {
	ApplicationContext ctx=new AnnotationConfigApplicationContext(DBConfig.class);
	BookDao dao=ctx.getBean(BookDao.class);
	Book book=new Book();
	
	book.setB_id(10);
	book.setB_name("Rich");
	book.setB_author("PU");
	book.setB_price(123);
	dao.saveBooks(book);
	System.out.println("done");
}
}
