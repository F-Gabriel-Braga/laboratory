package lambdas.lambda;

@FunctionalInterface // Você só pode ter uma funcao na interface
public interface Calculo {
    public abstract double executar(double a, double b);

    default String legal() {
        return "LEGAL.";
    }

    static String muitoLegal() {
        return "MUITO LEGAL.";
    }
}
