import java.util.*;

public class Graph{
  ArrayList<GraphNode> NodeList= new ArrayList<GraphNode>();

  public Graph(ArrayList<GraphNode> NodeList){
    this.NodeList= NodeList;
  }

  public void addUndirectedEdge(int i, int j){
    GraphNode First= NodeList.get(i);
    GraphNode Second= NodeList.get(j);
    First.Neighbours.add(Second);
    Second.Neighbours.add(First);
  }
  // For printing Graph to the console

  // public String toString() {
  //   StringBuilder s = new StringBuilder();
  //   for (int i = 0; i < NodeList.size(); i++) {
  //     s.append(NodeList.get(i).name + ": ");
  //     for (int j =0; j < NodeList.get(i).Neighbors.size(); j++) {
  //       if (j == NodeList.get(i).Neighbors.size()-1 ) {
  //         s.append((NodeList.get(i).Neighbors.get(j).name) );
  //       } else {
  //         s.append((NodeList.get(i).Neighbors.get(j).name) + " -> ");
  //       }
  //     }
  //     s.append("\n");
  //   }
  //   return s.toString();
  // }

  //BFS INTERNAL
  void bfsVisit(GraphNode node){
    LinkedList<GraphNode> Q= new LinkedList<GraphNode>();
    Q.add(node);

    while(!Q.isEmpty()){
      GraphNode currentNode= Q.remove(0);
      currentNode.isVisited= true;
      System.out.print(currentNode.name+" ");

      for(GraphNode Neighbours: currentNode.Neighbours){
        if(!Neighbours.isVisited){
          Q.add(Neighbours);
          Neighbours.isVisited= ture;
        }
      }

    }

  }
  //Main BFS
  void bfs(){
    for(GraphNode node: NodeList){
      if(!node.isVisited)
        bfsVisit(node);
    }
  }
}
