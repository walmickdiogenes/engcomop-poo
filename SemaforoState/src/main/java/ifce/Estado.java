package ifce;

public interface Estado {
    Estado trocaVermelho();
    Estado trocaAmarelo();
    Estado trocaVerde();

    EstadoSemaforo getEstado();
}
