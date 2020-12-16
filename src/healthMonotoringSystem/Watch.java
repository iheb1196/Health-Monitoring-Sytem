package healthMonotoringSystem;

import templatePattern.Transmitter;
/*Author      : Iheb Jendoubi 
 * University : MedTech-SMU
 * Data : 16/12/2020
 * Course : Software Analaysis and Design CS422
 */

public class Watch extends Transmitter{

	@Override
	public void print() {
		 System.out.println("Print of watch reboot....");
		
	}

	@Override
	public void setValueToDefault() {
		System.out.println("Set Values to Default of watech reboot ...");
		
	}

	@Override
	public void storeState() {
		System.out.println("Store state of watch reboot ...");
		
	}

	@Override
	public void state() {
		System.out.println("----------------The watch new state------------------------");
		System.out.println("The Runner new distance after Reboot is 0m");
	}

	
		
	}


