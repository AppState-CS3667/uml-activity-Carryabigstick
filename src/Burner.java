public class Burner
{

    private double diameter;
    private double maxTemp;
    private double minTemp;
    private Boolean isHot;

    public Burner(double maxTemp, double minTemp, double diameter)
    {
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.diameter = diameter;
    }

    public boolean turnOn()
    {
        return true;
    }
    
    public boolean turnOff()
    {
        return false;
    }

    public void increaseTemp()
    {
        ;
    }

    public void decreaseTemp()
    {
        ;
    }

    public double getDiameter()
    {
        return this.diameter;
    }

    public double getMaxTemp()
    {
        return this.maxTemp;
    }
    
    public double getMinTemp()
    {
        return this.minTemp;
    }

    public boolean isHot()
    {
        return this.isHot;
    }
    

    


    
}