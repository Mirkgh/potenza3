package pkg20241028_4id_marcis_potenzapro;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class potenzaf {
        private int base = 0;
        private int esponente = 0;
        private  int risultato = 1;
        
        
        public int getbase() {
       return base;
}
        public int getesponente() {
       return esponente;
}
        public int getrisultato() {
       return risultato;
}
        
          public void funzioneFor(){
              
              potenzaf potenza = new potenzaf();
        
        Scanner inputbase = new Scanner(System.in);

        System.out.println("inserisci il valore della base");
        base = inputbase.nextInt();

        // richiesta del valore dell'espontente all'utente tramite scanner 
        Scanner inputesponente = new Scanner(System.in);

        System.out.println("inserisci il valore dell'esponente");
        esponente = inputbase.nextInt();
         
        //ciclo for che esegue i calcoli in base all'esponente ricevuto 
        for(int i=0; i<esponente; i++) {
            risultato = risultato * base;
            
        }
        System.out.println("il risultato e " + risultato);
    
    }
      
  

    
}
