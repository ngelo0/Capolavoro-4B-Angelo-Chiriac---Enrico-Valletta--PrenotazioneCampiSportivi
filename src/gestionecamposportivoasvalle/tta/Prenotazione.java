/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionecamposportivoasvalle.tta;
import java.io.*;
/**
 *
 * @author micro
 */
public class Prenotazione implements Serializable{
    public String Data;
    public String Tipo;
    public String Sport;
    public String Campo;
    public String Ora;
    public String Nominativo;
    public Prenotazione(String Sport, String Campo, String Tipo,String Data, String Ora,String Nominativo){
        this.Sport=Sport;
        this.Campo=Campo;
        this.Tipo=Tipo;
        this.Data=Data;
        this.Ora=Ora;
        this.Nominativo=Nominativo;
    }
}
