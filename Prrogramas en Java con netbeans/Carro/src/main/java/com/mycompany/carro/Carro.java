package com.mycompany.carro;

public class Carro
{
    
    public String Marca;
    public String Modelo;
    
    public void Arrancar()
    {
        System.out.println("Arranco el auto " + Marca + " con modelo " + Modelo);
    }
    
    public void Apagar()
    {
        System.out.println("Se apago el auto " + Marca + " con modelo " + Modelo);
    }
}

