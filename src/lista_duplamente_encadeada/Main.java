package lista_duplamente_encadeada;

public class Main {
    public static void main (String[] args){
        ListaDuplamenteEncadeada<String> minhaListaEncadeada = new ListaDuplamenteEncadeada<>();
        minhaListaEncadeada.add("c1");
        minhaListaEncadeada.add("c2");
        minhaListaEncadeada.add("c3");
        minhaListaEncadeada.add("c4");
        minhaListaEncadeada.add("c5");

        System.out.println(minhaListaEncadeada + "\n");

        minhaListaEncadeada.remove(0);
        minhaListaEncadeada.add(0,"c99");

        System.out.println(minhaListaEncadeada);
    }
}
