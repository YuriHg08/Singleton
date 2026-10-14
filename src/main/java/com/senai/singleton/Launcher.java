package com.senai.singleton;

import com.senai.singleton.entidades.Carro;
import javafx.application.Application;

import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
        Carro c1 = new Carro("Vermelho", "Civic EX Manual Vtec", "Honda", 1999);
        Carro c2 = new Carro("Preto", "VW Beattcle TSI EA888", "Volkswagen", 2014);
        Carro c3 = new Carro("Laranja", "7878", "Mazda", 1979);
        //Application.launch(HelloApplication.class, args);
        ArrayList<Carro> carros = new ArrayList<Carro>();
        carros.add(c1);
        carros.add(c2);
        carros.add(c3);

        for (Carro c : carros) {
            System.out.println(c.getModelo());
        }
    }
}
