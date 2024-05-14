import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		Despesa desp = new Despesa();
		desp.setCarteira(1);
		desp.setDescricao("Comida de cachorro");
		desp.setValor(99.00);
		//desp.setId(1); // Atributo final não pode ser editado
		Calendar c = Calendar.getInstance();
		desp.setData(c);
		c.add(Calendar.DAY_OF_MONTH, 2);
		desp.editarData(c);
		
		Saude sDesp = new Saude();
		sDesp.setDescricao("Dorflex");
		sDesp.setValor(15.00);
		sDesp.setData(Calendar.getInstance());
		
		desp.editarData(Calendar.getInstance());
		
		Exames exDesp = new Exames();
		//exDesp.setDescricao("Dengue");
	}

}
