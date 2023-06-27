package co.netec.app.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.netec.app.modelo.Alumno;

@Controller
public class HomeController {
	//con el Model modelo puedo llevar el controller a la presentacion
	@GetMapping("/")
	public String inicio(Model modelo) {
		Alumno alumnoUno = new Alumno("Rodrigo", 34, "Ingeniero", "Nada Importante");
		
		modelo.addAttribute("alum", alumnoUno);
		
		return "inicio";
	}

}
