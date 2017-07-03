package Session6Assignment2;

import java.io.PrintWriter;

public class NegativeAgeEception extends Exception{
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public NegativeAgeEception(String message) {
		super();
		this.message = message;
	}

	@Override
	public void printStackTrace(PrintWriter s) {
		// TODO Auto-generated method stub
		super.printStackTrace(s);
		System.out.println("Exception occured:: " +message+getStackTrace());
	}
	

}
