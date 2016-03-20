//U10416027 董郡麟

//import java api
import java.util.Scanner;
import java.util.ArrayList;

//main class
public class UseRepeatAdditionQuiz{
	//main method
	public static void main(String[] args){
		
		//import scanner
		Scanner scan = new Scanner(System.in);
		
		//creat an object
		RepeatAdditionQuiz r = new RepeatAdditionQuiz();
		
		//creat arraylist object
	    ArrayList array = new ArrayList();
		
		//ask the user what is the answer
		System.out.println("What is the answer " + r.getNum1() + " + " + r.getNum2() + " is ?" );
		
		int type = scan.nextInt();
		
		//add number to the arraylist
		array.add(type);

		//judge the answer is correct or not
		while(r.getNum1() + r.getNum2() != type){
			System.out.println("錯了, 再輸入一次");
			type = scan.nextInt();
			
			//judge the integer is already entered or not
			while(array.contains(type) == true){
				System.out.println("你已經輸入過 " + type + " 了");
				type = scan.nextInt();
			}
			array.add(type);
		}
		
		//answer is correct
		System.out.println("答對了!!");
	}
}
