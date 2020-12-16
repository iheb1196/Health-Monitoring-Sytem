package iteratorPattern;
/*Author      : Iheb Jendoubi 
 * University : MedTech-SMU
 * Data : 16/12/2020
 * Course : Software Analaysis and Design CS422
 */


public interface ServiceCollection {
	public void addService(Service s);
	public void removeService(Service s);
	public ServiceIterator iterator(ServiceTypeEnum type);

}
