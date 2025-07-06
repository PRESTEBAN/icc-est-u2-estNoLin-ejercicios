package main.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import main.Materia.Models.Node;

public class ListLevels {
    
    public List<List<Node>> listLevels(Node root){

        List<List<Node>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }   

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) { 
            int tamano = queue.size();
            LinkedList<Node> nivel = new LinkedList<>();

            for (int i = 0; i < tamano; i++) {
                Node current = queue.poll();
                nivel.add(current);

                if (current.getLeft() != null) {
                    queue.add(current.getLeft());
                }

                if(current.getRight() != null){
                    queue.add(current.getRight());
                }
            }
            result.add(nivel);
        }
        return result;
    }
}