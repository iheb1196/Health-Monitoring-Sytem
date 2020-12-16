package templatePattern;

public abstract class Transmitter {
	public abstract  void print();
    public abstract void setValueToDefault();
    public abstract void storeState();
    public abstract void state();
    
    public final void reboot() {
      storeState();
      setValueToDefault();
      print();
      state();
    }

}
