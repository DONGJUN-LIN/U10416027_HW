//U10416027 董郡麟

//import java api
import java.util.Scanner;
import java.util.ArrayList;

public class RepeatAdditionQuiz{
	
	//data fields
	private int ans;
	private int num1 = (int)(Math.random() * 10);
	private int num2 = (int)(Math.random() * 10);

	//constrctor
	public RepeatAdditionQuiz(int ans, int num1, int num2){
		this.ans = ans;
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//no-args constructor
	public RepeatAdditionQuiz(){
		
	}
	
	//method getnum1
	public int getNum1(){
		return num1;
	}
	
	//method getnum2
	public int getNum2(){
		return num2;
	}

	//method getans
	public int getAns(){
		ans = num1 + num2;
		return ans;
	}
}
