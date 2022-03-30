package br.com.anhas;

public class Principal {

    public static void main(String args[]){

        Generico<Carro> carro1 = new Generico<Carro>(new Honda("Civic"));

        System.out.print(carro1.getModelo());

    }

}