/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foss_graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Indunil Sensly
 */
public class Graphs extends javax.swing.JFrame {

       static Integer vertex;
       static Integer VI;
       static Integer VJ;

  
            
     
     
    public Graphs() {
        initComponents();
        
        
//        Graphs g;
//            g = new Graphs(0);
    }
    
    private int numVertices;
    private LinkedList<Integer> adjLists[];
    private boolean visited[];
 
    Graphs(int vertices)
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


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        num_vertex = new javax.swing.JTextField();
        create = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Vi = new javax.swing.JTextField();
        Vj = new javax.swing.JTextField();
        DFS_Traversal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BFS_Traversal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        create.setText("Create");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        jButton1.setText("Build");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        DFS_Traversal.setText("DFS Traversel");
        DFS_Traversal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DFS_TraversalActionPerformed(evt);
            }
        });

        jLabel1.setText("Number of vertexs");

        BFS_Traversal.setText("BFS Traversal");
        BFS_Traversal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFS_TraversalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(create)
                                .addGap(33, 33, 33)
                                .addComponent(num_vertex, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Vi, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(Vj, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BFS_Traversal))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DFS_Traversal)))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num_vertex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(create)
                    .addComponent(jLabel1))
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(DFS_Traversal))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Vj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BFS_Traversal))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
            String value;
            value = num_vertex.getText();
            vertex=Integer.parseInt(value);
            Graphs g;
            g = new Graphs(vertex);
            
            System.out.println("Following is Depth First Traversal");
            System.out.println(vertex);
        
 
            
//return vertex;         // TODO add your handling code here:
    }//GEN-LAST:event_createActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            Graphs g;
            g = new Graphs(vertex);
            
            String vi = Vi.getText();
            VI=Integer.parseInt(vi);
            
            String vj = Vj.getText();
            VJ=Integer.parseInt(vj);
            
            g.addEdge(VI, VJ);
            Vi.setText("");
            Vj.setText("");
            g.DFS(0);
            
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DFS_TraversalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DFS_TraversalActionPerformed
           // g.DFS(0);
        
    }//GEN-LAST:event_DFS_TraversalActionPerformed

    private void BFS_TraversalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFS_TraversalActionPerformed
        File file = new File("a.txt"); 
        Scanner stdin = null;
           try {
               stdin = new Scanner(file);
           } catch (FileNotFoundException ex) {
               Logger.getLogger(Graphs.class.getName()).log(Level.SEVERE, null, ex);
           }
       
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
        }        // TODO add your handling code here:
    }//GEN-LAST:event_BFS_TraversalActionPerformed

     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Graphs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graphs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graphs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graphs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graphs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BFS_Traversal;
    private javax.swing.JButton DFS_Traversal;
    private javax.swing.JTextField Vi;
    private javax.swing.JTextField Vj;
    private javax.swing.JButton create;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField num_vertex;
    // End of variables declaration//GEN-END:variables
}
