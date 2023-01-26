package graph1;

public class Graph1 {
    int a[][];

    public Graph1(int v){
        a = new int[v][v];
    }
    public void addEdge(int src,int dest ){
        a[src][dest] = 1;
        a[dest][src] = 1;
    }
    public static void main(String[] args) {
        int v = 4;

        Graph1 g = new Graph1(v);
        g.addEdge(0,1);
        g.addEdge(0,2);
    }
}
