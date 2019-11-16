package ifce;

import java.sql.SQLOutput;

public class Semaforo {
    private Estado estadoAtual;

    //SEMAFORO
    public void expedicionarios(){
        bolinha();
        while (true){
            delay(25000);
            this.trocaVerde();
            bolinha();
            delay(25000);
            this.trocaAmarelo();
            bolinha();
            delay(5000);
            this.trocaVermelho();
            bolinha();
        }
    }

    //prints das bolinhas
    public void bolinha(){
        if (estadoAtual.getEstado() == EstadoSemaforo.VERMELHO){
            System.out.print("\n");
            System.out.print(ANSI_RED + "Vermelho" + ANSI_RESET );
        } if (estadoAtual.getEstado() == EstadoSemaforo.AMARELO){
            System.out.print("\n");
            System.out.print(ANSI_YELLOW + "Amarelo" + ANSI_RESET );
        } if (estadoAtual.getEstado() == EstadoSemaforo.VERDE){
            System.out.print("\n");
            System.out.print(ANSI_GREEN + "Verde" + ANSI_RESET);
        }
    }

    //inicializa o sinal vermelho
    public Semaforo(){
        this.estadoAtual = new Vermelho();
    }

    // função para trocar o estado atual para vermelho
    public void trocaVermelho(){
        estadoAtual = estadoAtual.trocaVermelho();
    }

    // função para trocar o estado atual para amarelo
    public void trocaAmarelo(){
        estadoAtual = estadoAtual.trocaAmarelo();
    }

    // função para trocar o estado atual para verde
    public void trocaVerde(){
        estadoAtual = estadoAtual.trocaVerde();
    }

    // função acessora do estado atual
    public EstadoSemaforo getEstado(){
        return estadoAtual.getEstado();
    }

    // função para estabelecer o tempo de espera
    public void delay(int delay){
        try {
            Thread.sleep(delay);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    //cores das bolinhas
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
}

