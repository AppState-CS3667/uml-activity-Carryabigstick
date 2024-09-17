public class GasBurner extends Burner{

    private String gasType;

    public GasBurner()
    {
        super(600.0,200.0,35.0);
    }

    public boolean spark()
    {
        return true;
    }

    public String getGasType()
    {
        return gasType;
    }

    private void increaseGasFlow()
    {
        ;
    }

    private void decreaseGasFlow()
    {
        ;
    }
}