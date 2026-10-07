import java.util.*;

public class Practica2 {
    public static boolean equivalentes(List<String> l1, List<String> l2) {
        if (l1.size() != l2.size()) {
            return false;
        }


        Iterator<String> it1 = l1.iterator();

        while (it1.hasNext()) {
            String elem = it1.next();

            int count1 = 0;
            Iterator<String> tempIt1 = l1.iterator();

            while (tempIt1.hasNext()) {
                if (elem.equals(tempIt1.next())) {
                    count1++;
                }
            }

            int count2 = 0;
            Iterator<String> tempIt2 = l2.iterator();

            while (tempIt2.hasNext()) {
                if (elem.equals(tempIt2.next())) {
                    count2++;
                }
            }

            if (count1 != count2) {
                return false;
            }
        }
        return true;
    }


    public static void invierte(ListIterator<String> iter) {

        while (iter.hasPrevious()) {
            iter.previous();
        }

        List<String> elementos = new LinkedList<>();
        while (iter.hasNext()) {
            elementos.add(iter.next());
        }

        for (int i = 0; i < elementos.size(); i++) {
            iter.previous();
            iter.set(elementos.get(i));
        }
    }

    public static List<Integer> ordenar(List<Integer> l) {
        List<Integer> resultado = new ArrayList<>(l);

        for(int i = 1; i < resultado.size(); i++){
            Integer indice = resultado.get(i);
            int j = i-1;
            while (j >= 0 && resultado.get(j) > indice) {
                resultado.set(j+1, resultado.get(j));
                j--;
            }
            resultado.set(j+1, indice);
        }
        return resultado;
    }

    public static <T> List<T> detectarAlternancia(ListIterator<T> iter) {
        List<T> resultado = new ArrayList<>();

        while (iter.hasPrevious()) {
            iter.previous();
        }

        if (!iter.hasNext()) return resultado;
        T a = iter.next();

        if (!iter.hasNext()) return resultado;
        T b = iter.next();

        while (iter.hasNext()) {
            T c = iter.next();


            boolean extremosIguales = (a == null && c == null) || (a != null && a.equals(c));
            boolean medioDiferente = (a == null && b != null) || (a != null && !a.equals(b));

            if (extremosIguales && medioDiferente) {
                resultado.add(a);
            }

            a = b;
            b = c;
        }

        return resultado;
    }
}

