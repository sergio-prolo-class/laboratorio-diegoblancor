public class CaixasProduzidas {
    public static void main(String[] args) {
        double altura = 0.5;
        double largura = 0.3;
        double profundidade = 0.3;
        double area = 0.78;
        double volume = 0.045;
        int quantidade_produzida = 10;
        double custo_m2 = 3.50;
        double custo_total = 27.30;
          area = 2 * ((altura * largura) + (altura * profundidade) + (largura * profundidade));
          volume = altura * largura * profundidade;
          custo_total = area * custo_m2;
            System.out.println("Área da caixa: " + area + " m²");
            System.out.println("Volume da caixa: " + volume + " m³");
            System.out.println("Custo de produção da caixa: R$ " + custo_total);
                        
    }       
}
