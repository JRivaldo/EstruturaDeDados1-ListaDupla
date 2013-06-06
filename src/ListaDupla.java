
public class ListaDupla {

	private NoDuplo primeiro;
	private NoDuplo ultimo;
	private int size;
	
	public ListaDupla(){
		this.primeiro = null;
		this.ultimo = null;
		this.size = 0;
	}
	
	public void add(Object objeto){
		NoDuplo no = new NoDuplo(objeto);
		if(this.primeiro == null){
			this.primeiro = no;
			this.size++;
			return;
		}
		
		NoDuplo aux = this.primeiro;
		while(aux.getProximo() != null){
			aux = aux.getProximo();
		}
		no.setProximo(aux.getProximo());
		no.setAnterior(aux);
		this.ultimo = no;
		aux.setProximo(this.ultimo);
		;		
		this.size++;
	}
	
	public void addFim(Object objeto){
		NoDuplo no = new NoDuplo(objeto);
		no.setAnterior(this.ultimo);
		no.setProximo(this.ultimo.getProximo());
		this.ultimo.setProximo(no);
		this.size++;
	}
	
	public void addInicio(Object objeto){
		NoDuplo no = new NoDuplo(objeto);
		this.primeiro.setAnterior(no);
		no.setProximo(this.primeiro);
		this.primeiro = no;
		this.size++;
		
	}
	
	public void add(Object objeto, int pos){
		if((pos < 0) || (pos >= size)){
			throw new IndexOutOfBoundsException();
		}
		if(pos == 0){
			this.addInicio(objeto);
			return;
		}
		if(pos == size - 1){
			this.addFim(objeto);
			return;
		}
		NoDuplo no = new NoDuplo(objeto);
		NoDuplo aux = this.primeiro;
		for(int i = 0; i < pos -1; i++){
			aux = aux.getProximo();
		}
		no.setProximo(aux.getProximo());
		no.setAnterior(aux);
		aux.setProximo(no);
		this.size++;
	}
	
	public NoDuplo getNo(int pos){
		if((pos < 0) || (pos >= size)){
			throw new IndexOutOfBoundsException();
		}
		NoDuplo temp = this.primeiro;
		for(int i = 0; i < pos; i++){
			temp =  temp.getProximo();
		}			
		return temp;
	}
	
	
	public String toString() {
		if(this.size == 0){ 
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		NoDuplo atual = this.primeiro;
		
		for (int i = 0; i < this.size -1; i++) { 
			builder.append(atual.getObjeto()); 
			builder.append(", "); 
			atual = atual.getProximo(); 
		}
		
		builder.append(atual.getObjeto()); 
		builder.append("]");
		return builder.toString(); 
	}
	
}
