package br.com.anhas;

public abstract class Carro {

    String modelo;
    int quantidadePorta;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidadePorta() {
        return quantidadePorta;
    }

    public void setQuantidadePorta(int quantidadePorta) {
        this.quantidadePorta = quantidadePorta;
    }
}