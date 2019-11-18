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
public class Bingo {
    
    private boolean hayBingo;
    private boolean hayLinea;
    private boolean seEstaJugando;
    
    protected void comienzaBingo(){
        this.seEstaJugando = true;
    }
    
    protected void terminaBingo(){
        this.seEstaJugando = false;
    }
    
}
