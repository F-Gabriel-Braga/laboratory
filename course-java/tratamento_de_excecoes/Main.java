package tratamento_de_excecoes;

import tratamento_de_excecoes.excecao_personalizada_A.NumeroForaDoIntervaloException;
import tratamento_de_excecoes.excecao_personalizada_A.StringVaziaException;

public class Main {
    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("Gabriel", 8);
            Validar.aluno(aluno);
        }
        catch(StringVaziaException ex) {
            System.out.println("Preencha o atributo nome corretamente.");
        }
        catch(NumeroForaDoIntervaloException ex) {
            System.out.println("Preencha o atributo nota corretamente.");
        }
        catch(IllegalArgumentException ex) {
            System.out.println("Você não criou um aluno.");
        } catch (Exception e) {
            System.out.println("Exception!!!!");
        }
        /*catch(NumeroForaDoIntervaloException | IllegalArgumentException ex) {
            System.out.println("Você pode fazer dessa forma também.");
        }*/
        System.out.println("FIM.");
    }
}
