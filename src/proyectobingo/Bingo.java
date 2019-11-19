/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobingo;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author alb19
 */
public class Bingo {
    
    private boolean hayBingo;
    private boolean hayLinea;
    private boolean seEstaJugando;
    protected ArrayList <Bola> bolas = new ArrayList<>();
    protected final Random rd;
    
    public Bingo(){
        this.rd = new Random();
        Bola b = new Bola();
        for(int i = 0; i < 100; i++){
            b.setNum(i + 1);
            b.setDisponible(true);
            bolas.add(b);
        }
    }
    
    protected void comienzaBingo(){
        this.seEstaJugando = true;
    }
    
    protected void terminaBingo(){
        this.seEstaJugando = false;
    }
    
    protected void setBingo(boolean b){
        this.hayBingo = b;
    }
    
    protected boolean getBingo(){
        return this.hayBingo;
    }
    
    protected void setLinea(boolean b){
        this.hayLinea = b;
    }
    
    protected boolean getLinea(){
        return this.hayLinea;
    }
    
    protected int sacaBola(){
        int bola;
        boolean encontrada;
        do{
            encontrada = false;
            bola = this.rd.nextInt(101);
            for(int i = 0; i < bolas.size(); i++){
                if(bolas.get(i).getNum() == bola){
                    encontrada = true;
                    bolas.get(i).setDisponible(false);
                    bolas.remove(i);
                    break;
                }
            }
        }while(!encontrada);
        return bola;
    }
    
    
    
}
