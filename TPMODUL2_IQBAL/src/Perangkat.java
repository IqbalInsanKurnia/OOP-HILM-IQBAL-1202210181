public class Perangkat {
    // attribute
    protected String drive; 
    protected int ram; 
    protected double processor;

    //constructor
    public Perangkat(String drive, int ram, double processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }

    //method public
    public void informasi(){
        System.out.println();
    }
}
