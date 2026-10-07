import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   PRUEBAS DE LA CLASE PRACTICA 2");
        System.out.println("==========================================");

        pruebaEquivalentes();
        pruebaInvierte();
        pruebaOrdenar();
        pruebaDetectarAlternancia();
    }

    private static void pruebaEquivalentes() {
        System.out.println("\n--- 1. Prueba: equivalentes ---");

        List<String> l1 = Arrays.asList("a", "b", "a", "c");
        List<String> l2 = Arrays.asList("c", "a", "b", "a");
        List<String> l3 = Arrays.asList("a", "b", "c", "d");
        List<String> l4 = Arrays.asList("a", "b", "a", "a");

        System.out.println("Lista 1: " + l1);
        System.out.println("Lista 2: " + l2);
        System.out.println("¿l1 y l2 son equivalentes? " + Practica2.equivalentes(l1, l2) + " (Esperado: true)");

        System.out.println("Lista 3: " + l3);
        System.out.println("¿l1 y l3 son equivalentes? " + Practica2.equivalentes(l1, l3) + " (Esperado: false)");

        System.out.println("Lista 4: " + l4);
        System.out.println("¿l1 y l4 son equivalentes? " + Practica2.equivalentes(l1, l4) + " (Esperado: false)");
    }

    private static void pruebaInvierte() {
        System.out.println("\n--- 2. Prueba: invierte ---");

        List<String> lista = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println("Lista original: " + lista);

        // Se obtiene un iterador (puede estar en cualquier posición inicial)
        ListIterator<String> iter = lista.listIterator(2);

        Practica2.invierte(iter);
        System.out.println("Lista invertida: " + lista + " (Esperado: [E, D, C, B, A])");
    }

    private static void pruebaOrdenar() {
        System.out.println("\n--- 3. Prueba: ordenar ---");

        List<Integer> desordenada = Arrays.asList(5, 2, 8, 1, 9, 3, 2);
        System.out.println("Lista original:  " + desordenada);

        List<Integer> ordenada = Practica2.ordenar(desordenada);
        System.out.println("Lista ordenada:  " + ordenada + " (Esperado: [1, 2, 2, 3, 5, 8, 9])");
    }

    private static void pruebaDetectarAlternancia() {
        System.out.println("\n--- 4. Prueba: detectarAlternancia ---");

        // Patrón A B A genera alternancia en 'A'
        List<String> lista = Arrays.asList("X", "Y", "X", "Z", "W", "Z", "Z");
        System.out.println("Lista a evaluar: " + lista);

        ListIterator<String> iter = lista.listIterator();
        List<String> alternancias = Practica2.detectarAlternancia(iter);

        System.out.println("Elementos con alternancia (A B A): " + alternancias + " (Esperado: [X, Z])");
    }
}