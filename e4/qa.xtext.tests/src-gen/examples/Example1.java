package examples;
public class Example1 implements Runnable {
	
	private int maxTries;
	private tdt4250.io.AbstractIO io = new tdt4250.io.ConsoleIO();
	
	public void run() {
		//Generate codes for a question
		    {
		    	String skipToQuestion;
				boolean correct = false;
				int maxTriesCounter = 0;
				
				while(!correct && maxTriesCounter < maxTries){
					maxTriesCounter++;
					
			        io.println("Are you ready - write the correct answer.");
			        
			        
			        String input = io.inputString("");
			        boolean answer;
			        
			        if(input.toUpperCase().equals("YES"))
			        	answer = true;
			        else
			        	answer = false;
			        
			        if (answer == true){
			        	io.println("Correct!");
			        	correct = true;
			        }else{
			        	io.println("Wrong!");
			        }
		        }
		        
		        //repeat the following until a correct answer is given, or hit the maximum tries if there is.
		    	//1.print out the question,
		        //2.get user input 
		        //3.compare user input with the correct answer, and notify user correct or wrong answer
		    }
		
		//Generate codes for a section
		{
		io.println("Here comes section: A");
		maxTries = 3;
		//Generate codes for a question
		    {
		    	String skipToQuestion;
				boolean correct = false;
				int maxTriesCounter = 0;
				
				while(!correct && maxTriesCounter < maxTries){
					maxTriesCounter++;
					
			        io.println("What is 2 + 2 - write the correct answer.");
			        
			        
			        double input = io.inputDouble("");
			        double answer = 4.0;
			        double epsilon = 0.0;
			        
			        if (input >= (answer - epsilon) || input <= (answer + epsilon)){
			        	io.println("Correct!");
			        	correct = true;
			        }else{
			        	io.println("Wrong!");
			        }
		        }
		        
		        //repeat the following until a correct answer is given, or hit the maximum tries if there is.
		    	//1.print out the question,
		        //2.get user input 
		        //3.compare user input with the correct answer, and notify user correct or wrong answer
		    }
		
		//Generate codes for a question
		    {
		    	String skipToQuestion;
				boolean correct = false;
				int maxTriesCounter = 0;
				
				while(!correct && maxTriesCounter < maxTries){
					maxTriesCounter++;
					
			        int count = 1;
		if(false && count == 1){
			io.println("What is 2 - 2 - choose an option.");
		}else{
			io.println("What is 2 - 2 - write the correct answer.");
		}
					        		io.println("? " + count + ") 0.0 +- 0.0");
					        		count++;
		if(false && count == 1){
			io.println("What is 2 - 2 - choose an option.");
		}else{
			io.println("What is 2 - 2 - write the correct answer.");
		}
					        		io.println("? " + count + ") 1.0 +- 0.0");
					        		count++;
		if(false && count == 1){
			io.println("What is 2 - 2 - choose an option.");
		}else{
			io.println("What is 2 - 2 - write the correct answer.");
		}
					        		io.println("? " + count + ") 2.0 +- 0.0");
					        		count++;
			        
			        
			        double input = io.inputDouble("");
			        double answer = 0.0;
			        double epsilon = 0.0;
			        
			        if (input >= (answer - epsilon) || input <= (answer + epsilon)){
			        	io.println("Correct!");
			        	correct = true;
			        }else{
			        	io.println("Wrong!");
			        }
		        }
		        
		        //repeat the following until a correct answer is given, or hit the maximum tries if there is.
		    	//1.print out the question,
		        //2.get user input 
		        //3.compare user input with the correct answer, and notify user correct or wrong answer
		    }
		
		//Generate codes for a question
		    {
		    	String skipToQuestion;
				boolean correct = false;
				int maxTriesCounter = 0;
				
				while(!correct && maxTriesCounter < maxTries){
					maxTriesCounter++;
					
			        io.println("What is the square root of 2 - write the correct answer.");
			        
			        
			        double input = io.inputDouble("");
			        double answer = Math.sqrt(2);
			        double epsilon = 0.001;
			        
			        if (input >= (answer - epsilon) || input <= (answer + epsilon)){
			        	io.println("Correct!");
			        	correct = true;
			        }else{
			        	io.println("Wrong!");
			        }
		        }
		        
		        //repeat the following until a correct answer is given, or hit the maximum tries if there is.
		    	//1.print out the question,
		        //2.get user input 
		        //3.compare user input with the correct answer, and notify user correct or wrong answer
		    }
		}
		//Generate codes for a section
		{
		io.println("Here comes section: B");
		}
	}

	public static void main(String[] args) {
		new Example1().run();
	}
}
