main.java

 public class Main{
  public static void main(String[] args){
    No n;
    Lista l = new Lista(); 
     n = new No(5);
     l.insereNoFinal(n);
     
     n = new No(6);
     l.insereNoFinal(n);
     
     n = new No(7);
     l.insereNoFinal(n);
     l.imprime();
     
   }
}


no.java

  public class No{
    int dado;
    No proximo;


  public No (int aux){
    dado = aux;
    proximo = null; 
     } 

  public void imprime(){
    System.out.println("Dados = " + dado);
     }
}



lista.java

public class Lista{
  No inicio;   


  public Lista(){
     inicio = null;
  } 


  public void insereNoFinal(No aux){
    if (nulo()){
        inicio = aux;
    }  
      else{ 
          No atual;
          atual = inicio;
         while (atual.proximo != null){
          atual = atual.proximo;
           }
      atual.proximo = aux;
          }  
  }
 
 
  public boolean nulo(){
     return (inicio == null);
  }


   public void imprime(){
        No atual;
          atual = inicio;
         while (atual != null){
          atual.imprime();
          atual = atual.proximo;
          
           }
         } 

}
