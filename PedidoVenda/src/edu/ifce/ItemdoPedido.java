package edu.ifce;

public class ItemdoPedido {
    private int sequencial;
    private int qtd;
    private Produto produto;
    private float valorItem;

    public ItemdoPedido (int sequencial, int qtd, Produto produto){
        this.sequencial = sequencial;
        this.qtd = qtd;
        this.produto = produto;
        this.valorItem =  (qtd * getProduto().getValorProduto());
    }

    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getValorItem() {
        return valorItem;
    }

    public void setValorItem(float valorItem) {
        this.valorItem = valorItem;
    }
}
