class DSU{

    int[] parent;

    DSU(int n){

        parent = new int[n];

        for(int i=0;i<n;i++)
            parent[i]=i;
    }

    int find(int x){

        if(parent[x]==x)
            return x;

        return parent[x]=find(parent[x]);
    }

    void union(int a,int b){

        parent[find(a)] = find(b);
    }
}
