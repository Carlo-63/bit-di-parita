import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumeroBinario vettoreByte[] = new NumeroBinario[8];
        int n;

        for (int i = 0; i < vettoreByte.length; i++) {
            System.out.print("Valore all'indice " + i + ": ");
            n = scanner.nextInt();

            if (n == 0) {
                vettoreByte[i] = NumeroBinario.ZERO;
            }
            else if (n == 1) {
                vettoreByte[i] = NumeroBinario.UNO;
            }
            else {
                System.out.println("Valore non valido!");
                i--;
            }   
        }

        System.out.print("Tipo (PARI / DISPARI): ");
        String tipoStringa = scanner.next();
        System.out.println(tipoStringa);
        Tipo tipo;

        if (tipoStringa.equals("PARI")) {
            tipo = Tipo.PARI;
        }
        else if (tipoStringa.equals("DISPARI")) {
            tipo = Tipo.DISPARI;
        }
        else {
            System.out.println("Tipo non valido!");
            return;
        }

        BitDiParita bitDiParita = new BitDiParita(vettoreByte, tipo);

        System.out.println("\nN(1): " + bitDiParita.contaN1());
        System.out.println("Bit di parità: " + bitDiParita.calcolaBitDiParita());
    }
}