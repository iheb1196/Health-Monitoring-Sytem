package observerPattern;
/*Author      : Iheb Jendoubi 
 * University : MedTech-SMU
 * Data : 16/12/2020
 * Course : Software Analaysis and Design CS422
 */


public interface Subject {
	public void attach(Observer o);
	public void dettach(Observer o);
	public void notifyObservers();

}
