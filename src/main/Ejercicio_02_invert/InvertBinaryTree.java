package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree{
    
    public Node invertTree(Node root){
        
        if (root == null) {
            return null;
        }

        Node nodoTemporal = root.getLeft();
        root.setLeft(invertTree(root.getRight()));
        root.setRight(invertTree(nodoTemporal));
        
        return root;
    }
}