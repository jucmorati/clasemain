/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario10
 */
public class Rental {
    int dayRented;
    //Relacion Asociacion
    private Movie movie;
    public Rental (int dayRented, Movie movie){
        this.dayRented=dayRented;
        this.movie=movie;
    }
    
    public  Movie getMovie(){
        return this.movie;
    }
    public double charge (){
        return this.dayRented*50;
    }
}
