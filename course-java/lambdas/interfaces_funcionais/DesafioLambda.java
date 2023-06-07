package lambdas.interfaces_funcionais;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioLambda {
    public static void main(String[] args) {

        /*
        * 1. A partir de produto calcular o preço real (com desconto)
        * 2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (Insento)
        * 3. Frete: >= 3000 (100) / < 3000 (50)
        * 4. Arredondar: Deixar duas casas decimais
        * 5. Formatar: R$1234,56
        */

        Function<Produto, Double> calculaPrecoReal = produto -> {
            return (produto.preco * (1 - produto.desconto));
        };

        UnaryOperator<Double> calculaImpotMinucip = preco -> {
            return (preco >= 2500 ? (preco * (1 + 0.085)) : preco);
        };

        UnaryOperator<Double> calculaValorFrete = preco -> {
            return (preco >= 3000 ? (preco + 100.0) : (preco + 50.0));
        };

        /*Function<Double, String> arredondarFomatar = valor -> {
            return ("R$" + new DecimalFormat("#,##0.00").format(valor));
        };*/

        UnaryOperator<Double> arredondar = valor -> {
            return Double.parseDouble(String.format("%.2f", valor).replace(",", "."));
        };

        Function<Double, String> formatar = valor -> {
            return ("R$" + valor).replace(".", ",");
        };

        Produto p2 = new Produto("Notebook", 3235.89, 0.13);

        System.out.println(
                calculaPrecoReal.
                andThen(calculaImpotMinucip).
                andThen(calculaValorFrete).
                andThen(arredondar).
                andThen(formatar).
                apply(p2)
        );
    }
}
