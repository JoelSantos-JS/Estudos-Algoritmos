package Vetores;

import java.util.Arrays;
import java.util.PrimitiveIterator.OfDouble;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor() {
    }

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // public void addVetor(String elemento) {

    // for (int i = 0; i < this.elementos.length; i++) {
    // if (this.elementos[i] == null) {
    // this.elementos[i] = elemento;
    // break;
    // }
    // }

    // }

    public void adiciona(String elemento) {

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Error("Vetor cheio");
        }

    }

    public boolean adiciona(int posicao, String elemento) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posicao invalida");
        }

        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;

        return false;

    }

    public void setTamnho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int modificaTamanho() {
        return this.tamanho;
    }

    // public String busca(int posicao) {
    // return this.elementos[posicao];
    // }

    public int busca(String posicao) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(posicao)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }

}
