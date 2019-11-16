package adapter;

public class CelularAdapter implements Dispositivo{
    CelularAndroid celular;

    public CelularAdapter(){
        celular = new CelularAndroid();
    }

    @Override
    public void iniciar() {
        celular.ligarDispositivo();
    }

    @Override
    public void desligar() {
        celular.desligarDispositivo();
    }

    @Override
    public void reiniciar() {
        celular.desligarDispositivo();
        celular.ligarDispositivo();
    }
}
