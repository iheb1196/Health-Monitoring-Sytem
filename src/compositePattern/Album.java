package compositePattern;

import java.util.ArrayList;


import healthMonotoringSystem.Runner;
/*Author      : Iheb Jendoubi 
 * University : MedTech-SMU
 * Data : 16/12/2020
 * Course : Software Analaysis and Design CS422
 */
public class Album implements MusicItem {
	private String name;
    private ArrayList includedFiles = new ArrayList();

    public Album(String name) {
        this.name = name;
    }

    public void add(Object obj) {
        includedFiles.add(obj);
    }

    public void currentPlayList() {
        System.out.println(Runner.compositeBuilder + name);
      Runner.compositeBuilder.append("   ");
        for (Object includedFile : includedFiles) {
            // Leverage the "lowest common denominator"
            MusicItem obj = (MusicItem) includedFile;
            obj.currentPlayList();
        }
        Runner.compositeBuilder.setLength(Runner.compositeBuilder.length() - 3);
    }

}
