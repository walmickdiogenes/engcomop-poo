package ifce;

public class Vermelho implements Estado {

    @Override
    public Estado trocaVermelho() {
        return this;
    }

    @Override
    public Estado trocaAmarelo() {
        return this;
    }

    @Override
    public Estado trocaVerde() {
        return new Verde();
    }

    @Override
    public EstadoSemaforo getEstado() {
        return EstadoSemaforo.VERMELHO;
    }
}
