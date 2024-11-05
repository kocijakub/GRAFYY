package Graph01;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private final String name;
    private final List<Vertex> neighbours;

    public Vertex(String name) {
        this.name = name;
        this.neighbours = new ArrayList<>();
    }

    public void addNeighbour(Vertex node){
        this.neighbours.add(node);
    }

    public List<Vertex> getNeighbours(){
        return neighbours;
    }
    public String getName(){
        return name;
    }

}
