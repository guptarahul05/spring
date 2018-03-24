package com.rahul.spring;

public class MyApp {

	public static void main(String[] args) {
		Coach theCoach = new TrackCoach();
		System.out.println(theCoach.getDailyWorkout());

	}
 
}




 


/*
Primary function
create and manage objects (IOC)
Inject obj depencendy (Dependency injection)

Configure spring container
XML
JAVA AnnotATION
jAVA SOURCE CODE	

Spring Develepment process
 1 configure spring beans
2  create spring container
3 retrive beans from spring container
 id = alias and class = actual implementation
 
 Spring container is gennerally an application context
 
 * types of injection
 COnstructor Injection 
 Setter injection
 auto wiring in the annotations section
 # Construction Injection
 
 1. Define the depencency interface and class
 2. Create a constructor in your class for injection
 3. configure the dependenct injection in spring config file
 
 # setter injection
 1 create setter methods in your class for injection
 2 configure the dependency injection in spring congig file
 */
