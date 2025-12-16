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
    private int dimensioneFile;
    private String nomeFile;
    private int avanzamentoPercentuale;
    private int velocitaMB;

    public Download(int dimensioneFile, String nomeFile, int velocitaMB) {
        this.dimensioneFile = dimensioneFile;
        this.nomeFile = nomeFile;
        this.velocitaMB = velocitaMB;
        this.avanzamentoPercentuale = 0;
    }
    
    
    
}
