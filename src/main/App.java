package main;

import utils.StudentValidator;
import main.Materia.Models.Node;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;

import java.util.List;

import main.Ejercicio_01_insert.InsertBSTTest;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        // var estudiante = StudentValidator.validarDatos();
        // System.out.println("👤 Estudiante: " + estudiante.nombre());
        // System.out.println("✉️ Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ
        int[] valores = { 5, 3, 7, 2, 4, 6, 8 };

        System.out.print("Input: [");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i]);
            if (i < valores.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");

        InsertBSTTest bstTest = new InsertBSTTest();
        Node raizBST = null;
        for (int val : valores) {
            raizBST = bstTest.insert(raizBST, val);
        }

        imprimirArbolDesdeRaiz(raizBST, " Árbol BST construido:");

        System.out.println();

        System.out.println("********** Ejercicio 02: Invertir árbol binario **********");
        int[] valores2 = { 4, 2, 7, 1, 3, 6, 9 };

        System.out.print("Input: [");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores2[i]);
            if (i < valores2.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");

        InsertBSTTest bstTest2 = new InsertBSTTest();
        Node raizBST2 = null;

        for (int val : valores2) {
            raizBST2 = bstTest.insert(raizBST2, val);
        }

        imprimirArbolDesdeRaiz(raizBST2, " Árbol BST construido:");

        InvertBinaryTree inversor2 = new InvertBinaryTree();
        Node raizInvertida2 = inversor2.invertTree(raizBST2);

        imprimirArbolDesdeRaiz(raizInvertida2, " Árbol BST invertido:");

        System.out.println("********** Ejercicio 03: Listar niveles **********");
        System.out.print("Input: [");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores2[i]);
            if (i < valores2.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
        InsertBSTTest bstNuevo = new InsertBSTTest();
        Node nuevaRaiz = null;
        for (int val : valores2) {
            nuevaRaiz = bstNuevo.insert(nuevaRaiz, val);
        }

        ListLevels listador = new ListLevels();
        List<List<Node>> niveles = listador.listLevels(nuevaRaiz);

        int nivel = 0;
        for (List<Node> lista : niveles) {
            System.out.print("Nivel " + nivel + ": ");
            for (Node nodo : lista) {
                System.out.print(nodo.getValue() + " ");
            }
            System.out.println();
            nivel++;
        }

        System.out.println("********** Ejercicio 04: Profundidad máxima **********");
        int[] lista4 = { 4, 2, 7, 1, 3, 8 };

        InsertBSTTest bstProfundidad = new InsertBSTTest();
        Node raizProfundidad = null;
        for (int val : lista4) {
            raizProfundidad = bstProfundidad.insert(raizProfundidad, val);
        }

        System.out.print("Input: [");
        for (int i = 0; i < lista4.length; i++) {
            System.out.print(lista4[i]);
            if (i < lista4.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");

        Depth depth = new Depth();
        int profundidad = depth.maxDepth(raizProfundidad);
        System.out.println("Profundidad del árbol: " + profundidad);

    }

    public static void imprimirArbolDesdeRaiz(Node root, String titulo) {
        System.out.println(titulo);
        ArbolBinario printer = new ArbolBinario();
        printer.printTreeNode2(root, "", true);
    }

}
