package Tree;
import Interface.*;
import Nodes.OperatorNodes.*;

public class Tree {

    /*
     * Tree class manages the nodes. Can output structure 
     * or calculate the value of the tree.
     */
    
    private Nodes rootNode;

    public Tree(Nodes rootNode) {
        this.rootNode = rootNode;
    };

    public static Tree createExampleTree(int a, int b, int c, int d, int e){
       
        // Structure Example-Tree: ((a * b) + (c / (d - e)))

        MultNode leftNode = new MultNode(new IntNode(a), new IntNode(b));
        SubNode rightRightNode = new SubNode(new IntNode(d), new IntNode(e));
        DivNode rightNode = new DivNode(new IntNode(c), rightRightNode);

        Tree exampleTree = new Tree(new AddNode(leftNode, rightNode));

        return exampleTree;
    };

    public Nodes getRootNode(){
        return this.rootNode;
    };

    @Override
    public String toString(){

        // Ruft toString() Methode der Wurzel auf um Struktur wiederzugeben. Wenn andere
        // Knoten an Wurzel hängen werden deren toString() Methoden gecallt usw.

        return this.getRootNode().toString();
    };

    public int calculateTreeValue(){

        // Ruft werteAus() Method der Wurzel und damit der einzelnen an der Wurzel hängenden Knoten auf
        // Gibt letztlich den Gesamtwert des Baumes aus.

        return this.getRootNode().calculateNodeValue();
    };

}
