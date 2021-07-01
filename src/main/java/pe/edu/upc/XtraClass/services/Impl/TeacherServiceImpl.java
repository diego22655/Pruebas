package pe.edu.upc.XtraClass.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.XtraClass.model.entity.Teacher;
import pe.edu.upc.XtraClass.model.repository.TeacherRepository;
import pe.edu.upc.XtraClass.services.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	private TeacherRepository teacherRepository;
	@Override
	public JpaRepository<Teacher, Integer> getRepository() {
		// TODO Auto-generated method stub
		return teacherRepository;
	}

}
