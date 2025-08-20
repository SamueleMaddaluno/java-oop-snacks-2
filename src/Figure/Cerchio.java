package Figure;

public class Cerchio extends Figura{
    private double raggio;
    private double area;
    public static final double PI_GRECO=3.14;

    public Cerchio(double raggio){
        this.raggio=raggio;
    }
    @Override

    public double calcolaArea(){
        return area= raggio*raggio*PI_GRECO;
    }
}
