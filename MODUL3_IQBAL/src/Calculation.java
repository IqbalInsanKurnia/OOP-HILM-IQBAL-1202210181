import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculation implements Runnable {

    double radius;
    double side;
    double area;
    double phi = 3.14;

    public void setSquare(double side)
    throws IllegalArgumentException{
        if (side<1){
            throw new IllegalArgumentException("Sisi harus kurang dari 1")
        }
        this.side = side;
        this.area = side*side;
    }

    public double getSquare() {
        return side;
    }

    public void setCircle(double radius)
    throws IllegalArgumentException{
        if(radius<1){
            throw new IllegalArgumentException("Radius harus kurang dari 1")
        }
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }
    
}
