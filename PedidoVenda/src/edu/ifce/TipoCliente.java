package edu.ifce;

public enum TipoCliente {
    PESSOA_FISICA(1), PESSOA_JURIDICA(2);
    private int valor;

    TipoCliente(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
