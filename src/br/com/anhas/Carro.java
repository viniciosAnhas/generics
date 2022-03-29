package br.com.anhas;

public abstract class Carro {

    String modelo;

    Carro(String modelo){

        this.modelo = modelo;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}