package foss_graph;
import java.util.*;
import java.io.*;
 
public class Graph_implementation{
 
    public static void main(String[] args) throws FileNotFoundException {
       
        File file = new File("a.txt");
        Scanner stdin = new Scanner(file);
       
        int n,m;
        int a,b;
       
        n = stdin.nextInt();
        m = stdin.nextInt();
 
        ArrayList < ArrayList <Integer> > conn = new ArrayList<  >();
        for(int i=0;i<n+1;i++){
            conn.add(new ArrayList<>());
        }
        //load adajency list
        for(int i=0;i<m;i++){
            a = stdin.nextInt();
            b = stdin.nextInt();
            conn.get(a).add(b);
            conn.get(b).add(a);
        }
               
        boolean [] visited = new boolean[n+1];
       
        for(int i=0;i<n+1;i++){
            visited[i] = false;
        }
       
        Queue <Integer> level = new LinkedList<>();
       
        level.add(8);
        visited[8] = true;
        int si=0;
        int le=0;
        //BFS
        while(!level.isEmpty()){
            System.out.println("Level :" + le);
           
            si = level.size();
           
            while(si>0){
                si--;
                int x = level.poll();
                System.out.println(x);
                for(int j=0;j<conn.get(x).size();j++){
                    if(!visited[conn.get(x).get(j)]){
                        visited[conn.get(x).get(j)] = true;
                        level.add(conn.get(x).get(j));
                    }
                }
            }
            le++;
        }
    }
 
}
    

