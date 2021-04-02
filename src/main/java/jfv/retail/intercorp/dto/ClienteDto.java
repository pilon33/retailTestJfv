package jfv.retail.intercorp.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ClienteDto extends ClienteModel {
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd" )
	Date fecha_Muerte;
	String id_Cliente;
	
	
	public Date getFecha_Muerte() {
		return fecha_Muerte;
	}

	public void setFecha_Muerte(Date fecha_Muerte) {
		this.fecha_Muerte = fecha_Muerte;
	}

	public String getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(String id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public ClienteDto(String nombre, String apellido, int edad, Date fecha_Nacimiento, Date fecha_Muerte, String id_Cliente) {
		super(nombre, apellido, edad, fecha_Nacimiento);
		this.fecha_Muerte = fecha_Muerte;
		this.id_Cliente = id_Cliente;
	}

	public ClienteDto() {
	}
}
