package queue;


import Graph01.Graph;
import Graph01.Vertex;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Graph g = createGraph("graf");
        System.out.println("This is graph named " + g.name);
        List<Vertex> vertexList = g.search();
        System.out.println("visited nodes in order:");
        for(Vertex v : vertexList){
            System.out.print(v.getName()+ " ");
        }
    }
    public static Graph createGraph(String name){
        Graph g = new Graph(name);

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");

        g.addVertex(a);
        g.addVertex(b);
        g.addVertex(c);
        g.addVertex(d);
        g.addVertex(e);

        a.addNeighbour(b);
        b.addNeighbour(a);

        a.addNeighbour(c);
        c.addNeighbour(a);

        c.addNeighbour(b);
        b.addNeighbour(c);

        c.addNeighbour(d);
        d.addNeighbour(c);

        return g;
    }

}
