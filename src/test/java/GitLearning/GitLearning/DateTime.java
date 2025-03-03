package GitLearning.GitLearning;

import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		
		Date current_Date = new Date();
        System.out.println(current_Date+"Arya");
        System.out.println("Today is 3rd Mar 2025");
        
        DateTime t = new DateTime();
        t.message();
	}
	
	void message() {
		System.out.println("Testing");
		System.out.println("Testing mode");
	}

}
