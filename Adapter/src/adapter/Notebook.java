package adapter;

public class Notebook implements Dispositivo{
    @Override
    public void iniciar() {
        System.out.println("O Notebook está sendo iniciado");
    }

    @Override
    public void desligar() {
        System.out.println("O Notebook está sendo desligado");
    }

    @Override
    public void reiniciar() {
        this.desligar();
        this.iniciar();
    }
}
