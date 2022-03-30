package br.com.anhas;

public class Generico<C extends Carro> {

    C carro;

    Generico(Object carro){

        carro = carro;

    }

    Carro getModelo() {
        return carro;
    }

}