package operations;

public class Calculator {
	static double result;
	
	public static double Operate(String operation, double num1, double num2){
		
		
		if(operation.equals("addition")){
		result=num1+num2;	
		}else if(operation.equals("subtraction")){
			result=num1-num2;
		}else if(operation.equals("multiplication")){
			result=num1*num2;
		}else if (operation.equals("division")){
			result=num1/num2;
		}else{
			System.out.println("Write true operation");
		}
	return result;
	}
}
