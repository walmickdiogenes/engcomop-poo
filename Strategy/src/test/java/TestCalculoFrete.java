import ibanheiz.CalcularFrete;
import ibanheiz.FreteFracionado;
import ibanheiz.FreteID;
import ibanheiz.NotaFiscal;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestCalculoFrete {

    @Test
    public void teste_fracionado (){
        NotaFiscal n1 = mock (NotaFiscal.class);
        CalcularFrete c1 = mock(CalcularFrete.class);
        FreteFracionado f1 = mock(FreteFracionado.class);

        c1.setFrete(f1);
        when(c1.valorFrete()).thenReturn(100.0);

        double valorEsperado = 100.0;
        double valorRetornado = c1.valorFrete();

        Assert.assertEquals(valorEsperado,valorRetornado,0);
    }

    @Test
    public void teste_lotacao (){
        NotaFiscal n1 = mock (NotaFiscal.class);
        CalcularFrete c1 = mock(CalcularFrete.class);
        FreteFracionado f1 = mock(FreteFracionado.class);

        when(c1.valorFrete()).thenReturn(250.0);

        double valorEsperado = 250.0;
        double valorRetornado = c1.valorFrete();

        Assert.assertEquals(valorEsperado,valorRetornado,0);
    }

}
