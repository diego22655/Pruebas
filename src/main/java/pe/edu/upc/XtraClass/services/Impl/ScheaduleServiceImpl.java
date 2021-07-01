package pe.edu.upc.XtraClass.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.XtraClass.model.entity.Scheadule;
import pe.edu.upc.XtraClass.model.repository.ScheaduleRepository;
import pe.edu.upc.XtraClass.services.ScheaduleService;

@Service
public class ScheaduleServiceImpl implements ScheaduleService{

	@Autowired
	private ScheaduleRepository scheaduleRepository;
	@Override
	public JpaRepository<Scheadule, Integer> getRepository() {
		// TODO Auto-generated method stub
		return scheaduleRepository;
	}

}
