package ifce;

public class Amarelo implements Estado {
    @Override
    public Estado trocaVermelho() {
        return new Vermelho();
    }

    @Override
    public Estado trocaAmarelo() {
        return this;
    }

    @Override
    public Estado trocaVerde() {
        return this;
    }

    @Override
    public EstadoSemaforo getEstado() {
        return EstadoSemaforo.AMARELO;
    }
}
