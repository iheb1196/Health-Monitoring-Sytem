package commandPattern;
/*Author      : Iheb Jendoubi 
 * University : MedTech-SMU
 * Data : 16/12/2020
 * Course : Software Analaysis and Design CS422
 */


public class Invoker {
	RequestCommand comm ;
	public Invoker(RequestCommand commend) {
		comm=commend;
	}
	public void press() {
		comm.execute();
	}

}
