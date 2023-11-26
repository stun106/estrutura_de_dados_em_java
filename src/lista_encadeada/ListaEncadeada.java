package lista_encadeada;

public class ListaEncadeada<T> {
    private No<T> refEncadeada;

    public ListaEncadeada() {
        this.refEncadeada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()){
            refEncadeada = novoNo;
            return;
        }
        No<T> noAuxiliar = refEncadeada;
        for (int i = 0; i < this.size()-1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        validaIndice(index);
        No<T> noAuxiliar = refEncadeada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }
    public T remove(int index){
        No<T> noPivor = this.getNo(index);
        if (index == 0){
           refEncadeada = noPivor.getProximoNo();
           return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo(index -1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> refaux = refEncadeada;
        while (true){
            if (refEncadeada != null){
                tamanhoLista++;
                if (refaux.getProximoNo() != null){
                    refaux = refaux.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }

        return tamanhoLista;
    }

    public boolean isEmpty(){
        if (refEncadeada == null){
            return true;
        }else{
            return false;
        }
    }

    private void validaIndice(int index){
        if (index >= size()){
            int ultimoIndice = size() -1;
            throw new IndexOutOfBoundsException("não existe conteudo no indice " + index + " desta lista. Esta çosta sp vai ate o indice " + ultimoIndice + ".");
        }
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = refEncadeada;
        for(int i = 0; i < this.size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += null;
        return strRetorno;
    }
}
