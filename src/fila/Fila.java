package fila;

public class Fila<T> {

    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public No<T> first(){
        if (this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
            return (No<T>) primeiroNo;
        }
        return null;
    }
    public void enqueue(T object){
        No<T> novoNo = new No<>(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public No<T> dequeue(){
        if (this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (No<T>)primeiroNo;
        }
        return null;
    }
    public boolean isEmpty(){
        if (this.refNoEntradaFila == null){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;
        if (refNoEntradaFila != null){
            while (true){
                stringRetorno += "[No{Objeto=" +
                        noAuxiliar.getObject() + "}]-->";
                if (noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += null;
                    break;
                }

            }
        }else{
            stringRetorno = null;
        }
        return stringRetorno;
    }
}
