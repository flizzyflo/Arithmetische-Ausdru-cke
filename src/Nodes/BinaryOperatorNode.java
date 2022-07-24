package Nodes;

import Interface.Nodes;

public abstract class BinaryOperatorNode implements Nodes {
    
    private Nodes erster;
    private Nodes zweiter;

    public BinaryOperatorNode(Nodes erster, Nodes zweiter) throws IllegalArgumentException{
        
        // check für null objekte; wenn beide inputs != null, dann wird objekt erzeugt.
        if (erster == null || zweiter == null){
            throw new IllegalArgumentException("Ungültige Eingabe, mindestens einer der übergebenen Werte ist 'null'");
        };

        this.erster = erster;
        this.zweiter = zweiter;
    };

    public Nodes getFirstOperand() {
        // gibt ersten Knoten zurück als Objekt
        return this.erster;
    };

    public Nodes getSecondOperand() {
        // gibt zweiten Knoten zurück als Objekt
        return this.zweiter;
    };

};

