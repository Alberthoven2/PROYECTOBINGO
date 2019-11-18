/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobingo;

// Esto es para probar si pueden hacer pull

/**
 *
 * @author alb19
 */
public class ParaProbar {
    
    public int sumaDivisores(int n){
        int suma = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                suma += i;
            }
        }
        return suma;
    }
   
   public String retornaDivisores(int n){
       String div = "";
       for(int i = 1; i < n; i++){
           if(n % i == 0){
               div += i + ", ";
           }
       }
       return div;
   }
    
    public void numerosAmigos(){
        
        int [] arrayA = new int[500];
        int [] arrayB = new int[500];
        
        for(int i = 0; i < 500; i++){
            arrayA[i] = (i + 1);
            arrayB[i] = (i + 1);
        }
        
        for(int i = 0; i < 500; i++){
            int suma1 = sumaDivisores(arrayA[i]);
            for(int j = 0; j < 500; j++){
                String divA = retornaDivisores(arrayA[i]), divB = "";
                if(suma1 == arrayB[j] && arrayA[i] == sumaDivisores(arrayB[j]) && i != j){
                    divB = retornaDivisores(arrayB[j]);
                    System.out.println("Los números " + arrayA[i] + " y " + arrayB[j] + " son amigos");
                    System.out.println("Los divisores de " + arrayA[i] + " son " + divA + " y suman " + arrayB[j]);
                    System.out.println("Los divisores de " + arrayB[j] + " son " + divB + " y suman " + arrayA[i]);
              
                }
            }
        }
     }
    
    public int devuelveCifras(int n){
       int numCifras = 0, divisor = 1;
       while(n / 10 > 0){
           n /= 10;
           numCifras++;
       }
       for(int i = 0; i < numCifras; i++){
           divisor *= 10;
       }
       return divisor;
   }
    
    public String devuelveRomano(int n){
       String letras = "IVXLCDM", retorno = "";
       int [] numeros = {1,5,10,50,100,500,1000};
       int aux = n, divisor;
       do{
           int i,j;
           divisor = devuelveCifras(aux);
           for(i = 0; i < numeros.length && numeros[i] <= aux  ; i++);
           if(i == numeros.length){
               retorno += letras.charAt(i - 1);
               aux -= numeros[i - 1];
           }else{
               for(j = 0; j < i; j++){
                   if(numeros[i] - (numeros[i] - numeros[j + 1]) > divisor){
                       break;
                   }
               }
               if(i != j && aux >= numeros[i] - numeros[j] && numeros[i] - numeros[j] != numeros[i - 1]){
                   retorno = retorno.concat(String.valueOf(letras.charAt(j)).concat(String.valueOf(letras.charAt(i))));
                   aux -= numeros[i] - numeros[j];
               }else{
                   if (i > 0){
                        retorno = retorno.concat(String.valueOf(letras.charAt(i - 1)));
                        aux -= numeros[i - 1]; 
                   }
                   
                }
           }
        }while (aux > 0);
        return retorno;
   }
    
}
