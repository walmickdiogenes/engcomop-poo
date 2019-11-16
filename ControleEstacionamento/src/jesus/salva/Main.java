package jesus.salva;

public class Main {
    public static void main(String[] args){
        Estabelecimento ES = new Estabelecimento(2018,4);

        Veiculo VL01 = new Veiculo(1,"HVF1012",10.00f);
        Veiculo VL02 = new Veiculo(2,"JVD2030",8.00f);
        Veiculo VL03 = new Veiculo(3,"HYT1265",5.00f);
        Veiculo VL04 = new Veiculo(4,"HYH7012",10.00f);
        Veiculo VL05 = new Veiculo(5,"JVD2030",8.00f);
        Veiculo VL06 = new Veiculo(6,"GDF7890",5.00f);
        Veiculo VL07 = new Veiculo(7,"ASD8734",10.00f);
        Veiculo VL08 = new Veiculo(8,"VBG2134",8.00f);
        Veiculo VL09 = new Veiculo(9,"BNH1232",5.00f);
        Veiculo VL10 = new Veiculo(10,"DES1098",10.00f);
        Veiculo VL11 = new Veiculo(11,"JHB9878",8.00f);
        Veiculo VL12 = new Veiculo(12,"DGF4532",5.00f);

        Movimento MV01 = new Movimento(1,10,5,VL01);
        Movimento MV02 = new Movimento(2,10,4,VL02);
        Movimento MV03 = new Movimento(3,10,2,VL03);
        Movimento MV04 = new Movimento(4,10,1,VL04);
        Movimento MV05 = new Movimento(5,10,6,VL05);
        Movimento MV06 = new Movimento(6,10,4,VL06);
        Movimento MV07 = new Movimento(7,10,2,VL07);
        Movimento MV08 = new Movimento(8,10,1,VL08);
        Movimento MV09 = new Movimento(9,10,6,VL09);
        Movimento MV10 = new Movimento(10,10,4,VL10);
        Movimento MV11 = new Movimento(11,10,2,VL11);
        Movimento MV12 = new Movimento(12,10,4,VL12);

        ES.inserirCarro(MV01);
        ES.inserirCarro(MV02);
        ES.inserirCarro(MV03);
        ES.inserirCarro(MV04);
        ES.inserirCarro(MV05);
        ES.inserirCarro(MV06);
        ES.inserirCarro(MV07);
        ES.inserirCarro(MV08);
        ES.inserirCarro(MV09);
        ES.inserirCarro(MV10);
        ES.inserirCarro(MV11);
        ES.inserirCarro(MV12);

        System.out.println(ES.calcularTotais());
    }
}
