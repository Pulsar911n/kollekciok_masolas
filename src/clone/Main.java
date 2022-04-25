package clone;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<String> lista = new ArrayList<>();
        lista.add("Alma");
        lista.add("Körte");
        lista.add("Faszparasztbetyárgeci");
        lista.add("Nem elég hosszú a faszparasztbetyárgeci");
        lista.add("Ed");

        megoldas(lista);

        HashSet<String> elso = new HashSet<>();
        HashSet<String> masodik = new HashSet<>();
        elso.add("Alma");
        elso.add("Korte");
        elso.add("Beka");
        elso.add("Geci");
        elso.add("Szőr");

        masodik.add("Alma");
        masodik.add("Fasz");
        masodik.add("Pina");
        masodik.add("Beka");
        masodik.add("Geci");

        System.out.println(firstOnly(elso,masodik));
    }
    public static void megoldas(Collection<String> cs){
        for (String i: cs){
            System.out.println(i);
        }
        Iterator<String> it = cs.iterator();
        while (it.hasNext()){
            String i = it.next();
            if (i.length()>36){
                it.remove();
            }
        }
        for (String i: cs){
            System.out.println(i);
        }
    }
    public static int firstOnly(HashSet<String> s1, HashSet<String> s2){
        int szamok = 0;
        for (String i: s2){
            if (!s1.contains(i)){
                szamok++;
            }
        }
        return szamok;
    }
}
