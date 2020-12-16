package iteratorPattern;
/*Author      : Iheb Jendoubi 
 * University : MedTech-SMU
 * Data : 16/12/2020
 * Course : Software Analaysis and Design CS422
 */


public class Service {
	private String serviceName;
	private ServiceTypeEnum type;
	
	public Service (String name , ServiceTypeEnum typ) {
		this.serviceName=name;
		this.type=typ;
	}

	public String getServiceName() {
		return serviceName;
	}

	

	public ServiceTypeEnum getType() {
		return type;
	}

	public String toString() {
		return "ServiceType= "+this.type+" ,ServiceName= "+this.serviceName;
	}

}
