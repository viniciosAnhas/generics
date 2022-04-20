package br.com.anhas;

import java.util.ArrayList;

public class Principal {

    public static void main(String args[]){

        Generico<Carro> carro1 = new Generico<Carro>(new Honda("Civic"));
        Generico<Carro> carro2 = new Generico<Carro>(new Ford("Mustang"));

        System.out.print(carro1.toString());
        System.out.print(carro2.toString());

    }

}