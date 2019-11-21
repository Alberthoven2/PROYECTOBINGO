/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobingo;

import java.util.ArrayList;

/**
 *
 * @author alb19
 */
public class Jugador {
    
    private String nombre;
    ArrayList<Carton> cartones = new ArrayList<>();
    
    protected void setNombre(String nom){
        this.nombre = nom;
    }
    
    protected String getNombre(){
        return this.nombre;
    }
    
    protected boolean setCarton(Carton c){
        return cartones.add(c);
    }
    
}
