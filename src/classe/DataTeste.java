package classe;
public class DataTeste {
    public static void main(String[] args) {

        Data data1 = new Data();

        Data data2 = new Data(6,12,2002);

        String dataFormatada1 = data1.obterDataFormatada();
        String dataFormatada2 = data2.obterDataFormatada();

        System.out.println(dataFormatada1);
        System.out.println(dataFormatada2);
    }
}