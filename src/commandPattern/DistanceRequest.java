package commandPattern;
/*Author      : Iheb Jendoubi 
 * University : MedTech-SMU
 * Data : 16/12/2020
 * Course : Software Analaysis and Design CS422
 */


public class DistanceRequest implements RequestCommand {
	DistanceRequestHandler dh ;
	public DistanceRequest(DistanceRequestHandler dd) {
		dh=dd;
	}

	@Override
	public void execute() {
		dh.Action();
		
	}

}
