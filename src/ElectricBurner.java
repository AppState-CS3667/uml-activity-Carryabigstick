public class ElectricBurner extends Burner{
    
    private double voltReq;
    double ampReq;

    public ElectricBurner(double voltReq)
    {
        super(600.0,100.0,20.0);
        this.voltReq = voltReq;

    }

    public void increaseCurrent()
    {
        ;
    }

    public void decreaseCurrent()
    {
        ;
    }

    public double getVoltReq()
    {
        return this.voltReq;
    }

    
}
