package co.netec.app.modelo;

public class Alumno {
	
	private String nombre;
	private int edad;
	private String ocupacion;
	private String descripcion;
	
	
	
	public Alumno(String nombre, int edad, String ocupacion, String descripcion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.ocupacion = ocupacion;
		this.descripcion = descripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
