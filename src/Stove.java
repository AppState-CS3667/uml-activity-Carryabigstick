/**
 * Stove
 */
public class Stove {

    private Burner[] burners;

    public boolean hookUp()
    {
        return true;
    }

    public void setBurnerTemp(int burner, double temp)
    {
        ;
    }

    public boolean isHot(int burner)
    {
        return burners[burner].isHot();
    }

    public double getBurnerTemp(int burner)
    {
        return burners[burner].getMaxTemp();
    }

    public Burner getBurner(int burner)
    {
        return burners[burner];

    }
}