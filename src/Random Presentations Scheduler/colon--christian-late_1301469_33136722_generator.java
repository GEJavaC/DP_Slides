package randomizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class generator {

	public static void main(String[] args) {	
	String[] people = {"Perrin Lake", "Hafsa Vahidy", "Andrew Jernigan", "Dominique Glenn", 
            "Tommie Cobb", "Matt Mcmillian", "Kody M", "Chris Colon", 
            "Demetria Blair", "Sachin Gargesh", "Sarah Hood", "Robert Grubbs"};
    String[] one = {"Abstract factory", "Builder", "Factory method", "Lazy initialization",
        "Multiton", "Object pool", "Prototype", "Singleton", "Bridge", "Adapter", 
        "Composite", "Facade", "Module", "Proxy", "Twin", "Blackboard", 
        "Chain of responsibility", "Command", "Interpreter", "Iterator", "Mediator", 
        "Null object", "Servant", "State"};
    
    ArrayList<String> peopleList= new ArrayList<>(Arrays.asList(people));
    ArrayList<String> patternsList= new ArrayList<>(Arrays.asList(one));
    
    long seed = System.nanoTime();
    Collections.shuffle(peopleList, new Random(seed));
    seed = System.nanoTime();
    Collections.shuffle(patternsList, new Random(seed));
    
   for (int i =0;i<12;i++){	  
		   System.out.println("On session " + (i+1) +":\n\tPresenter: " + peopleList.get(i)+ " on " + patternsList.get(i) + "\n\tPresenter: "+ peopleList.get(11-i)+ " on " + patternsList.get(i+12)+"\n");	
   }
 
}
}