package listas_circulares;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();
        minhaListaCircular.add("c0");
        System.out.println(minhaListaCircular + "\n");
        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular + "\n");
        minhaListaCircular.add("c1");
        minhaListaCircular.add("c2");
        minhaListaCircular.add("c3");
        minhaListaCircular.add("c4");
        System.out.println(minhaListaCircular);
        for(int i = 0; i < 13; i++){
            System.out.println(minhaListaCircular.get(i));
        }
    }
}
