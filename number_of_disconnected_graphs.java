import java.io.*;

import java.util.*;

public class Solution
{

	
	
    @SuppressWarnings("unchecked")



    
    static class Graph
    {

        int v;

        boolean [] visited;
        LinkedList<Integer>[]adj;

	
        Graph (int v)

    	{

    	    this.v = v;

    	    this.adj = new LinkedList[v];
    
  	    for (int i = 0; i < v; i++)

                this.adj[i] = new LinkedList<Integer>();

      	}

        

        public void enqueue (int first, int second)

        {

            this.adj[first].add(second);

            this.adj[second].add(first);

        }

   
        public int dfs()

        {

            this.visited = new boolean [v];

            int c = 0;

            for (int i = 0; i < v; i++)

            {

                visited[i]  = false;

            }

            
for (int i = 0; i < v; i++)

            {

                if (visited[i] == false)

                {

                    dfs(i);

                    c++;

                }

            }

            return c;
 
        }


        
 public void dfs(int source)

         {

            visited [source] = true;

            
for ( Integer i : adj[source] )

            {

                if ( visited [i] == false)

                {

                    dfs(i);

                }

            }

        }

    }

        
public static void main(String[] args)
        {

            int t,v,e,count=0;
            Scanner scan = new Scanner(System.in);


            t = scan.nextInt();

            while (t != 0)
		
            {

                v = scan.nextInt();

                e = scan.nextInt();


                Graph g = new Graph(v);

                while (e != 0)
                {

                    int first = scan.nextInt();

                    int second = scan.nextInt();

                    g.enqueue(first,second);

                    e = e - 1;
                }

            
count = g.dfs();

            t = t - 1;

           // System.out.println("s ");

           System.out.println(count);

		}

        }

}
