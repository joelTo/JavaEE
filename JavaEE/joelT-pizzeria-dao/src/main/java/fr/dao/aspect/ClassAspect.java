package fr.dao.aspect;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import fr.model.Pizza;

@Component
@Aspect
public class ClassAspect {

	@Before("execution(* fr.dao.*.save(..))")
	public void BeforeSavePizza(JoinPoint joinPoint) {
		System.out.println("logAfter() is running!");
		System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
		System.out.println("hijacked arguments : " + joinPoint.getArgs()[0].toString());
		Pizza pizza = (Pizza) joinPoint.getArgs()[0];
		pizza.setCode(pizza.getNom().substring(0, 3).toUpperCase());
	}

	// Creation de l'entité performance
	/**
	 * Implementation de la base de donnée dans la table Performance sous la
	 * forme suivante : 1. id: identifiant technique en base de données 2.
	 * service : le nom du service 3. date : la date/heure de la mesure 4.
	 * tempsExecution : le temps d’exécution en ms
	 * 
	 * @param joinPoint
	 */

	@Around("execution(* fr.dao.*.*(..))")
	public Object inExecution(ProceedingJoinPoint process) {
		DateFormat fullDateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
		Long timeStart = Calendar.getInstance().getTimeInMillis();

		Object valeurRetournee = null;
		try {

			valeurRetournee = process.proceed();
			System.out.println(fullDateFormat.format(new Date()) + " " + " duree : "
					+ (Calendar.getInstance().getTimeInMillis() - timeStart) + " ms");
			System.out.println(process.getSignature().toString());

		} catch (Throwable e) {
			Logger.getGlobal().log(Level.SEVERE, "", e);
		}
		return valeurRetournee;
	}
}