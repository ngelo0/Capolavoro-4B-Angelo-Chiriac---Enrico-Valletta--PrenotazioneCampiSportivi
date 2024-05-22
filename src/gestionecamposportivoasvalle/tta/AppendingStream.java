/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionecamposportivoasvalle.tta;
import java.io.*;
/**
 *
 * @author AngeloChiriacò
 */
public class AppendingStream extends ObjectOutputStream { // qui viene estesa la classe

    public AppendingStream(OutputStream out) throws IOException {
        super(out); // e viene richiamato il suo metodo di scrittura
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        reset(); // modificato però in modo tale da non scrivere l’intestazione prima
                 // dell’oggetto
    }
}