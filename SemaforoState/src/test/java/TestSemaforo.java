import ifce.EstadoSemaforo;
import ifce.Semaforo;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestSemaforo{
    @Test
    public void amareloVermelho(){
        Semaforo amc = new Semaforo();
        amc.trocaVerde();
        amc.trocaAmarelo();
        amc.trocaVermelho();
        assertEquals(EstadoSemaforo.VERMELHO, amc.getEstado());
    }
    @Test
    public void vermelhoVerde(){
        Semaforo amc = new Semaforo();
        amc.trocaVerde();
        assertEquals(EstadoSemaforo.VERDE, amc.getEstado());

    }

    @Test
    public void verdeamarelo(){
        Semaforo amc = new Semaforo();
        amc.trocaVerde();
        amc.trocaAmarelo();
        Assert.assertEquals(EstadoSemaforo.AMARELO, amc.getEstado());
    }


}
