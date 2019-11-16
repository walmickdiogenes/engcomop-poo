package ifce;

public class Verde implements Estado {
    @Override
    public Estado trocaVermelho() {
        return this;
    }

    @Override
    public Estado trocaAmarelo() {
        return new Amarelo();
    }

    @Override
    public Estado trocaVerde() {
        return this;
    }

    @Override
    public EstadoSemaforo getEstado() {
        return EstadoSemaforo.VERDE;
    }
}
