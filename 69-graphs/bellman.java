for(int i=1; i<V; i++){
    for(each edge u,v,w){
        if(dist[u] + w < dist[v]){
            dist[v] = dist[u] + w;
        }
    }
}
