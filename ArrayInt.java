
import java.util.Scanner;

public class ArrayInt {
  static Scanner sc = new Scanner(System.in);

  static void main() {
    mostrarMenu("ARRAY DE INT");

    int[] numeros = new int[5];

    rellenarArray(numeros);
    imprimirArray(numeros);
    System.out.println(sumarArray(numeros));
    imprimirMayorYMenor(calcularMayorYMenor(numeros));
  }

  public static void rellenarArray(int[] array) {
    System.out.println("\n*** RELLENE ARRAY ***");
    for (int i = 0; i < 5; i++) {
      System.out.print("Número " + (i + 1) + ": ");
      if (!sc.hasNextInt()) {
        System.out.print("No ha introducido un número. Por favor, introduzca número " + (i + 1) + ": ");
        sc.next();
      }
      array[i] = sc.nextInt();
    }
  }

  public static void imprimirArray(int[] array) {
    System.out.println("\n*** IMPRIMIENDO ARRAY ***");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " | ");
    }
  }

  public static int sumarArray(int[] array) {
    System.out.print("\n\n*** SUMANDO ARRAY ***\n");
    int sumaArray = 0;
    for (int i = 0; i < array.length; i++) {
      sumaArray += array[i];
    }
    return sumaArray;
  }

  public static int[] calcularMayorYMenor (int[] array) {
    System.out.println("\nCalculando mayor y menor...");
    int mayor = array[0];
    int menor = array[0];
    for (int i = 0; i < array.length; i++) {
      if (array[i] > mayor) {
        mayor = array[i];
      } if (array[i] < menor){
        menor = array[i];
      }
    }
    return new int [] {mayor, menor};
  }

  public static void imprimirMayorYMenor (int [] arrayMayorYMenor){
    System.out.println("\n *** IMPRIMIENDO MAYOR Y MENOR ***");
      System.out.println("Mayor: " + arrayMayorYMenor[0]);
      System.out.println("Menor: " + arrayMayorYMenor[1]);
    }

  public static void mostrarMenu (String titulo){
    System.out.println();
    System.out.println("--- " + titulo + " ---");
  }
  }
