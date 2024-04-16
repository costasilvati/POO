
public class Venda {
	private int mes;
	private int ano;
	private double valor;
	
	public Venda(int mes, int ano, double valor) {
		this.ano = ano;
		setMes(mes);
		this.valor = valor;
	}
	
	public Venda() {}
	
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		if(mes <=12 && mes >=1) {
			this.mes = mes;
		}else {
			System.out.println("Mês inválido, digite um valor entre 1 e 12");
		}
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
