package org.example;

import org.example.Ayudas.Licor;
import org.example.Modelos.Cliente;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Licor objetoUno = new Licor();
        Licor objetoDos = new Licor("Aguardiente antioqueño tapa verde ", "aguardiente", 29.0, LocalDate.of(2028,10,31),20000);

        Cliente clienteUno = new Cliente();
        Cliente clienteDos = new Cliente("Juan", 32, "10172349865", "licorerafil@gmail.com", "carrera 02-43 N° 23-08" );

        //Accediendo a los atributos
        System.out.println(objetoUno.getTipoProducto());
        System.out.println(objetoDos.getTipoProducto());

    }

}