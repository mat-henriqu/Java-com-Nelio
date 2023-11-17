package comportamentoMemorioArraysLista.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("maria");
        list.add("alex");
        list.add("bob");
        list.add("anna");
        list.add(2,"marco");

        System.out.println(list.size());


        for (String x : list) {
            System.out.println(x);
        }
        list.remove("anna");
        list.remove(1);
        list.removeIf(x -> x.charAt(0)=='m');
        System.out.println("=============================");
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("=============================");
        System.out.println("index of bob: "+ list.indexOf("bob"));
        System.out.println("=============================");
        list.add("aninha");
        list.add("adolfo");
        List<String> result = list.stream().filter(x ->x.charAt(0)=='a').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("=============================");
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("=============================");
        String name = list.stream().filter(x->x.charAt(0)=='a').findFirst().orElse(null);
        System.out.println(name);
    }
}
