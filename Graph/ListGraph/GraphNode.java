import java.util.ArrayList;

public class GraphNode{
  public String name;
  public int index;
  public boolean isVisited= false;

  public ArrayList<GraphNode> Neighbours= new ArrayList<GraphNode>(); //Each node will have some neighbours

  public GraphNode(String name, int index){
    this.name= name;
    this.index= index;
  }
}
