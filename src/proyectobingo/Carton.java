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
    
    private final int [][] carton = new int[3][5];
    private boolean bingo;
    private boolean linea;
    private final int FILAS = 3;
    private final int COLUMNAS = 5;
    
    public Carton(){
        for(int i = 0; i < FILAS; i++){
            for(int j = 0; j < COLUMNAS; j++){
                this.carton[i][j] = -1;
            }
        }
    }
    
    protected boolean compruebaLinea(){
        int contador;
        for(int i = 0; i < FILAS; i++){
            contador = 0;
            for(int j = 0; j < COLUMNAS; j++){
                if(this.carton[i][j] == - 1){
                    contador++;
                }
            }
            if(contador == 5){
                return true;
            }
        }
        return false;
    }
    
    protected boolean compruebaBingo(){
        int contador = 0;
        for(int i = 0; i < FILAS; i++){
            for(int j = 0; j < COLUMNAS; j++){
                if(this.carton[i][j] == - 1){
                    contador++;
                }
            }
        }
        if(contador == 15){
           return true;
        }else{
           return false;
        }
    }
    
    protected boolean compruebaNumero(int num){
        for(int i = 0; i < FILAS; i++){
            for(int j = 0; j < COLUMNAS; j++){
                if(this.carton[i][j] == num){
                    this.carton[i][j] = - 1;
                    return true;
                }
            }
        }
        return false;
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
