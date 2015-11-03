//
package Mergesort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ListGenerator{

	public static void main(String[] args) {	
	String[] people = {"Perrin Lake", "Hafsa Vahidy", "Andrew Jernigan", "Dominique Glenn", 
            "Tommie Cobb", "Matt Mcmillian", "Kody M", "Chris Colon", 
            "Demetria Blair", "Sachin Gargesh", "Sarah Hood", "Robert Grubbs"};
	
    String[] task = {"Abstract factory", "Builder", "Factory method", "Lazy initialization",
        "Multiton", "Object pool", "Prototype", "Singleton", "Bridge", "Adapter", 
        "Composite", "Facade", "Module", "Proxy", "Twin", "Blackboard", 
        "Chain of responsibility", "Command", "Interpreter", "Iterator", "Mediator", 
        "Null object", "Servant", "State"};
    
    ArrayList<String> peopleList= new ArrayList<>(Arrays.asList(people));
    ArrayList<String> taskList= new ArrayList<>(Arrays.asList(task));
    
    
    
    long Time = System.nanoTime();
    Collections.shuffle(peopleList, new Random(Time));
    Time = System.nanoTime();
    Collections.shuffle(taskList, new Random(Time));
    
    
    
    for (int i=0; i<11; i= i+2)
    	{
    		System.out.println("	Class session	" + (i+1) + "\n\tPresenter: " +
    		peopleList.get(i)+ " on " + taskList.get(i));
    		System.out.println( "\n\tPresenter: " +
    		peopleList.get(i+1)+ " on " + taskList.get(i+1)+"\n");
    	}
 
	}
}