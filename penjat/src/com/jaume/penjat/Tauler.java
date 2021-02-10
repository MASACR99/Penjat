package com.jaume.penjat;

import java.util.Arrays;

public class Tauler {
    private char[] paraulaSecreta; //Same len, init = string user
    private String[] paraulaEndevinada; //Same len, init = nulls
    private int intents; //init = user
    private int intents_total; //init = user
    
    public Tauler(){
        //Constructor buid
    }
    
    

    public char[] getParaulaSecreta() {
        return paraulaSecreta;
    }

    public String[] getPalabraEndevinada() {
        return paraulaEndevinada;
    }

    public int getIntents() {
        return intents;
    }
    
    public void inicialitzarPartida(String paraula, int intent){
        
        this.intents=intent;
        this.intents_total=intent;
        this.paraulaEndevinada=new String [paraula.length()];
        for (int i=0;i<paraula.length();i++){
            this.paraulaEndevinada[i]=null;
        }
        this.paraulaSecreta=paraula.toCharArray();
        //Inicialitzar paraulaEndevinada a tot null i longitud = paraule.length
        //intents = intent
        //intents_total = intent
        //paraulaSecreta = paraula.toCharArray();
    }
    
    public String imprimir(){
        String paraula="";
        for(int i=0;i<this.paraulaEndevinada.length;i++){
            if (this.paraulaEndevinada[i]==null){
                paraula+="_";
            }
            else{
                paraula+=this.paraulaEndevinada[i];
            }
        }
        return paraula;
    }
    
    public String imprimirVides(){
        String vides;
        if (this.intents==1){
            vides="Et queda "+this.intents+" vida de "+this.intents_total;
        }
        else {
            vides="Et queden "+this.intents+" vides de "+this.intents_total;
        }
        //"Et queden 4 vides de 4"
        //Retornar "Et queden intents d'un total de intents_total"
        return vides;
    }
    
    public boolean hasGuanyat(){
        boolean guanyat=false;
        
        if (Arrays.toString(this.paraulaEndevinada).equals(Arrays.toString(this.paraulaSecreta))){
            guanyat=true;
        }
        
        return guanyat; 
    }
    
    public String verificar(String lletra){
        int contador=0;
        boolean encontrado=false;
        String frase="";
        char[] lletraChar=lletra.toCharArray();
        if (lletraChar.length==1){
            for (int i=0; i<this.paraulaSecreta.length;i++){
                if (lletra.charAt(0)==(this.paraulaSecreta[i])){
                    encontrado=true;
                    this.paraulaEndevinada[i]=lletra;
                    contador++;
                }
            } 
        }
        else{
            frase="Lletra incorrecte";
        }
        
        if (encontrado){
            frase="Lletra correcte, n'hi ha "+contador;
        }
        else if (!encontrado & lletraChar.length==1){
            this.intents-=1;
            frase="Lletra correcte, desgraciadament no es troba a la frase";
        }
        //Comprovar només una lletra
        //Incorrecte retorna: "LLetra incorrecte"
        //Correcte retorna: "Lletra correcte, n'hi ha X"
        //Correcte pero no lletra: "Aquesta lletra no hi és"
        return frase;
    }
}