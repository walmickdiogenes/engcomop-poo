package ibanheiz;

public class CalcularFrete {

	private FreteID frete;
	private String cepOrigem;
	private String cepDestino;
	private NotaFiscal notaFiscal;
	
	/**
	 * @author Nicolas Ibanheiz
	 * @return valor calculado do frete
	 */
	public double valorFrete() {
		return frete.calcular(cepOrigem, cepDestino, notaFiscal);
	}
	
	/**
	 * @param frete the frete to set
	 */
	public void setFrete(FreteID frete) {
		this.frete = frete;
	}
}
