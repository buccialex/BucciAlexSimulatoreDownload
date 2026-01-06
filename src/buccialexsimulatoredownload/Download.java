/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buccialexsimulatoredownload;



/**
 *
 * @author Bux
 */
public class Download {
    /**
     * attributi
     */
    private final int dimensioneFile;
    private final String nomeFile;
    private int avanzamentoPercentuale;
    private final int velocitaMB;
    private int scaricati;

    /**
     * costruttore download
     * @param dimensioneFile dimensione del file
     * @param nomeFile nome del file
     * @param velocitaMB velocità del download
     */
    public Download(int dimensioneFile, String nomeFile, int velocitaMB) {
        this.dimensioneFile = dimensioneFile;
        this.nomeFile = nomeFile;
        this.velocitaMB = velocitaMB;
        this.avanzamentoPercentuale = 0;
    }

   /**
    * getter avanzamento percentuale
    * @return l'avanzamento percentuale
    */
    public int getAvanzamentoPercentuale() {
        return avanzamentoPercentuale;
    }

    /**
     * scarica
     * @return se il download è terminato
     */
    public boolean scarica(){
        if(scaricati < dimensioneFile){
            scaricati += velocitaMB;
            avanzamentoPercentuale = (scaricati * 100) / dimensioneFile;
            return false;
        }
        
        return true;
    }

    /**
     * override toString
     * @return stampa degli attributi dell'oggetto download
     */
    @Override
    public String toString() {
        return "Dimensione: " + dimensioneFile + "\n" + "Nome: " + nomeFile + "\n" + "Avanzamento: " + avanzamentoPercentuale + "\n" + "Scaricati: " + scaricati;
    }
    
    
    
    
}
