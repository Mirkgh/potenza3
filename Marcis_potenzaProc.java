/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marcis_potenzaproc;

import java.util.Scanner;

/**
 *
 * Mirko Marcis 4infd 28/10/2024
 * funzione potenza con metodo
 * dichiarazione variabili 
inizializzo base a 0
inzializzo esponente a 0 

richiedere  all'utente la base tramite la funzione scanner
richiedere  all'utente l'esponente tramite la funzione  scanner 
e poi un ciclo for per eseguire l'operazione potenza  
* 
* creo le due funzioni stampa e e funzionefor e le richiamo nel main tramite un oggetto
*/



public class Marcis_potenzaProc {
        public int base = 0;
        public int esponente = 0;
        public int risultato = 1;
    public void stampa() {
       
    // richiesta del valore della base all'utente tramite scanner 
    Scanner inputbase = new Scanner(System.in);
    
    
    System.out.println("inserisci il valore della base"); 
    base = inputbase.nextInt();  
    
        // richiesta del valore dell'espontente all'utente tramite scanner 
    Scanner inputesponente = new Scanner(System.in);
  
    
    
    System.out.println("inserisci il valore dell'esponente"); 
    esponente = inputbase.nextInt(); 
}
        
    public void funzioneFor(){
         
        //ciclo for che esegue i calcoli in base all'esponente ricevuto 
        for(int i=0; i<esponente; i++) {
            risultato = risultato * base;
            
        }
        System.out.println("il risultato e " + risultato);
    
    }
       

        
         public static void main(String[] args) {
             //creazione dell'oggetto per richiamare la funzione 
             Marcis_potenzaProc potenzas = new Marcis_potenzaProc();
             
             //richiamo funzione stampa
             potenzas.stampa();
             //richiamo funzione potenza 
             potenzas.funzioneFor();
             
             
         }

    }
    



