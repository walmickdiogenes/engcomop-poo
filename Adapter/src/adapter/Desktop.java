package adapter;

public class Desktop implements Dispositivo{
    @Override
    public void iniciar() {
        System.out.println("O Desktop está sendo iniciado");
    }

    @Override
    public void desligar() {
        System.out.println("O Desktop está sendo encerrado");
    }

    @Override
    public void reiniciar() {
        this.desligar();
        this.iniciar();
    }
}
