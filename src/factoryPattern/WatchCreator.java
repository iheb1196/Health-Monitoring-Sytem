package factoryPattern;

import healthMonotoringSystem.Watch;
import templatePattern.Transmitter;
/*Author      : Iheb Jendoubi 
 * University : MedTech-SMU
 * Data : 16/12/2020
 * Course : Software Analaysis and Design CS422
 */
public class WatchCreator implements TransmitterFactory {
	@Override
	public Transmitter createTransmitter() {
		System.out.println("==> The Watch is created successfully ");
		return new Watch();
	}


}
