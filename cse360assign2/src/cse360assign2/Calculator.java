package cse360assign2;
/**
 * This class implements a simple calculator structure, calculator could do 
 * add, subtract, multiply and add operation, display calculated history.
 * 
 * 
 * @author Xueling Meng
 * @ClassID: 489
 * @since 2019-2-24
 */

public class Calculator {

	private int total;
	private String output = "0";
	public Calculator () {
		total = 0;  //  initial variable value
	}
	
	/**
	 * This method should return the current total value
	 * @return - current total value
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * This method should add parameter to the total variable
	 * @param value - the value to be add
	 */
	public void add (int value) {
		total = total + value;
		output = output + " + " + value;
	}
	
	/**
	 * This method should subtract parameter from total variable
	 * @param value - the value to be subtracted
	 */
	public void subtract (int value) {
		total = total - value;
		output = output + " - " + value;
	}
	
	/**
	 * This method should multiply the total variable by the parameter
	 * @param value - the value to be multiplied
	 */
	public void multiply (int value) {
		total = total * value;
		output = output + " * " + value;
	}
	
	/**
	 * This method should divide the total by the parameter, if parameter is zero
	 * set the total to zero
	 * @param value - the value to be divided
	 */
	public void divide (int value) {
		if (value == 0)
			total = (int) Math.floor(total / value);
		else 
			total = total / value;
		output = output + " / " + value;
	}
	
	/**
	 * The getHistory method will return a history of all actions as a String.
	 * @return - calculation history String
	 */
	public String getHistory () {
		return output;
	}
}