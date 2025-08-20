package Figure;

public class Rettangolo extends Figura{
    private double base;
    private double altezza;
    private double area;
    private double perimetro;
    public Rettangolo(double base, double altezza){
        this.base=base;
        this.altezza=altezza;
    }

    public final double calcolaPerimetro(){
        return perimetro= 2*(base+altezza);
    }

    @Override

    public final double calcolaArea(){
        return area=base+altezza;
    }
    
   
}
