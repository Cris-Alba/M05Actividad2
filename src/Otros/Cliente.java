package Otros;

public class Cliente{
	private String nombre;
	private Telefono telefono = new Telefono();


	public String getTelefonoTrabajo() {
		return telefono.telefonoTrabajo;
	}
	public String getTelefonoCasa() { 
		return telefono.telefonoCasa;
	}

}
