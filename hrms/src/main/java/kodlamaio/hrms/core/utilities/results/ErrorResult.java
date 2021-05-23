package kodlamaio.hrms.core.utilities.results;

public class ErrorResult extends Result{
	public ErrorResult() {
		super(false);
		// TODO Auto-generated constructor stub
	}
	public ErrorResult(String message) {
		super(false,message);
	} 
}
