main.java

public class Main
{

  public static void main(String[] args) {
    TadFilaPessoa f = new TadFilaPessoa();
    TadFilaPessoa idoso = new TadFilaPessoa();
    TadFilaPessoa naoidoso = new TadFilaPessoa();
    Pessoa p1 = new Pessoa(18, 'M', "jovem1");
    Pessoa p2 = new Pessoa(65, 'F', "idoso1");
    Pessoa p3 = new Pessoa(26, 'M', "jovem2");
    Pessoa p4 = new Pessoa(20, 'M', "jovem3");
    Pessoa p5 = new Pessoa(36, 'M', "jovem4");  
    Pessoa p6 = new Pessoa(18, 'F', "jovem5");
    Pessoa p7 = new Pessoa(80, 'F', "idoso2");
    Pessoa p8 = new Pessoa(22, 'M', "jovem6");
    Pessoa p9 = new Pessoa(72, 'M', "idoso3");
    Pessoa p10 = new Pessoa(68, 'F', "idoso4");  
  
    f.enfila(p1);
    f.enfila(p2);
    f.enfila(p3);
    f.enfila(p4);
    f.enfila(p5);
    f.enfila(p6);
    f.enfila(p7);
    f.enfila(p8);
    f.enfila(p9);
    f.enfila(p10);
    f.desmembra(idoso, naoidoso);
    
    while (naoidoso.conta() > 0 || idoso.conta() > 0){
      if(idoso.conta()>0) System.out.println(idoso.desenfila().nome);
      if(idoso.conta()>0)System.out.println(idoso.desenfila().nome);
      System.out.println(naoidoso.desenfila().nome);
   }
 }
}


pessoa.java

//Cria
class Pessoa{
  int idade;
  char sexo;
  String nome;

  //Alimenta
  public Pessoa(int i, char s, String n){
      idade = i;
      sexo = s;
      nome= n;
    }

  void imprime(){
    System.out.print("Nome: "+nome+", idade: "+idade+", Sexo: "+sexo);
    System.out.print("\n");
  }
}


TadFilaPessoa.java

//Cria
public class TadFilaPessoa{
    
    int fim;
    int inicio;
    int capacidade = 100;
    Pessoa dados[];

    //Alimenta  
    public TadFilaPessoa(){
        this.fim = -1;
        this.inicio = -1;
        this.dados = new Pessoa[capacidade];
    }

  //Enfila retornando se True ou False
	  public boolean enfila (Pessoa p) {
      if(!cheia()){
        fim++;
	      dados[fim] = p;
        return true;
      }
      return false;
	   }

    //Desenfila
    public Pessoa desenfila (){
      Pessoa p = null;
      if(!vazia()){
        inicio++;
        p = dados[inicio];
        }
      return p;
    }

    //Imprime referenciando a impressão da pessoa
    public void imprime () {
	      for (int i= inicio+1; i<=fim ; i++){
	        dados[i].imprime();
        }
	  }
     
     void desmembra (TadFilaPessoa idoso, TadFilaPessoa naoidoso){
        for (int i= inicio+1; i<=fim ; i++){
        if (dados[i].idade >= 60){
        idoso.enfila (desenfila());
        }else{ naoidoso.enfila(desenfila());
        }  
  }
}
	  
	  
	  
	  
    //Retorna se é True ou False
	   public boolean cheia() {
	       return (fim == capacidade);
	   }

    //Retorna se é True ou False
     public boolean vazia(){
       return (fim <= inicio);
     }

    //Conta a quantidade de pessoas na fila
    public int conta(){
      return (fim - inicio);
    }
	
}
