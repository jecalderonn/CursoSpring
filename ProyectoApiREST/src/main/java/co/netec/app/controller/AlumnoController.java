package co.netec.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import co.netec.app.entities.Alumno;
import co.netec.app.service.IAlumnoService;

@RestController
public class AlumnoController {
	
	@Autowired
	private IAlumnoService service;
	
	@PostMapping("/alumno")
	public Alumno guardar(@RequestBody Alumno al) {
		Alumno alumno = service.save(al);
		
		return alumno;
	}
	
	@GetMapping("/listar")
	public List<Alumno> listar(){
		
		return service.findAll();
		
	}
	
	@DeleteMapping("/alumno/{id}")
	public ResponseEntity<Void> eliminarAlumno(@PathVariable("id") Integer id) {
		service.delete(id);
		
		return ResponseEntity.noContent().build(); 
	}
	
	@PutMapping("/alumno/update")
	public ResponseEntity<Alumno> actualizarAlumno(@RequestBody Alumno al){
		Alumno alumnoActualizado = service.update(al);
		
		if(alumnoActualizado != null) {
			return new ResponseEntity(alumnoActualizado,HttpStatus.OK);
		}
		return new ResponseEntity(alumnoActualizado, HttpStatus.NOT_FOUND);
	}

}
