public class Calculator { 
  	public static void main(String[] args) { 
 	Scanner s = new Scanner(System.in); 
System.out.println("'*' - матричний, '+' - звичайний, '-' - з польським записом"     +"\nВиберіть тип калькулятора: "); 
        String input = s.nextLine(); 
         
        if(input.equals("-")) { 
         	PostfixCalc rpn = new PostfixCalc();          	rpn.calculate(input);         } else if(input.equals("+")) {          	calc(s); 
        } else if(input.equals("*")) { 
         	Matrix matrix = new Matrix();          	matrix.matrixCalc(s);         } else 
         	System.exit(0);         s.close(); 
 	} 
 
 	public static void calc(Scanner s) { 
 
 	 	System.out.print("Введіть перше число: ");  	 	double n1 = s.nextDouble(); 
 	 	System.out.print("Введіть знак операції: "); 
 	 	String operation = s.next();  	 	System.out.print("Введіть друге число: ");  	 	double n2 = s.nextDouble(); 
 	 	 
  switch (operation)  {   case "+": 
 	 	 	System.out.println("Відповідь: " + (n1 + n2)); 
 	 	 	break; 
 	 	 	 
 	 	case "-": 
 	 	 	System.out.println("Відповідь: " + (n1 - n2)); 
 	 	 	break; 
 	 	 	 
 	 	case "/": 
 	 	 	System.out.println("Відповідь: " + (n1 / n2)); 
 	 	 	break; 
 	 	 	 
 	 	case "*": 
 	 	 	System.out.println("Відповідь: " + (n1 * n2)); 
 	 	 	break; 
 	 	 	 
 	 	default: 
 	 	 	System.out.println("Щось не так!"); 
 	 	 
 	 	} 
 	} 
} 
