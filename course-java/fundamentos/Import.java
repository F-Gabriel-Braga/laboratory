package fundamentos;

import javax.swing.JButton;
import java.util.Date;

public class Import {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        JButton botao = new JButton();
        botao.setText("Botão");
    }
}

/*
* package: Um pacote ou package na tecnologia Java, é um conjunto de classes localizadas na mesma estrutura hierárquica de diretórios.
* O comando package especifica o pacote do arquivo atual.
* import: Importar os recursos disponíveis na API do JDK e outros pacotes fora do pacote atual que sejam necessários no arquivo atual.*/