package pilha;

public class No {
    private int dados;
    private No refNo;

    public No() {
    }
    public No(int dados) {
        this.dados = dados;
    }
    public int getDados() {
        return dados;
    }
    public void setDados(int dados) {
        this.dados = dados;
    }
    public No getRefNo() {
        return refNo;
    }
    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }
    @Override
    public String toString() {
        return "No [dados=" + dados + ", refNo=" + refNo + "]";
    }
}
