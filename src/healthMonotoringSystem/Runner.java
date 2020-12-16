package healthMonotoringSystem;
import java.util.Scanner;
import adapterPattern.PrinterAdapter;
import compositePattern.Album;
import compositePattern.Track;
import facadePattern.RequestFacade;
import factoryPattern.BloodPressureBeltCreator;
import factoryPattern.TransmitterFactory;
import factoryPattern.WatchCreator;
import iteratorPattern.Service;
import iteratorPattern.ServiceCollection;
import iteratorPattern.ServiceCollectionImplementation;
import iteratorPattern.ServiceIterator;
import iteratorPattern.ServiceTypeEnum;
import templatePattern.Transmitter;

/*Author      : Iheb Jendoubi 
 * University : MedTech-SMU
 * Data : 16/12/2020
 * Course : Software Analaysis and Design CS422
 */
public class Runner {
	int i  ;
    public static StringBuffer compositeBuilder = new StringBuffer();
    
    //***Singleton Pattern***
    private static Runner runnerInstance = new Runner();
	private Runner() {}
	public static Runner getInstance() {
		System.out.println("this is the unique instance of the runner: Singleton Pattern works succesffully");
		System.out.println("Let's the journey into design patterns begin ");
		System.out.println("*******************************************************************************");
		return runnerInstance;
		
		
		
	}
	
	public static void main(String[] args) {
		
		Runner runner = Runner.getInstance();
		
		
		
		
		//***Observer***
		System.out.println("THE FOLLOWING IS THE OBSERVER PATTERN ");
		System.out.println("******************************************************************************");
		ControlUnit controlUnit = new ControlUnit();
		//We attach a new observer to the subject control unit 
		Device observer1 = new Device(controlUnit);
		//we update the subject's state by setTime() Method 
		controlUnit.setTime(9.00);
		controlUnit.setTime(11.00);
		System.out.println("");
		System.out.println("");
		
		//***Command Pattern and Facade***
		System.out.println("THE FOLLOWING IS THE FACADE PATTERN AND THE COMMAND PATTERN ");
		System.out.println("******************************************************************************");
		RequestFacade facade =new RequestFacade() ;
		facade.measureBloodPressure();
		facade.measureDistance();
		System.out.println("");
		System.out.println("");
		
		
		
		
		
		//***Factory Pattern And Template Pattern ***
		System.out.println("THE FOLLOWING IS THE FACTORY PATTERN AND TEMPLATE PATTERN");
		System.out.println("******************************************************************************");
		
		Scanner sc= new Scanner(System.in);  
		System.out.print("Do you want to reboot your transmitter (YES/NO) :");
		String str1=sc.nextLine();
	    Scanner sc1= new Scanner(System.in);  
		System.out.print("PLEASE ENTER THE TRANSMITTER TYPE (WATCH/BLOODPRESSUREBELT) ");  
		String str= sc1.nextLine();
		
		if (  str.equalsIgnoreCase("Watch")  && str1.equalsIgnoreCase("NO"))  {
			System.out.println("The Watch creation loading ...");
			TransmitterFactory fac = new WatchCreator();
			Transmitter watch =fac.createTransmitter();
		   }
			//watch.reboot();
			else if (str.equalsIgnoreCase("BloodPressureBelt") && str1.equalsIgnoreCase("NO")){
				System.out.println("The BloodPressure Belt creation loading ...");
				TransmitterFactory fac = new BloodPressureBeltCreator();
				Transmitter bloodPressureBelt=fac.createTransmitter();
				
			}
			else if (str.equalsIgnoreCase("BloodPressureBelt") && str1.equalsIgnoreCase("YES")) {
				
				TransmitterFactory fac = new BloodPressureBeltCreator();
				Transmitter bloodPressureBelt=fac.createTransmitter();
				System.out.println("The BloodPressure Belt is Rebooting  ...");
				bloodPressureBelt.reboot();
				
			}
			else if (str.equalsIgnoreCase("Watch") && str1.equalsIgnoreCase("YES")) {
				
				TransmitterFactory fac = new WatchCreator();
				Transmitter watch =fac.createTransmitter();
				System.out.println("The Watch is rebooting ...");
				watch.reboot();
				}
			else {
				System.out.println("THIS TRANSMITTER DOES NOT EXIST");
			}
		System.out.println("");
		System.out.println("");
		
		//***CompositePattern***
		System.out.println("THE FOLLOWING IS THE COMPOSITE PATTERN");
		System.out.println("******************************************************************************");
		 Album myAlbum = new Album("Dream");
		 Album myAlbum1 = new Album("Plastic Hearts");
		 Album myAlbum2 = new Album("Love For All");
	       Track track1 = new Track("Don't call me Angel.mp3");
	       Track track2 = new Track("Bad Karma.mp3");
	       Track track3 = new Track("High Way to Hell.mp3");
	       Track track4 = new Track("High.mp3");
	       Track track5 = new Track("Ain't No Sunshine.mp3");
	        myAlbum.add(track1);
	        myAlbum.add(myAlbum1);
	        myAlbum.add(track2);
	        myAlbum1.add(track3);
	        myAlbum1.add(track4);
	        myAlbum1.add(myAlbum2);
	        
	        myAlbum2.add(track5);
	        System.out.println("----------------The Runner trackList --------------------------------");
	        System.out.println("The TrackList is Loading ....");
	        
	       
	        
	        myAlbum.currentPlayList();
	        System.out.println("Choose A track");
	        Scanner sc2= new Scanner(System.in);  
			System.out.print("Please choose a track from the current Play List ♫:");
			String str2=sc2.nextLine();
			
			System.out.println("You are listenning to ♫♫♫ "+str2+" ♫♫♫");
	        
	        System.out.println("");
	        System.out.println("");
	        
	        
	        
	        
	        //***Adapter Pattern***
	        System.out.println("THE FOLLOWING IS THE ADAPTER PATTERN");
	        System.out.println("***************************************************************************************");
	        System.out.println("");
	        PrinterAdapter p = new PrinterAdapter();
	        System.out.println("Printing ....");
	        p.Print();
			System.out.println("");
			System.out.println("");
			
			

			//***Iterator Pattern***
			//We use the iterator pattern when the user wants to see all its available DELUXE/BASIC
			System.out.println("THE FOLLOWING IS THE ITERATOR PATTERN ");
			System.out.println("********************************************************************************************");
			
		
		  ServiceCollection services= populateServices();
		  System.out.println("---------------------Display ALL Available Services---------------");
			ServiceIterator baseIterator = services.iterator(ServiceTypeEnum.ALL);
			while (baseIterator.hasNext()) {
				Service s = baseIterator.next();
				System.out.println(s.toString());
			}
			System.out.println("");
			System.out.println("");
			
			System.out.println("--------------------Display Deluxe Services-------------------------");
			// Service Type Iterator
			ServiceIterator deluxeIterator = services.iterator(ServiceTypeEnum.DeluxeService);
			while (deluxeIterator.hasNext()) {
				Service s = deluxeIterator.next();
				System.out.println(s.toString());
			}
		}

		private static ServiceCollection populateServices() {
			ServiceCollection services = new ServiceCollectionImplementation();
			services.addService(new Service("DeluxeBloodPressureBelt", ServiceTypeEnum.DeluxeService));
			services.addService(new Service("DeluxeHeartBeatMeasurement", ServiceTypeEnum.DeluxeService));
			services.addService(new Service("BasicWatch", ServiceTypeEnum.BasicService));
			services.addService(new Service("DeluxeWatch", ServiceTypeEnum.DeluxeService));
			services.addService(new Service("BasicBloodPressureBelt", ServiceTypeEnum.BasicService));
			
			return services;
		}
		
		
	        
	       
	        
	        
	       
	}
	
		
		
	
		

	
	


