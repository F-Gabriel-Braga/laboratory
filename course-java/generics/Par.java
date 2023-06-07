package generics;

public class Par<C, V> {

    private C chave;
    private V valor;

    public C getChave() {
        return chave;
    }

    public Par() {
    }

    public Par(C chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public void setChave(C chave) {
        this.chave = chave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        return chave == ((Par) object).getChave();
    }
}
