package healthMonotoringSystem;

import observerPattern.Observer;
/*Author      : Iheb Jendoubi 
 * University : MedTech-SMU
 * Data : 16/12/2020
 * Course : Software Analaysis and Design CS422
 */
import observerPattern.Subject;

public class Device implements Observer  {

	private double time ;
	private static int observerIdAssign =0;
	private int observerId;
	private Subject controlUnit;
	
	public Device (Subject newControl) {
		this.controlUnit=newControl;
		this.observerId=++observerIdAssign;
		System.out.println("New Observer "+this.observerId);
		controlUnit.attach(this);
		
	}
	@Override
	public void update(double time) {
		this.time=time;
		printThetime();
		
	}
	private void printThetime() {
		System.out.println("--------------------Update-----------------");
		System.out.println("The Observer's "+observerId + " new time is :" +time);
		
	}
	
	
	
	

}
