package com.jaume.penjat;

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
        //Inicialitzar paraulaEndevinada a tot null i longitud = paraule.length
        //intents = intent
        //intents_total = intent
        //paraulaSecreta = paraula.toCharArray();
    }
    
    public String imprimir(){
        
    }
    
    public String imprimirVides(){
        //"Et queden 4 vides de 4"
        //Retornar "Et queden intents d'un total de intents_total"
    }
    
    public boolean hasGuanyat(){
        
    }
    
    public String verificar(String lletra){
        //Comprovar només una lletra
        //Incorrecte retorna: "LLetra incorrecte"
        //Correcte retorna: "Lletra correcte, n'hi ha X"
        //Correcte pero no lletra: "Aquesta lletra no hi és"
    }
}
