package pe.edu.upc.XtraClass.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.XtraClass.model.entity.Qualification;
import pe.edu.upc.XtraClass.model.repository.QualificationRepository;
import pe.edu.upc.XtraClass.services.QualificationService;

@Service
public class QualificationServiceImpl implements QualificationService{

	@Autowired
	private QualificationRepository qualificationRepository;
	@Override
	public JpaRepository<Qualification, Integer> getRepository() {
		// TODO Auto-generated method stub
		return qualificationRepository;
	}

}
