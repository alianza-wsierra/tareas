package com.example;

/**
 * Esta clase ya no es necesaria como punto de entrada principal si usas Spring Boot,
 * ya que la aplicación ahora se ejecuta desde MyJavaProjectApplication.
 * 
 * Si deseas mantener esta clase para pruebas por consola, puedes dejarla,
 * pero la gestión de tareas ahora se realiza a través de la interfaz web.
 */

public class App {
    public static void main(String[] args) {
        System.out.println("La aplicación ahora se ejecuta como una aplicación web.");
        System.out.println("Por favor, ejecuta MyJavaProjectApplication y accede a http://localhost:8080 en tu navegador.");
    }
}