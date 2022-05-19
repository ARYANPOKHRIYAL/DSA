import java.util.ArrayList;

public class DISJOINTSET{
  ArrayList<WeightedNode> NodeList= new ArrayList<>();

  public static void makeSet(ArrayList<WeightedNode> NodeList){
    for(WeightedNode node: NodeList){
      DisjointSet set new DisjointSet(); //to create a disjoint Set
      set.NodeList.add(node);
      node.set= set;
    }
  }

  public static DisjointSet findSet(WeightedNode node){
    return node.set;
  }

  public static DisjointSet Union(WeightedNode Node1, WeightedNode Node2){
    if(Node1.set.equals(Node2.set)){ //If the size of the sets are equal, return null
      return null;
    }
    else{
      DisjointSet Set1= Node1.set;
      DisjointSet Set2= Node2.set;

      if(Set1.NodeList.size()>Set2.NodeList.size()){  //If the size of Set1 is greater than that of Set2
        ArrayList<WeightedNode> nodeSet2= Set2.NodeList;
        for(WeightedNode node: nodeSet2){ //Merge elements of set2 with that of set1
          node.set= set1;
          Set1.NodeList.add(node);
        }
        return Set1;
      }
      else{ //If size of set2 is greater than thatof set1
        ArrayList<WeightedNode> nodeSet1= Set1.NodeList;
        for(WeightedNode node: nodeSet1){   //merge the elements of set1 with that of set2
          node.set= set2;
          Set2.NodeList.add(node);
        }
        return Set2;
      }
    }
  }
}
