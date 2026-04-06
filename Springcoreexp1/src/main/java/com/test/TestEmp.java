package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*ApplicationContext  ctx=new ClassPathXmlApplicationContext("beans.xml");
Employee obj=ctx.getBean("emp11", Employee.class);
System.out.println(obj);

Employee obj1=(Employee)ctx.getBean("emp1");
System.out.println(obj1);
	}*/
ApplicationContext ctx=new AnnotationConfigApplicationContext(AnnConfig.class)
;

	Employee obj1=ctx.getBean("getSetterObj",Employee.class);
	obj1.setId(33);
	obj1.setName("SKY");
	obj1.setCompany("T20");
	System.out.println("Setter injection "+obj1);
	
	Employee obj2=ctx.getBean("getConstructorObj",Employee.class);
	System.out.println("ConstructorInjection:"+obj2);
	
	
	}
}