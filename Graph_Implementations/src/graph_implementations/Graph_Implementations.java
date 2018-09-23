/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph_implementations;

/**
 *
 * @author Indunil Sensly
 */

import java.util.*;
public class Graph_Implementations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                graphImplementation X = new graphImplementation();
                Graph g = new Graph((int) X.V);
                g.addEdge(0, 2, 1);
                g.addEdge(0, 7, 1);
                g.addEdge(2, 0, 1);
                System.out.println(g);
                System.out.println(g.isConnected(2,6));
               
                
                
           }
    
}
