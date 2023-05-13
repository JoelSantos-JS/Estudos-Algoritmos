package Vetores;

import java.util.Arrays;

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

    public void setTamnho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int modificaTamanho() {
        return this.tamanho;
    }

    public String busca(int posicao) {
        return this.elementos[posicao];
    }

    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }

}
