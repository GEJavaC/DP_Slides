package model;
import java.util.ArrayList;
import java.util.Random;

public class generator {

	public static void main(String[] args) {	
	String[] people = {"Perrin Lake", "Hafsa Vahidy", "Andrew Jernigan", "Dominique Glenn", 
            "Tommie Cobb", "Matt Mcmillian", "Kody M", "Chris Colon", 
            "Demetria Blair", "Sachin Gargesh", "Sarah Hood", "Robert Grubbs",
            "Perrin Lake", "Hafsa Vahidy", "Andrew Jernigan", "Dominique Glenn", 
            "Tommie Cobb", "Matt Mcmillian", "Kody M", "Chris Colon", 
            "Demetria Blair", "Sachin Gargesh", "Sarah Hood", "Robert Grubbs"};
    String[] one = {"Abstract factory", "Builder", "Factory method", "Lazy initialization",
        "Multiton", "Object pool", "Prototype", "Singleton", "Bridge", "Adapter", 
        "Composite", "Facade", "Module", "Proxy", "Twin", "Blackboard", 
        "Chain of responsibility", "Command", "Interpreter", "Iterator", "Mediator", 
        "Null object", "Servant", "State"};
    
    ArrayList<String> peopleList= new ArrayList<>();
    ArrayList<String> patternsList1= new ArrayList<>();
    
    for (String i : people) {
        peopleList.add(i);
    }
    for (String i : one){
        patternsList1.add(i);
    }

    for (int i = 0; i < 24; i++) {
	    Random random = new Random(); 
	    int randPpl, randPattern;
	    String sentence;
	    
        randPpl = random.nextInt(peopleList.size());
	    randPattern = random.nextInt(patternsList1.size());
	    
	    if(i < 12) {
	    	sentence = (i+1 + ". " + peopleList.get(randPpl) + " is responsible for " + 
	            patternsList1.get(randPattern) + " on session " + (i+1));
	    }
	    else{
	    	sentence = (i+1 + ". " + peopleList.get(randPpl) + " is responsible for " + 
		        patternsList1.get(randPattern) + " on session " + (i-11));
	    }
	    peopleList.remove(randPpl);
	    patternsList1.remove(randPattern);
	    System.out.println(sentence);    
}
	}}