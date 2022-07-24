package Nodes.OperatorNodes;

import Interface.Nodes;
import Nodes.BinaryOperatorNode;

public class DivNode extends BinaryOperatorNode {

    public DivNode(Nodes first, Nodes second) throws IllegalArgumentException {
        super(first, second);
    };

    @Override
    public int calculateNodeValue() throws ArithmeticException {
        
        // Outputs the values of the node. Computes the two attached Int nodes.
        // If operands are Int nodes, then they return node value, otherwise "recursive" call on the operand, 
        // to advance further in the tree

        if (this.getFirstOperand().calculateNodeValue() == 0 || this.getSecondOperand().calculateNodeValue() == 0){
            throw new ArithmeticException("Division durch 0!");
        };

        return this.getFirstOperand().calculateNodeValue() / this.getSecondOperand().calculateNodeValue() ;
    };

    @Override
    public String toString() {

        // Returns the values of the current node as strings.
        // If operands are IntNodes, then return node value, 
        // otherwise "recursive" call on the operand to advance further in the tree.

        return "(" + this.getFirstOperand().toString() + " / " + this.getSecondOperand().toString() + ")";
    };
    
};