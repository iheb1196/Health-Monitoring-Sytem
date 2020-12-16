package facadePattern;

import adapterPattern.Printer;
import commandPattern.BloodPressureRequest;
import commandPattern.BloodPressureRequestHandler;
import commandPattern.DistanceRequest;
import commandPattern.DistanceRequestHandler;
import commandPattern.Invoker;
/*Author      : Iheb Jendoubi 
 * University : MedTech-SMU
 * Data : 16/12/2020
 * Course : Software Analaysis and Design CS422
 */
public class RequestFacade {
public void measureBloodPressure() {
		
		BloodPressureRequestHandler bloodhand = new BloodPressureRequestHandler();
		BloodPressureRequest bloodPressureReq= new BloodPressureRequest(bloodhand);
		Invoker onPress = new Invoker(bloodPressureReq);
		System.out.println("---------Blood Pressure Request Handler------------");
		onPress.press();
	}
	
	public void measureDistance() {
		DistanceRequestHandler distanceHandler = new DistanceRequestHandler();
		DistanceRequest distanceReq = new DistanceRequest(distanceHandler);
		Invoker onPress=new Invoker(distanceReq);
		System.out.println("----------Distance Request Handler-----------------");
		onPress.press();
	}
	
	
	public void PrintService(Printer p) {
		p.Print();
	}

}
