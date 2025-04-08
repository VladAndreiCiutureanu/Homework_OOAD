public class C2NrToC3Nr implements Suma{
    private C2Nr c2nr;
    public C2NrToC3Nr(C2Nr c2nr)
    {
        this.c2nr = c2nr;
    }

    public int suma(int x, int y, int z) {
        return c2nr.suma2nr(c2nr.suma2nr(x,y),z);
    }
}
