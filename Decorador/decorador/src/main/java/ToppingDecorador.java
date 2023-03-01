public class ToppingDecorador implements Helado {


    private Helado helado;


    public ToppingDecorador(Helado helado) {
        this.helado = helado;
    }


    @Override
    public String getDescripcion() {
        return helado.getDescripcion() + ", con Topping extra";
    }


    @Override
    public int getPrecio() {
        return helado.getPrecio() + 20;
    }
}