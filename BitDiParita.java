enum NumeroBinario {
    ZERO(0),
    UNO(1);

    private final int valore;

    NumeroBinario(int valore) {
        this.valore = valore;
    }

    public int getValore() {
        return this.valore;
    }
}

enum Tipo {
    PARI,
    DISPARI
}

public class BitDiParita { 
    private NumeroBinario[] vettoreByte;
    private Tipo tipo;

    BitDiParita(NumeroBinario[] vettoreByte, Tipo tipo) {
        this.vettoreByte = vettoreByte;
        this.tipo = tipo;
    }

    int contaN1() {
        int conta = 0;

        for (int i = 0; i < vettoreByte.length; i++) {
            if (vettoreByte[i].getValore() == 1) {
                conta++;
            }
        }

        return conta;
    }

    int calcolaBitDiParita() {
        if (this.tipo == Tipo.PARI) {
            if (contaN1() % 2 == 0) {
                return 0;
            }
            return 1;
        }
        else {
            if (contaN1() % 2 == 0) {
                return 1;
            }
            return 0;
        }
    }
}
