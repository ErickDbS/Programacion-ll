package com.mycompany.map;

public class MapJava {
    
   private String dni;
  private String nombre;
  private int edad;
  public String getDni() {
    return dni;
  }
  public void setDni(String dni) {
    this.dni = dni;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public int getEdad() {
    return edad;
  }
  public void setEdad(int edad) {
    this.edad = edad;
  }
  public Persona(String dni, String nombre, int edad) {
    super();
    this.dni = dni;
    this.nombre = nombre;
    this.edad = edad;
    return;
  }     
}
