package graph1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class BFS {
   static ArrayList<ArrayList<Integer>>edges = new ArrayList<ArrayList<Integer>>();
    int v;
    BFS(int v){
        this.v=v;
        for(int i=0; i<v; i++){
            edges.add(new ArrayList<>());
        }
    }
    public void addEdge(int src, int dest){
        edges.get(src).add(dest);
        edges.get(dest).add(src);
    }

    public static void bfs(int src, boolean vis[]){
        Queue<Integer>q = new LinkedList<>();
        q.add(src);
        vis[src] = true;


        while(!q.isEmpty()){
            int cur = q.poll();
            System.out.print(cur+" ");

            for(int neighbour : edges.get(cur)){
                if(!vis[neighbour]){
                    vis[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v =4;
        BFS b = new BFS(4);
        b.addEdge(0,1);
        b.addEdge(0,3);
        b.addEdge(3,2);
        b.addEdge(1,2);

        boolean vis[] = new boolean[v];
        bfs(0,vis);
    }
}
