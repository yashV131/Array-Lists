//? A+ Computer Science  -  www.apluscompsci.com
//Name - Yashvi M
//Date - 3rd October
//Class - 11
//Lab  -6

import java.util.ArrayList;;
public class ExpressionSolver
{
	//add in instance variables
	private ArrayList<String> list;
	private String expression;
	private ArrayList<String> l;
	private int num1;
	private int num2;
	private int calc;
	private int pos;

	public ExpressionSolver(String s)
	{
		list=new ArrayList<>();
		l=new ArrayList<>();
		expression=s;
		for(int i=0;i<expression.length();i++){
			if(expression.charAt(i)!=' ') {
				list.add(""+expression.charAt(i));
				l.add(""+expression.charAt(i));
			}
		}

	}
	public void setExpression(String s)
	{
		expression=s;
		for(int i=0;i<expression.length();i++){
			if(expression.charAt(i)!=' ') {
				list.add(""+expression.charAt(i));
				l.add(""+expression.charAt(i));
			}
		}
	}
	public void solveExpression()
	{
		while (l.contains("*")||l.contains("/")){
			if(l.contains("*")&&l.contains("/")){
				pos = Math.min(l.indexOf("*"), l.indexOf("/"));
			}
			else if(l.contains("*")){
				pos=l.indexOf("*");
			}
			else if ( l.contains("/")){
				pos=l.indexOf("/");
			}
			num1=Integer.parseInt(l.get(pos - 1));
			num2=Integer.parseInt(l.get(pos + 1));
			if (l.get(pos).equals("*")) {
				calc = num1 * num2;
			}
			else {
				calc = num1 / num2;
			}
			l.set(pos+1,""+calc);
			l.remove(pos);
			l.remove(pos-1);
		}
		while (l.contains("+")||l.contains("-")){
			if(l.contains("+")&&l.contains("-")){
				pos = Math.min(l.indexOf("+"), l.indexOf("-"));
			}
			else if(l.contains("+")){
				pos=l.indexOf("+");
			}
			else if ( l.contains("-")){
				pos=l.indexOf("-");
			}
			num1=Integer.parseInt(l.get(pos - 1));
			num2=Integer.parseInt(l.get(pos + 1));
			if (l.get(pos).equals("+")) {
				calc = num1 + num2;
			}
			else {
				calc = num1 - num2;
			}
			l.set(pos+1,""+calc);
			l.remove(pos);
			l.remove(pos-1);

		}
		list.add("= "+l.get(0));
	}
	public String toString( )
	{
		return ""+list;
	}
}