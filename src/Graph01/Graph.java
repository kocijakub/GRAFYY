package Graph01;

import queue.LIFOQueue;

import java.util.LinkedList;
import java.util.List;

public class Graph {
    public final String name;
    private final List<Vertex> vertexList;
    public Graph(String name){
        this.name = name;
        this.vertexList = new LinkedList<>();
    }
    public void addVertex(Vertex node){
        vertexList.add(node);
    }
    public List<Vertex> search(){

        LIFOQueue<Vertex> LIFOQueue = new LIFOQueue<>();
        List<Vertex> newList = new LinkedList<>();

        for (Vertex vertex : vertexList) LIFOQueue.enqueue(vertex);

        while (!LIFOQueue.isEmpty()) {
            Vertex current = LIFOQueue.dequeue();

            if (newList.contains(current)) continue;

            newList.add(current);
            List<Vertex> neighbours = current.getNeighbours();
            System.out.print(current.getName() + " -> my neighbours: ");
            for (Vertex neighbour : neighbours) {
                System.out.print(neighbour.getName() + " ");
                if (!newList.contains(neighbour)) {
                    LIFOQueue.enqueue(neighbour);
                }
            }
            System.out.println();
        }
        return newList;
    }
}
