package zack;

import java.util.Scanner;
import java.util.Stack;

public class Expression {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//crate stack for oparators and oparands
		Stack<Integer> staint=new Stack<Integer>();
		Stack<Double> stadup=new Stack<Double>();
		//create stack for temparary  oparators and oparands.
		Stack<Integer> statempint =new Stack<Integer>();
		Stack<Double> statempdup=new Stack<Double>();
		
		System.out.println("enter your arthamatic Expression");
		String input=sc.next();
		       input="0"+input;
		       input=input.replaceAll("-", "+-");
		       
		       //store oparators and opatand in stack.
		       
		       String temp="";
		       for (int i = 0;i < input.length();i++)
		        {
		            char ch = input.charAt(i);
		            if (ch == '-')
		            {
		                temp =  temp + "-";
		             }
		            else if (ch != '+' &&  ch != '*' && ch != '/')
		            {
		               temp = temp + ch;
		            }
		            else
		            {
		            	stadup.push(Double.parseDouble(temp));
		            	staint.push((int)ch);
		                temp = "";
		             }
		        }
		       stadup.push(Double.parseDouble(temp));
		        /* Create char array of operators as per precedence */
		        /* -ve sign is already taken care of while storing */
		       
		        char operators[] = {'/','*','+'};
		        /* Evaluation of expression */
		        for (int i = 0; i < 3; i++)
		        {
		            boolean it = false;
		            while (!staint.isEmpty())
		            {
		                int optr = staint.pop();
		                double v1 = stadup.pop();
		                double v2 = stadup.pop();
		                if (optr == operators[i])
		                {
		                    /* if operator matches evaluate and store in temporary stack */
		                    if (i == 0)
		                    {
		                    	statempdup.push(v2 / v1);
		                        it = true;
		                        break;
		                    }
		                    else if (i == 1)
		                    {
		                    	statempdup.push(v2 * v1);
		                        it = true;
		                        break;
		                    }
		                    else if (i == 2)
		                    {
		                    	statempdup.push(v2 + v1);
		                        it = true;
		                        break;
		                    }                                        
		                }
		                else
		                {
		                	statempdup.push(v1);
		                	stadup.push(v2);
		                	statempint.push(optr);
		                }                
		            }    
		            /* Push back all elements from temporary stacks to main stacks */            
		            while (!statempdup.isEmpty())
		            	stadup.push(statempdup.pop());
		            while (!statempint.isEmpty())
		            	staint.push(statempint.pop());
		            /* Iterate again for same operator */
		            if (it)
		                i--;                            
		        }    
		        System.out.println("\nResult = "+stadup.pop());
		       
		
		 

	}

}
