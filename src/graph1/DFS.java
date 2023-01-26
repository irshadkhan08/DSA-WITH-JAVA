package graph1;

import java.util.ArrayList;

public class DFS {
   static ArrayList<ArrayList<Integer>>edges = new ArrayList<ArrayList<Integer>>();
    int v;
    public DFS(int v){
        this.v=v;
        for(int i=0; i<v; i++){
            edges.add(new ArrayList<>());
        }
    }
     public void addEdge(int src,int dest){
        edges.get(src).add(dest);
        edges.get(dest).add(src);
     }
     public static void  dfs(int src, boolean vis[]){
        vis[src] = true;
         System.out.print(src+"  ");
       for(int neighbour : edges.get(src)){
           if(!vis[neighbour]){
               dfs(neighbour,vis);
           }
       }
     }
    public static void main(String[] args) {
        int v =4;
        DFS d = new DFS(4);
        d.addEdge(0,1);
        d.addEdge(1,2);
        d.addEdge(2,3);
        d.addEdge(3,0);
//        d.addEdge(0,1);
//
//        d.addEdge(2,3);
//        d.addEdge(0,3);
//        d.addEdge(2,1);
        boolean vis[] = new boolean[v];
        dfs(0,vis);

    }
}
