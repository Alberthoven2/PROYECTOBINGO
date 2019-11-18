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
public class Carton {
    
    private int [][] carton = new int[3][5];
    private boolean bingo;
    private boolean linea;
    
    public Carton(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                this.carton[i][j] = -1;
            }
        }
    }
    
    protected boolean compruebaLinea(){
        return true;
    }
    
    protected boolean compruebaBingo(){
        return true;
    }
    
    protected boolean compruebaNumero(int num){
        return true;
    }
    
    protected boolean rellenaCarton(int n){
        return true;
    }
    
    protected boolean rellenaCarton(int [] n){
        return true;
    }
    
    protected boolean rellenaCarton(int [][] m){
        return true;
    }
    
}
