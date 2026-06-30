package graphs;

import java.util.ArrayList;

public class implementaion {
    public static class  edge {
        int src;
        int dest;
        public edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<edge>g[]=new ArrayList[4];
        for(int i=0;i<v;i++){
            g[i]=new ArrayList<>();
        }
        g[0].add(new edge(0,1));
        g[0].add(new edge(0,2));
        g[1].add(new edge(1,0));
        g[1].add(new edge(1,3));
        g[2].add(new edge(2,0));
        g[2].add(new edge(2,3));
        g[3].add(new edge(3,1));
        g[3].add(new edge(3,2));
        // for(int i = 0; i < g.length; i++) {
        //     System.out.print(i + " -> ");
        //     for(int j = 0; j < g[i].size(); j++) {
        //         edge e = g[i].get(j);
        //         System.out.print("("+e.src+","+e.dest+")"+" ");
        //     }
        //     System.out.println();
        // }
        bfs obj=new bfs();
        obj.breath_first_search(g, v);
    }
}
