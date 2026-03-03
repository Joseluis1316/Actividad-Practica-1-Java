import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arreglo1 = new int[7];
        int[] arreglo2 = new int[7];
        int[] arreglo3 = new int[7];

        int sumaTotal = 0;

        System.out.println("Ingrese 7 números para el primer arreglo:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo1[i] = scanner.nextInt();
        }

        System.out.println("\nIngrese 7 números para el segundo arreglo:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo2[i] = scanner.nextInt();
        }

        for (int i = 0; i < 7; i++) {
            arreglo3[i] = arreglo1[i] - arreglo2[i];
            sumaTotal += arreglo1[i] + arreglo2[i];
        }

        double promedio = sumaTotal / 14.0;

        System.out.println("\nEl promedio de todos los datos es: " + promedio);

        System.out.println("\nDiferencia de los arreglos:");
        for (int i = 0; i < 7; i++) {
            System.out.println("Posición " + i + ": " + arreglo3[i]);
        }

        scanner.close();
    }
}