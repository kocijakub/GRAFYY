package HRY.ONE_WAY_GRAPH;

public class Main {
    public static void main(String[] args) {
        Graph graf = new Graph("graf");

        int count = 43;
        Vertex first = new Vertex(String.valueOf(count));
        count--;
        Vertex second = new Vertex(String.valueOf(count));
        count--;
        Vertex temp = new Vertex(String.valueOf(count));
        count--;
        second.addnotReachNeighbour(first);

        for(int i = count; i >= 0 ; i--){

            first.addNeighbour(second);
            first.addNeighbour(temp);
            temp.addnotReachNeighbour(first);
            temp.addnotReachNeighbour(second);

            first = second;
            second = temp;
            temp = new Vertex(String.valueOf(i));

            graf.addNode(temp);
        }

       graf.findSafeNodes();

      // for(Vertex node : graf.nodes){System.out.println(node.getName());}

    }
}
