
/*
 * Con el ArrayList ya instanciado e inicializado con esos 5 números
 * Haz un método que calcule el número mayor y el número menor devolviendo una lista de 2 números
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayInteger {
  static Scanner sc = new Scanner(System.in);
  static final int NUMERO_DE_INTEGER_EN_ARRAY = 7;

  static void main(String[] args) {
    mostrarMenu("MAYOR Y MENOR EN UN ARRAY LIST");


    ArrayList<Integer> listaInteger = new ArrayList<>();

    rellenarArray(listaInteger);
    imprimirMayorYMenor(calcularMayorYMenor(listaInteger));
  }

  public static void rellenarArray(ArrayList<Integer> arrayList) {
    System.out.println("\n*** RELLENANDO ARRAY DE " + NUMERO_DE_INTEGER_EN_ARRAY + " INTEGER ***");
    for (int i = 0; i < NUMERO_DE_INTEGER_EN_ARRAY; i++) {
      System.out.print("Integer " + (i + 1) + ": ");
      while (!sc.hasNextInt()) {
        System.out.print("No válido. Introduzca número " + (i + 1) + ": ");
      }
      Integer a = sc.nextInt();
      arrayList.add(a);
    }
  }

  public static ArrayList<Integer> calcularMayorYMenor(ArrayList<Integer> arrayList) {
    System.out.println("\nCalculando mayor y menor...");
    ArrayList<Integer> listaMayorYMenor = new ArrayList<>();
    Integer min = arrayList.getFirst();
    Integer max = arrayList.getFirst();
    for (Integer i : arrayList) {
      if (i < min) {
        min = i;
      } else if (i > max) {
        max = i;
      }
    }
    listaMayorYMenor.add(max);
    listaMayorYMenor.add(min);
    return listaMayorYMenor;
  }

  public static void imprimirMayorYMenor (ArrayList<Integer> arrayMayorYMenor){
    System.out.println();
    Integer max = arrayMayorYMenor.get(0);
    Integer min = arrayMayorYMenor.get(1);

    System.out.println("Integer mayor: " + max);
    System.out.println("Integer menor: " + min);
  }

  public static void mostrarMenu (String titulo){
    System.out.println();
    System.out.println("--- " + titulo + " ---");
  }
}


