package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import graphs.implementaion.edge;

public class bfs {
    public static void breath_first_search(ArrayList<edge>g[],int n){
        Queue<Integer>q=new LinkedList<>();
        boolean v[]=new boolean[n];
        q.add(0);
        while (!q.isEmpty()) {
            int crr=q.remove();
            if(v[crr]==false){
                System.out.print(crr+" ");
                v[crr]=true;
                for(int i=0;i<g[crr].size();i++){
                    edge e=g[crr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
}
