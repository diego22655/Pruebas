package pe.edu.upc.XtraClass.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.XtraClass.model.entity.Subject;
import pe.edu.upc.XtraClass.model.repository.SubjectRepository;
import pe.edu.upc.XtraClass.services.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService{

	@Autowired
	private SubjectRepository subjectRepository;
	@Override
	public JpaRepository<Subject, Integer> getRepository() {
		// TODO Auto-generated method stub
		return subjectRepository;
	}

}
