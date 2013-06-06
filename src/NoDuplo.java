
public class NoDuplo {

	private NoDuplo anterior;
	private NoDuplo proximo;
	private Object objeto;
	
	public NoDuplo(Object objeto){
		this.setObjeto(objeto);
	}
	
	public NoDuplo(Object objeto, NoDuplo anterior, NoDuplo proximo){
		this.setObjeto(objeto);
		this.setAnterior(anterior);
		this.setProximo(proximo);
	}

	public NoDuplo getAnterior() {
		return anterior;
	}

	public void setAnterior(NoDuplo anterior) {
		this.anterior = anterior;
	}

	public NoDuplo getProximo() {
		return proximo;
	}

	public void setProximo(NoDuplo proximo) {
		this.proximo = proximo;
	}

	public Object getObjeto() {
		return objeto;
	}

	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}
	
	

}
