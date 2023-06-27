package co.netec.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.netec.app.dao.IArticuloDao;
import co.netec.app.entity.Articulo;
@Service
public class ArticuloServiceImpl implements IArticuloService {

	@Autowired
	private IArticuloDao dao;
	
	@Override
	public List<Articulo> findAll() {
		// codigo que conecte a la BD y traiga los articulos
		List<Articulo> result=(List<Articulo>) dao.findAll();
		
		return result;
	}

	
}
