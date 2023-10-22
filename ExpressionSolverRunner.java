//© A+ Computer Science  -  www.apluscompsci.com
//Name - Yashvi M
//Date -3rd Oct
//Class -11
//Lab  -6

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolverRunner
{
	public static void main( String args[] )
	{

		ExpressionSolver test = new ExpressionSolver("3+5");
		test.solveExpression();
		out.println(test);
		ExpressionSolver test1 = new ExpressionSolver("3*5");
		test1.solveExpression();
		out.println(test1);
		ExpressionSolver test2 = new ExpressionSolver("3-5");
		test2.solveExpression();
		out.println(test2);
		ExpressionSolver test3 = new ExpressionSolver("5/5*2+8/2+5");
		test3.solveExpression();
		out.println(test3);
		ExpressionSolver test4 = new ExpressionSolver("5*5+2/2-8+5*5-2");
		test4.solveExpression();
		out.println(test4);
			}
		}