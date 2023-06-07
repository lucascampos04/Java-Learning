package aulas;

import java.awt.*;
import java.util.ArrayList;
public class Array {
    public static void main(String[] args){
        // Primeiro metodo de criar e manipular uma Array
        ArrayList<Integer> minhaLista = new ArrayList<>();
        minhaLista.add(10);
        minhaLista.add(20);
        System.out.println(minhaLista);

        // Segundo metodo
        int[] minhaArray = {10, 20, 30, 40, 50, 60, 70, 80};
        System.out.println(minhaArray[0]);
        minhaArray[0] = 100 + 50;
        System.out.println(minhaArray[0]);

        for (int i = 0; i < minhaArray.length; i++){
            System.out.println(minhaArray[i]);
        }

        boolean contemNumerosInteiros = true;

        for (int valor : minhaArray){
            if (valor % 1 != 0){
                contemNumerosInteiros = true;
                break;
            }
        }

        if (contemNumerosInteiros){
            System.out.println("Essa array contem numeros inteiros");
        } else {
            System.out.println("Essa array não contem numeros inteiros");
        }

        // Definindo o maior numero do array
        System.out.println("Maior e menor");
        int[] numeros = {1,2,3,4,5,6,7,8,9};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for (int w=0; w < numeros.length; w++){
                if (numeros[w] > maior){
                    maior = numeros[w];
                }

                if (numeros[w] < menor){
                    menor = numeros[w];
                }
                media += numeros[w];
            }

            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            System.out.println("Media: " + media/numeros.length);
        }


        }


