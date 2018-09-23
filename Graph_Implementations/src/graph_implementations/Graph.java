/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph_implementations;

/**
 *
 * @author Indunil Sensly
 * 
 */
import java.util.*;
public class Graph {
    
    class Edge{
        int v,w;
        public Edge(int v,int w){
            this.v = v;
            this.w = w;
            }// Edge constructor
        //Overide
        public String toString(){
            return "("+v+"."+w+")";
        }
        }// end of class Edge
    List<Edge> G[]; //create a array of linked list
    public Graph(int n){
        G= new LinkedList[n];
        for(int i=0;i<G.length;i++){
            G[i]=new LinkedList<Edge>();
        }
    }// end of the Graph constructor
    
    public String toString(){
        String result="";
        for(int i=0;i<G.length;i++){
            result +=i+"=>"+G[i]+"\n";
           }
        return result;
    }
    
    void addEdge(int u,int v,int w){
        G[u].add(0,new Edge(v, w));
    }
    
    boolean isConnected(int u,int v){
        for(Edge i:G[u])
            if(i.v==v) return true;
        return false;
        
    }
}
