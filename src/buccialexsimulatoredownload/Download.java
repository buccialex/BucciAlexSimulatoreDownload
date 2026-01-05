/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buccialexsimulatoredownload;

import java.util.Timer;

/**
 *
 * @author Bux
 */
public class Download {
    private int dimensioneFile;
    private String nomeFile;
    private int avanzamentoPercentuale;
    private int velocitaMB;
    private int scaricati;

    public Download(int dimensioneFile, String nomeFile, int velocitaMB) {
        this.dimensioneFile = dimensioneFile;
        this.nomeFile = nomeFile;
        this.velocitaMB = velocitaMB;
        this.avanzamentoPercentuale = 0;
    }

    public int getDimensioneFile() {
        return dimensioneFile;
    }

    public void setDimensioneFile(int dimensioneFile) {
        this.dimensioneFile = dimensioneFile;
    }

    public String getNomeFile() {
        return nomeFile;
    }

    public void setNomeFile(String nomeFile) {
        this.nomeFile = nomeFile;
    }

    public int getAvanzamentoPercentuale() {
        return avanzamentoPercentuale;
    }

    public void setAvanzamentoPercentuale(int avanzamentoPercentuale) {
        this.avanzamentoPercentuale = avanzamentoPercentuale;
    }

    public int getVelocitaMB() {
        return velocitaMB;
    }

    public void setVelocitaMB(int velocitaMB) {
        this.velocitaMB = velocitaMB;
    }
    
    public boolean scarica(){
        if(scaricati < dimensioneFile){
            scaricati += velocitaMB;
            avanzamentoPercentuale = (scaricati * 100) / dimensioneFile;
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "Dimensione: " + dimensioneFile + "\n" + "Nome: " + nomeFile + "\n" + "Avanzamento: " + avanzamentoPercentuale + "\n" + "Scaricati: " + scaricati;
    }
    
    
    
    
}
