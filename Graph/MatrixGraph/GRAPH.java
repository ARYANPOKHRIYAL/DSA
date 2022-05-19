import java.util.ArrayList;

public class Graph{
  //Creating Nodelist and the Adjacency Matrix......
  ArrayList<GraphNode> NodeList= new ArrayList<GraphNode>();
  int[][] adjMatrix;

  public Graph(ArrayList<GraphNode> NodeList){  //Initializing the Matrix and the Nodelist
    this.NodeList= NodeList;
    adjMatrix= new int[NodeList.size()][NodeList.size()];
  }

  public void addUndirectedEdge(int i, int j){
    adjMatrix[i][j]=1;
    adjMatrix[j][i]=1;
  }
//Print method
  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append("   ");
    for (int i = 0; i < nodeList.size(); i++) {
      s.append(nodeList.get(i).name + " ");
    }
    s.append("\n");
    for (int i = 0; i < nodeList.size(); i++) {
      s.append(nodeList.get(i).name + ": ");
      for (int j : adjacencyMatrix[i]) {
        s.append((j) + " ");
      }
      s.append("\n");
    }
    return s.toString();
  }
}
