package examples;
public class Example1 implements Runnable {
	
	private int maxTries = 1;
	private  boolean revealAnswer = false;
	private boolean skip = false;
	private String nextQ = "";
	private tdt4250.io.AbstractIO io = new tdt4250.io.ConsoleIO();
	
	public void run() {
		//Generate codes for a question
		    {
		    if (!skip || (skip && nextQ.equals("x"))){
		    	skip = false;
				boolean correct = false;
				int maxTriesCounter = 0;
				
				while(!correct && maxTriesCounter < maxTries){
					maxTriesCounter++;
					
			        io.println("Are you ready? - write the correct answer.");
			        
			        
			        String input = io.inputString("");
			        boolean correctAnswer = true;
			        boolean answer = false;
			        
			        if(input.toUpperCase().equals("YES") && correctAnswer){
			        	answer = true;
			        }else if(input.toUpperCase().equals("NO") && !correctAnswer){
			        	answer = false;
			        }
			        
			        if (answer == correctAnswer){
			        	io.println("Correct!");
			        	correct = true;
			        }else{
			        	io.println("Wrong!");
			        	if(maxTriesCounter == maxTries && revealAnswer){
			        		if(correctAnswer){
			        			io.println("Correct answer is: Yes");
			        		}else{
			        			io.println("Correct answer is: No");
			        		}
			        	}
			        }
		        }
		        	if(correct){
		        	int lowestTries = Integer.MAX_VALUE;
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
		revealAnswer = true;
			//Generate codes for a question
			    {
			    if (!skip || (skip && nextQ.equals("a1"))){
			    	skip = false;
					boolean correct = false;
					int maxTriesCounter = 0;
					
					while(!correct && maxTriesCounter < maxTries){
						maxTriesCounter++;
						
				        io.println("What is 2 + 2? - write the correct answer.");
				        
				        
				        double input = io.inputDouble("");
				        double answer = 4.0;
				        double epsilon = 0.0;
				        
				        if (input >= (answer - epsilon) && input <= (answer + epsilon)){
				        	io.println("Correct!");
				        	correct = true;
				        }else{
				        	io.println("Wrong!");
				        	if(maxTriesCounter == maxTries && revealAnswer){
				        		io.println("Correct answer is: " + answer + " +- " + epsilon);
				        	}
				        }
			        }
			        	if(correct){
			        	int lowestTries = Integer.MAX_VALUE;
			        		if(maxTriesCounter <= 1){
			        			if(1 < lowestTries){
			        				skip = true;
			        				lowestTries = 1;
			        				nextQ = "a3";
			        				}
			        			}
			        	}
			        }
			        
			        //repeat the following until a correct answer is given, or hit the maximum tries if there is.
			    	//1.print out the question,
			        //2.get user input 
			        //3.compare user input with the correct answer, and notify user correct or wrong answer
			    }
			
			//Generate codes for a question
			    {
			    if (!skip || (skip && nextQ.equals("a2"))){
			    	skip = false;
					boolean correct = false;
					int maxTriesCounter = 0;
					
					while(!correct && maxTriesCounter < maxTries){
						maxTriesCounter++;
						
				        int count = 1;
							        if(false && count == 1){
							        	io.println("What is 2 - 2? - choose an option.");
							        }else{
							        	io.println("What is 2 - 2? - write the correct answer.");
							        }
				        io.println("? " + count + ") 0.0 +- 0.0");
				        count++;
				        io.println("? " + count + ") 1.0 +- 0.0");
				        count++;
				        io.println("? " + count + ") 2.0 +- 0.0");
				        count++;
				        
				        
				        double input = io.inputDouble("");
				        double answer = 0.0;
				        double epsilon = 0.0;
				        
				        if (input >= (answer - epsilon) && input <= (answer + epsilon)){
				        	io.println("Correct!");
				        	correct = true;
				        }else{
				        	io.println("Wrong!");
				        	if(maxTriesCounter == maxTries && revealAnswer){
				        		io.println("Correct answer is: " + answer + " +- " + epsilon);
				        	}
				        }
			        }
			        	if(correct){
			        	int lowestTries = Integer.MAX_VALUE;
			        		if(maxTriesCounter <= 1){
			        			if(1 < lowestTries){
			        				skip = true;
			        				lowestTries = 1;
			        				nextQ = "b2";
			        				}
			        			}
			        	}
			        }
			        
			        //repeat the following until a correct answer is given, or hit the maximum tries if there is.
			    	//1.print out the question,
			        //2.get user input 
			        //3.compare user input with the correct answer, and notify user correct or wrong answer
			    }
			
			//Generate codes for a question
			    {
			    if (!skip || (skip && nextQ.equals("a3"))){
			    	skip = false;
					boolean correct = false;
					int maxTriesCounter = 0;
					
					while(!correct && maxTriesCounter < maxTries){
						maxTriesCounter++;
						
				        io.println("What is the square root of 2? - write the correct answer.");
				        
				        
				        double input = io.inputDouble("");
				        double answer = Math.sqrt(2);
				        double epsilon = 0.001;
				        
				        if (input >= (answer - epsilon) && input <= (answer + epsilon)){
				        	io.println("Correct!");
				        	correct = true;
				        }else{
				        	io.println("Wrong!");
				        	if(maxTriesCounter == maxTries && revealAnswer){
				        		io.println("Correct answer is: " + answer + " +- " + epsilon);
				        	}
				        }
			        }
			        	if(correct){
			        	int lowestTries = Integer.MAX_VALUE;
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
		maxTries = 1;
		revealAnswer = false;
			//Generate codes for a question
			    {
			    if (!skip || (skip && nextQ.equals("b1"))){
			    	skip = false;
					boolean correct = false;
					int maxTriesCounter = 0;
					
					while(!correct && maxTriesCounter < maxTries){
						maxTriesCounter++;
						
				        int count = 1;
							        if(true && count == 1){
							        	io.println("Where is Norway? - choose an option.");
							        }else{
							        	io.println("Where is Norway? - write the correct answer.");
							        }
				        io.println("? " + count + ") In the middle of somewhere");
				        count++;
				        io.println("? " + count + ") In the middle of anywhere");
				        count++;
				        io.println("? " + count + ") In the middle of nowhere");
				        count++;
				        
				        
				        int input = io.inputInt("");
				        
				        if (input == 3){
				        	io.println("Correct!");
				        	correct = true;
				        }else{
				        	io.println("Wrong!");
				        	if(maxTriesCounter == maxTries && revealAnswer){
				        		io.println("Correct answer is: " + 3);
				        	}
				        }
			        }
			        	if(correct){
			        	int lowestTries = Integer.MAX_VALUE;
			        	}
			        }
			        
			        //repeat the following until a correct answer is given, or hit the maximum tries if there is.
			    	//1.print out the question,
			        //2.get user input 
			        //3.compare user input with the correct answer, and notify user correct or wrong answer
			    }
			
			//Generate codes for a question
			    {
			    if (!skip || (skip && nextQ.equals("b2"))){
			    	skip = false;
					boolean correct = false;
					int maxTriesCounter = 0;
					
					while(!correct && maxTriesCounter < maxTries){
						maxTriesCounter++;
						
				        io.println("What is the capitol of Norway? - write the correct answer.");
				        
				        
				        String input = io.inputString("");
				        
				        if (input.toUpperCase().equals(("Oslo").toUpperCase())){
				        	io.println("Correct!");
				        	correct = true;
				        }else{
				        	io.println("Wrong!");
				        	if(maxTriesCounter == maxTries && revealAnswer){
				        		io.println("Correct answer is: Oslo");
				        	}
				        }
			        }
			        	if(correct){
			        	int lowestTries = Integer.MAX_VALUE;
			        	}
			        }
			        
			        //repeat the following until a correct answer is given, or hit the maximum tries if there is.
			    	//1.print out the question,
			        //2.get user input 
			        //3.compare user input with the correct answer, and notify user correct or wrong answer
			    }
		}
	}

	public static void main(String[] args) {
		new Example1().run();
	}
}
