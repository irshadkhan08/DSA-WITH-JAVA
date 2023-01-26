package graph1;

import java.util.ArrayList;

public class Graph2 {
    ArrayList<ArrayList<Integer>>edges = new ArrayList<ArrayList<Integer>>();
    int v;
    public Graph2(int v){
        this.v = v;
        for(int i =0; i<v; i++) {
            edges.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int src,int dest){
        edges.get(src).add(dest);
        edges.get(dest).add(src);
    }
    public static void main(String[] args) {
        int v =4;
         Graph2 g = new Graph2(4);
         g.addEdge(0,1);
         g.addEdge(1,2);
         g.addEdge(2,3);
         g.addEdge(3,0);

    }
}
