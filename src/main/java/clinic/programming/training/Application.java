package clinic.programming.training;

import java.util.*;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }

	public void greet(){
	List<String> greetings = new ArrayList<>();
	greetings.add("Hello");
	for(String msg : greetings){
	System.out.println(msg);
}
}

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	app.greet();
    }
}
