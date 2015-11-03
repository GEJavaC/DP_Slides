import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class generator2 {

	public static void main(String[] args) {	
	String[] people = {"Perrin Lake", "Hafsa Vahidy", "Andrew Jernigan", "Dominique Glenn", 
            "Tommie Cobb", "Matt Mcmillian", "Kody M", "Chris Colon", 
            "Demetria Blair", "Sachin Gargesh", "Sarah Hood", "Robert Grubbs"};
    String[] one = {"Abstract factory", "Builder", "Factory method", "Lazy initialization",
        "Multiton", "Object pool", "Prototype", "Singleton", "Bridge", "Adapter", 
        "Composite", "Facade", "Module", "Proxy", "Twin", "Blackboard", 
        "Chain of responsibility", "Command", "Interpreter", "Iterator", "Mediator", 
        "Null object", "Servant", "State"};
    
    ArrayList<String> listOfPeople= new ArrayList<>(Arrays.asList(people));
    ArrayList<String> patternsList= new ArrayList<>(Arrays.asList(one));
    
    long seed = System.nanoTime();
    Collections.shuffle(listOfPeople, new Random(seed));
    seed = System.nanoTime();
    Collections.shuffle(patternsList, new Random(seed));
    
   for (int i =0;i<12;i++){	 
		  System.out.println(listOfPeople.get(i)+ " is presenting on " + patternsList.get(i)+ " on session " + (i+1));		 
		  System.out.println(listOfPeople.get(11-i)+ " is presenting on " + patternsList.get(i)+ " on session " + (i+1));	
   }
 
}
}