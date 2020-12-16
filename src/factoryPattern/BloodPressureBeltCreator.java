package factoryPattern;

import healthMonotoringSystem.BloodPressureBelt;

import templatePattern.Transmitter;
/*Author      : Iheb Jendoubi 
 * University : MedTech-SMU
 * Data : 16/12/2020
 * Course : Software Analaysis and Design CS422
 */

public class BloodPressureBeltCreator implements TransmitterFactory {
	public Transmitter createTransmitter() {
		System.out.println("==> The BloodPressure Belt  is created successfully ");
		return new BloodPressureBelt();
	}

}
