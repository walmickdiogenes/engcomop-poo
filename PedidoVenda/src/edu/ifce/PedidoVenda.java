package edu.ifce;
import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.Date;

public class PedidoVenda {
    private int codigo;
    private Date date;
    private Cliente cliente;
    private Vendedor vendedor;
    private Veiculo veiculo;
    private float valorPedido;
    private ArrayList<ItemdoPedido> items = new ArrayList<ItemdoPedido>();

    public PedidoVenda(int codigo, Cliente cliente, Vendedor vendedor, Veiculo veiculo) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.veiculo = veiculo;
        this.valorPedido = (getValorPedido());
        this.date = new Date();
    }

    public ArrayList<ItemdoPedido> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemdoPedido> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        System.out.println("\t\t\t\t\t\t\t\tPEDIDO DE VENDA\n");
        System.out.print("Numero do pedido: " + getCodigo() + "\t\t\t\t\t\t\t\t\t");
        System.out.printf ("%s %te/%<tm/%<tY \n", " Data do pedido:" , date);
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Cliente: " + getCliente().getNome() );
        System.out.println("Vendedor: " + getVendedor().getNome()+"\n");
        System.out.println("Veiculo: " + getVeiculo().getDescricao() + "\t\t\t\t\t\t\t\t Valor: " + getVeiculo().getValor());
        System.out.println("----------------------------------ITENS DO PEDIDO----------------------------------");
        System.out.println("Item" + "\tDescrição" + "\t\t\t\t\tQuantidade" + "\t\tValor Unitário" + "\t\tValor Item");
        System.out.println("...................................................................................");

        for(int i =0 ;i<items.size();i++) {
            System.out.print(String.format("%-5d|", items.get(i).getSequencial())); //printa o campo item
            System.out.print(String.format("%-27s|", "\t" + items.get(i).getProduto().getDescricao())); //printa a descrição
            System.out.print(String.format("%-13s|", "\t" + items.get(i).getQtd())); //printa a quantidade
            System.out.print(String.format("%-18s|", "\t" + items.get(i).getProduto().getValorProduto())); //printa o valor unitario
            System.out.println(String.format("%-11s","\t" + items.get(i).getValorItem())); //printa o valor da linha
        }

        System.out.println("-----------------------------------------------------------------------------------");
        float soma = 0;
        for(int i =0; i<items.size();i++) {
            soma +=items.get(i).getValorItem();
        }
        soma +=getVeiculo().getValor();
        System.out.println("Valor do Pedido: " + soma);
        System.out.println("Comissão do Vendedor: " + soma*getVendedor().getComissao()/100);
        return super.toString();
    }

    public void addItemDoPedido(ItemdoPedido itemdoPedido){
        items.add(itemdoPedido);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getValorPedido() {
        return valorPedido;

    }

    public void setValorPedido(float valorPedido) {
        this.valorPedido = valorPedido;
    }
}
