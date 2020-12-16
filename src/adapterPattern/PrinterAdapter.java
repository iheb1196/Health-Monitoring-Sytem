package adapterPattern;
/*Author      : Iheb Jendoubi 
 * University : MedTech-SMU
 * Data : 16/12/2020
 * Course : Software Analaysis and Design CS422
 */


public class PrinterAdapter {
	OtherPrinter p =new OtherPrinter() ;
	public void Print() {
	((OtherPrinter) p).specificPrint();

			
		}

}
