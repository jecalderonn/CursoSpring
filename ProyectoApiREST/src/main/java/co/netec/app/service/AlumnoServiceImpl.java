package co.netec.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.netec.app.dao.IAlumnoDAO;
import co.netec.app.entities.Alumno;
@Service
public class AlumnoServiceImpl implements IAlumnoService {
	@Autowired
	private IAlumnoDAO dao;
	
	@Override
	@Transactional
	public Alumno save(Alumno alumno) {
		Alumno alum=dao.save(alumno);
		// TODO Auto-generated method stub
		return alum;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findAll() {
		List<Alumno> alumnos =(List<Alumno>) dao.findAll();
		// TODO Auto-generated method stub
		return alumnos;
	}

	@Override
	@Transactional
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		//Aqui hay que colocar un try catch
		dao.deleteById(id);
		return true;
	}

	@Override
	@Transactional
	public Alumno update(Alumno alumno) {
		// TODO Auto-generated method stub
		//Solución del profe
		Optional<Alumno> alumnoBD = dao.findById(alumno.getId());
		/*
		if(alumnoBD.isPresent()) {
			
			Alumno alumnoActualizado=alumnoBD.get();
			alumnoActualizado.setNombre(alumno.getNombre());
			alumnoActualizado.setEdad(alumno.getEdad());
			alumnoActualizado.setCorreo(alumno.getCorreo());
			//Se realiza el update, solo existe el metodo save
			return save(alumnoActualizado);
		}
		*/
		// Solución personal
		if(dao.existsById(alumno.getId())) {
			return dao.save(alumno);
		}
		return null;
	}
	

}
