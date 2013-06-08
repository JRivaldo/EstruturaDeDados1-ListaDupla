
public class Teste {
	
	public static void main(String [] args){
		
		ListaDupla list = new ListaDupla();
		list.addFim(10);
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.addFim(5);
		list.addInicio(6);
		list.add(7, 1);
		

		System.out.println(list.toString());
		
		System.out.println(list.mostrarAntProx(1));
		
		list.removerPos(1);
		
		System.out.println(list.toString());
		
		System.out.println(list.mostrarAntProx(1));
		
	}
	

}