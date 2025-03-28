public class Dreapta implements Shape{
    protected double lungime;
    public Dreapta(double lungime){
        this.lungime = lungime;
    }
    public double getPerimetru(){
        return lungime;
    }

    @Override
    public String toString(){
        return "Dreapta cu lungimea " + lungime;
    }
}
