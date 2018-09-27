/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foss_graph;
import java.io.*;
import java.util.*;

/**
 *
 * @author Indunil Sensly
 */
public class Graph {
 
    private int numVertices;
    private LinkedList<Integer> adjLists[];
    private boolean visited[];
 
    Graph(int vertices)
    {
        numVertices = vertices;
        adjLists = new LinkedList[vertices];
        visited = new boolean[vertices];
        
        for (int i = 0; i < vertices; i++)
            adjLists[i] = new LinkedList<Integer>();
    }
 
    void addEdge(int src, int dest)
    {
        adjLists[src].add(dest);
    }
 
    void DFS(int vertex)
    {
        visited[vertex] = true;
        System.out.print(vertex + " ");
 
        Iterator ite = adjLists[vertex].listIterator();
        while (ite.hasNext())
        {
            int adj = (int) ite.next();
            if (!visited[adj])
                DFS(adj);
        }
    }
 
 
    public static void main(String args[])
    {
        Graph g = new Graph(4);
 
         g.addEdge(0, 1);
         g.addEdge(0, 2);
         g.addEdge(1, 2);
         g.addEdge(2, 3);
 
        System.out.println("Following is Depth First Traversal");
 
        g.DFS(0);
    }

    
}
