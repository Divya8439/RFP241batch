package practiceproblemsday4;

public class practiceproblemuc2 {

  public static void main(String[] args) {
		//constants
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		//variables
		int emphrs = 0;
		int empaWage = 0;
		        //computation
		double empCheck = Math.floor (Math.random()*10) % 2;
		if (empCheck == IS_FULL_TIME)
		    emphrs = 8;
		    else
		   emphrs = 0;
			empaWage = emphrs * EMP_RATE_PER_HOUR;
            System.out.println("Emp Wage: " + empaWage);
            
	}

}
