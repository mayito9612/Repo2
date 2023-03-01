public class GalletaDecorador implements Helado {


    private Helado helado;


    public GalletaDecorador(Helado helado) {
        this.helado = helado;
    }


    @Override
    public String getDescripcion() {
        return helado.getDescripcion() + ", con Galleta extra";
    }


    @Override
    public int getPrecio() {
        return helado.getPrecio() + 15;
    }
}