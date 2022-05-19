import java.util.ArrayList;

public class Main{
  public static void main(String[] args) {
    ArrayList<GraphNode> NodeList= new ArrayList<GraphNode>();
    NodeList.add(new GraphNode("A",0));
    NodeList.add(new GraphNode("B",1));
    NodeList.add(new GraphNode("C",2));
    NodeList.add(new GraphNode("D",3));
    NodeList.add(new GraphNode("E",4));

    Graph G= new Graph(NodeList);
    G.addUndirectedEdge(0,1);
    G.addUndirectedEdge(0,2);
    G.addUndirectedEdge(0,3);
    G.addUndirectedEdge(1,4);
    G.addUndirectedEdge(2,3);
    G.addUndirectedEdge(3,4);
    System.out.print(G.toString());
  }
}
