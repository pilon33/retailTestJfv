package jfv.retail.intercorp.dto;

public class KpiClienteDto {
	Double promedioEdad;
	Double desviacion_Estandar;

	public KpiClienteDto(Double promedioEdad, Double desviacion_Estandar) {
		super();
		this.promedioEdad = promedioEdad;
		this.desviacion_Estandar = desviacion_Estandar;
	}

	public KpiClienteDto() {
	}

	public Double getDesviacion_Estandar() {
		return desviacion_Estandar;
	}

	public void setDesviacion_Estandar(Double desviacion_Estandar) {
		this.desviacion_Estandar = desviacion_Estandar;
	}

	public Double getPromedioEdad() {
		return promedioEdad;
	}

	public void setPromedioEdad(Double promedioEdad) {
		this.promedioEdad = promedioEdad;
	}

}
