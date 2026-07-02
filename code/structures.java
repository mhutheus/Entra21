package code;

import java.util.ArrayList;
import java.util.LinkedList;

public class structures {

    public static void main(String[] args) {

        //ExemploArray();
        ExemploLink();
    }

    static void L() {
        System.out.println("");
    }

    static void ExemploArray() {

        ArrayList<String> carros = new ArrayList<>();

        carros.add("Fuke");
        carros.add("sp2");
        carros.add("ertios");
        carros.add("ferrari");
        carros.add("F1");

        System.out.println("Tamanho: " + carros.size());
        L();

        System.out.println("Lista: " + carros);
        L();

        System.out.println("Index 2: " + carros.get(2));
        L();

        // primeiro elemento
        System.out.println("Primeiro: " + carros.get(0));
        L();

        // último elemento
        System.out.println("Último: " + carros.get(carros.size() - 1));
        L();

        // remove último elemento
        carros.remove(carros.size() - 1);

        System.out.println("Após remover último: " + carros);
        L();

        System.out.println("Novo último: " + carros.get(carros.size() - 1));
        L();

        // remove pelo nome
        carros.remove("ferrari");

        System.out.println("Após remover 'ferrari': " + carros);
        L();

        System.out.println("Último atual: " + carros.get(carros.size() - 1));
        L();

        // adiciona em posição específica
        carros.add(1, "Mclaren");

        System.out.println("Após add no índice 1: " + carros);
        L();

        // substitui elemento
        carros.set(2, "Kwid");

        System.out.println("Após set no índice 2: " + carros);
        L();
    }

    static void ExemploLink() {

        LinkedList<String> carros = new LinkedList<>();

        carros.add("Fusca");

        // adiciona no início
        carros.addFirst("TL");

        // adiciona na posição 0
        carros.add(0, "sp2");

        System.out.println("Lista LinkedList: " + carros);
        L();

        // primeiro elemento (sem getFirst)
        System.out.println("Primeiro: " + carros.get(0));
        L();

        // último elemento (sem getLast)
        System.out.println("Último: " + carros.get(carros.size() - 1));
        L();

        // remove primeiro (sem removeFirst)
        carros.remove(0);

        System.out.println("Após remover primeiro: " + carros);
        L();

        // remove último (sem removeLast)
        carros.remove(carros.size() - 1);

        System.out.println("Após remover último: " + carros);
        L();
    }
}