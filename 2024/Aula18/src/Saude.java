import java.util.Calendar;

final class Saude extends Despesa{
	private String motivo;

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	/* Não pode ser sobrescrito, por ser final na super classe
	public void editarData(Calendar data) {
		data.add(Calendar.MONTH, 1);
		super.setData(data);
	}
	*/

	@Override
	public String toString() {
		return super.toString()+"Saude [motivo=" + motivo + "]";
	}
	
	
}
