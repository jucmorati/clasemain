/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario10
 */
public class Main {
    
    public static void main  (String[] args){
    //Crear una instancia de pelicula
    Movie pelicula = new Movie("Guerra Galaxias");
    Rental prestamo= new Rental (5,pelicula);//mandamos un mns
    double costo=prestamo.charge();
    System.out.println("Costo "+ costo);
    System.out.println(prestamo.getMovie().getTitle());
    
    Movie pelPrestado=prestamo.getMovie();
    System.out.println(pelPrestado.getTitle());
    
}
}