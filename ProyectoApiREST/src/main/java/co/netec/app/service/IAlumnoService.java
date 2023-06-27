package co.netec.app.service;

import java.util.List;

import co.netec.app.entities.Alumno;

public interface IAlumnoService{

	public Alumno save(Alumno alumno);
	
	public List<Alumno> findAll();
	
	public boolean delete(Integer id);
	
	public Alumno update(Alumno alumno);
}
