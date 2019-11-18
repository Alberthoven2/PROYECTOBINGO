/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobingo;

/**
 *
 * @author alb19
 */
public class Bola {
    
    private int num;
    private boolean disponible;
    
    protected int getNum(){
        return this.num;
    }
    
    protected void setNum(int n){
        this.num = n;
    }
    
    protected void setDisponible(boolean b){
        this.disponible = b;
    }
    
    protected boolean getDisponible(){
        return this.disponible;
    }
    
    
    
}
