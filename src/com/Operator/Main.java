package com.Operator;

public class Main {

	public static void main(String[] args) {
		int result = 4 + 2;
		System.out.println("4 + 2 = "+result);
		//values on both side of operators is called operand
		int previousResult = result;
		result = result - 1;
		System.out.println(previousResult+" - 1 = "+result);
		
		previousResult = result;
		result = result * 2;
		System.out.println(previousResult+" * 2 = "+result);
		
		previousResult = result;
		result = result / 2;
		System.out.println(previousResult+" / 2 = "+result);
		
		previousResult = result;
		result = result % 3;
		System.out.println(previousResult+" % 3 = "+result);
		//this will add one to result
		previousResult = result;
		result++;
		System.out.println("result++ = "+result);
		
		//this will minus one to result
		previousResult = result;
		result--;
		System.out.println("result-- = "+result);
		
		//this will multiply result by 3
		previousResult = result;
		result*= 3;
		System.out.println("result*= = "+result);
		
		//this will divide result by 3
		previousResult = result;
		result+= 3;
		System.out.println("result*= = "+result);
		
		//this will minus 3 from the result
		previousResult = result;
		result-= 3;
		System.out.println("result-= = "+result);
		
		//this will divide result by 2 from the result
		previousResult = result;
		result/= 2;
		System.out.println("result/= = "+result);
		
		boolean isAllen = false; //'=' is a assignment operator 
		if (isAllen == true) // '==' check condition
			System.out.println("it is not an allen");
		
		int topScore = 100;
		if (topScore == 100)
			System.out.println("you have top score");
		
		
		if (topScore > 100)
			System.out.println("you have top score");
		
		int secondTopScore = 60;
		if ((topScore > secondTopScore) && (secondTopScore < 100)) //right side operand for first condition   
		System.out.println("you have top score"); //should be a variable
		
		//int secondTopScore = 60;
		if ((topScore > secondTopScore) || (secondTopScore > 100)) //right side operand for first condition   
			System.out.println("one test is true"); //should be a variable
		
		boolean isCar = true;
		if (isCar) //by default it check for true
			System.out.println("1 this is a car"); //should be a variable
		
		
		if (isCar == true)
			System.out.println(" 2 this is a car"); //should be a variable
		
		boolean wasCar = isCar ? true : false; //Ternary
		if (wasCar)
			System.out.println("3 was is a car"); //should be a variable
		
		double testQuiz1 = 20;
		double testQuiz2 = 80;
		double testQuiz3 = (testQuiz1 + testQuiz2) * 25;
		System.out.println(testQuiz3);
		double testQuiz4 = testQuiz3 % 40;
		System.out.println(testQuiz4);
		if (testQuiz4 <= 20)
			System.out.println("total is less then 20");
		
	}

}
