package edu.ifce;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Produto p1 = new Produto(1, "Calota Aro 13pol", 25.00f);
        Produto p2 = new Produto(2, "Sensor Estacionamento", 130.000f);
        Produto p3 = new Produto(3, "GPS Garmin", 1500.00f);

        Cliente c1 = new Cliente(1, "Egel Locadora", TipoCliente.PESSOA_JURIDICA);
        Cliente c2 = new Cliente(2, "Francisco José", TipoCliente.PESSOA_FISICA);

        Vendedor vd1 = new Vendedor(1,"José Emanuel", 5.00f);

        Veiculo v1 = new Veiculo(1,"Fiat Siena 2011", 32000);
        Veiculo v2 = new Veiculo(2,"Wolks Gol 2011", 33000);

        ItemdoPedido ip1 = new ItemdoPedido(1,2,p1);
        ItemdoPedido ip2 = new ItemdoPedido(2,2,p2);
        ItemdoPedido ip3 = new ItemdoPedido(3,2,p3);

        PedidoVenda pv1 = new PedidoVenda(12,c1,vd1,v1);

        pv1.addItemDoPedido(ip1);
        pv1.addItemDoPedido(ip2);
        pv1.addItemDoPedido(ip3);

        pv1.toString();
    }
}
//  System.out.printf("%s %te/%<tm/%<tY", "Data do pedido:", date);