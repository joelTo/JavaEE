package fr.dao.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ClassAspect {

	@Before("execution(* fr.dao.*.findAll())")
	public void BeforeSavePizza() {
		System.out.println("logAfter() is running!");
	}
}
