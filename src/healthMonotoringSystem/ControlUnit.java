package healthMonotoringSystem;

import java.util.ArrayList;
/*Author      : Iheb Jendoubi 
 * University : MedTech-SMU
 * Data : 16/12/2020
 * Course : Software Analaysis and Design CS422
 */

import observerPattern.Observer;
import observerPattern.Subject;

public class ControlUnit implements Subject {
	
	private double time ;
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	

	@Override
	public void attach(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void dettach(Observer o) {
		int observerIndex=observers.indexOf(o);
		System.out.println("we'll delete the observer of index "+observerIndex);
		observers.remove(observerIndex);
		
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update( time);
		}
		
	}
	public void setTime(double newTime) {
		this.time=newTime;
		notifyObservers();
	}

}
