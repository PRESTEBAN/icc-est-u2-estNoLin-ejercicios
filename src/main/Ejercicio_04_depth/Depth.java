package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth{
    
    public int maxDepth(Node root){
        if (root == null) {
            return 0;
        }else{
            int profundiIzquier = maxDepth(root.getLeft());
            int profundiDerecha = maxDepth(root.getRight());

            return Math.max(profundiIzquier, profundiDerecha) + 1;
        }
    }
}   
