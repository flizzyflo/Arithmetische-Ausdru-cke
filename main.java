import Nodes.OperatorNodes.*;
import Tree.Tree;

public class main {
  
    public static void main(String[] args) {
        
        Tree testExampleTree = Tree.createExampleTree(7,11,26,05,128);
        Tree testRandomInput = new Tree(new AddNode(new AddNode(new IntNode(10), new IntNode(5)), new AddNode(new IntNode(10), new IntNode(5))));
        
        System.out.println("Overall tree-structure: " + testExampleTree);
        System.out.println("Overall tree-value: " + testExampleTree.calculateTreeValue());
        System.out.println("-----------------------------------------------------");
        System.out.println("Overall tree-structure: " + testRandomInput);
        System.out.println("Overall tree-value: " + testRandomInput.calculateTreeValue());
    };
};
