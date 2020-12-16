package healthMonotoringSystem;

import templatePattern.Transmitter;
/*Author      : Iheb Jendoubi 
 * University : MedTech-SMU
 * Data : 16/12/2020
 * Course : Software Analaysis and Design CS422
 */

public class BloodPressureBelt extends  Transmitter {

	@Override
	public void print() {
		 System.out.println("Print of BloodPressureBelt Reboot.... ");
		
	}

	@Override
	public void setValueToDefault() {
		System.out.println("Set Values To Default of Blood Pressure Belt Reboot....");
		
	}

	@Override
	public void storeState() {
		System.out.println("Store State of Blood Pressure Belt reboot ....");
		
	}
	public void state() {
		System.out.println("---------------------The BloodPressure new state-----------------------------");
		System.out.println("The runner new Blood Pressure after reboot is 0 mmHg");
	}

}
