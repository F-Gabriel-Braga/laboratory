package arrays_e_collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        // add() e offer() --> Adiciona elementos na fila
        // A diferença entre eles ocorre quando a fila está cheia!
        // add() --> Retorna false
        // offer() --> Retorna uma exception
        fila.add("Ana");
        fila.offer("Bia");
        fila.offer("Estefane");
        fila.offer("Rafaela");
        fila.offer("Joana");
        fila.offer("Jay");

        // peek() e element() --> Obtem um elemento da fila sem remove-lo
        // A diferença entre eles ocorre quando a fila está vazia!
        // peek() --> Retorna Null
        // element() --> Retorna uma exception
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());

        // poll() remove() --> Obtem um elemento da fila e o remove
        // A diferença entre eles ocorre quando a fila está vazia!
        // pool() --> Retorna Null
        // remove() --> Retorna uma exception
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.remove());
        System.out.println(fila.poll());

        // fila.size(); // Tamanho da fila
        // fila.clear(); // Limpa a fila
        // fila.contains(); // Verifica se contem um elemento na lista
        // fila.isEmpty(); // Verifica se a fila está vazia
    }
}
