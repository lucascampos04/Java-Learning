package Logica.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class array {
    public static void main(String[] args) {
        // Ordenando strings
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Lucas");
        nomes.add("oliveira");
        nomes.add("Campos");
        nomes.add("jose carmago");
        nomes.add("Leandro tavares");

        Collections.sort(nomes, Collections.reverseOrder());

        System.out.println("Ordenando strings:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println();

        // Ordenando itens numéricos
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(212);
        numeros.add(-212);
        numeros.add(23332323);
        numeros.add(2);
        numeros.add(1);
        numeros.add(100);
        numeros.add(-1);

        Collections.sort(numeros, Collections.reverseOrder());

        System.out.println("Ordenando itens numéricos:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        System.out.println();

        // Array de objetos Pessoa
        Pessoa lucas = new Pessoa("Lucas", 18);
        Pessoa mae = new Pessoa("Ednalva", 41);
        Pessoa pai = new Pessoa("Wellington", 42);

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(lucas);
        pessoas.add(mae);
        pessoas.add(pai);

        System.out.println("Nomes das pessoas:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println();

        // Primeiro método
        String[] arrayEstatico = new String[3];
        arrayEstatico[0] = "Lucas";
        arrayEstatico[1] = "Oliveira";
        arrayEstatico[2] = "Campos";

        System.out.println("Imprimindo array estático:");
        for (int indice = 0; indice < arrayEstatico.length; indice++) {
            System.out.println(arrayEstatico[indice]);
        }

        System.out.println();

        // Segundo método
        ArrayList<String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("Lucas");
        arrayDinamico.add("Oliveira");
        arrayDinamico.add("Campos");

        System.out.println("Tamanho do ArrayList: " + arrayDinamico.size());

        System.out.println("Imprimindo array dinâmico:");
        for (int i = 0; i < arrayDinamico.size(); i++) {
            System.out.println(arrayDinamico.get(i));
        }

        System.out.println("Removendo um nome.");
        arrayDinamico.remove(2);

        System.out.println("Imprimindo array dinâmico após remoção:");
        for (String nome : arrayDinamico) {
            System.out.println(nome);
        }
    }
}
