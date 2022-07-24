package Nodes.OperatorNodes;

import Interface.Nodes;

public class IntNode implements Nodes{

    private int nodeValue;
    
    public IntNode(int value){
        this.nodeValue = value;
    };

    @Override
    public int calculateNodeValue() {

        return this.nodeValue;
    };

    public String toString() {

        return new String(Integer.toString(this.calculateNodeValue()));
    };
};
