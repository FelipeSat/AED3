main.java

public class Main
{
 public static void main(String [] args){
    TadPilha p = new TadPilha(5);
    p.empilha(1);
    p.empilha(2);
    p.imprimir();
}
}


tadpilha.java 

public class TadPilha{
    int capacidade;
    int topo;
    int dados[];
    
    
    public boolean cheia(){
    return (capacidade == topo-1);
    }
    
    public void empilha (int d){
     if (!cheia ()){
       topo ++;
       dados [topo]= d;
     }
    }
    public TadPilha(int c){
        capacidade = c; 
        topo = -1;
        dados = new int [c];
    } 
    public void imprimir(){
          for(int i = 0; i<=topo; i++){
          System.out.println(dados [i]);
          }
    } 
}
