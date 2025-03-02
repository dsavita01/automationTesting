package GitLearning.GitLearning;

import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		
		Date current_Date = new Date();
        System.out.println(" This is latest time "+current_Date);
        DateTime t = new DateTime();
        t.message();
	}
	
	void message() {
		System.out.println("Testing");
	}

}
