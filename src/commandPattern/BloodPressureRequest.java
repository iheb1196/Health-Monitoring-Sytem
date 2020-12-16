package commandPattern;
/*Author      : Iheb Jendoubi 
 * University : MedTech-SMU
 * Data : 16/12/2020
 * Course : Software Analaysis and Design CS422
 */


public class BloodPressureRequest implements RequestCommand{
	 BloodPressureRequestHandler bpr;
	  
	  public BloodPressureRequest(BloodPressureRequestHandler bh) {
		  bpr=bh;
	  }
		@Override
		public void execute() {
			bpr.Action();
			
		}

}
