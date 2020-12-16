package compositePattern;

import healthMonotoringSystem.Runner;
/*Author      : Iheb Jendoubi 
 * University : MedTech-SMU
 * Data : 16/12/2020
 * Course : Software Analaysis and Design CS422
 */
public class Track implements MusicItem {
	   private String name;

	    public Track(String name) {
	        this.name = name;
	    }

	    public void currentPlayList() {
	        System.out.println(Runner.compositeBuilder + name);
	    }

}
