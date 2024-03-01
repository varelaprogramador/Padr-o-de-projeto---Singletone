package com.padrao;

public class Rota {
	//Crio um objeto para usar quando instanciar
	private static Rota instance;
	///
	String nameAviator;
	//Construtor para as açoes;
	public Rota(String nomeiAviator) {
		
		
		if(nomeiAviator!= null){
			
			this.nameAviator=nomeiAviator;
			System.out.printf("criei o aviao :"+nameAviator+"\n");
			
		}
	}
	
	
	//Função para contruir a minhas instancia 
	
	public static Rota getInstance(String nameAviator) {
		
	//verifico se esta classe nao esta  instanciada
		
		if(instance==null) {
			// caso nao esteja instancio
			
			instance=new Rota(nameAviator);
		
		}else {
			// caso esteja exibo esta mensagem;
			System.out.printf("\n"+"Não foi possivel colocar o aviao "+nameAviator+" na rota!! "+"\n"+"A rota esta ocupada"+"....");
		
		}
			
		return instance;
		
	}

}
