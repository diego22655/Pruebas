package pe.edu.upc.XtraClass.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import pe.edu.upc.XtraClass.model.repository.AuthorityRepository;
import pe.edu.upc.XtraClass.model.repository.UserRepository;

@Service
public class AddUserDB implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AuthorityRepository authorityRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		// Students Account
		/*BCryptPasswordEncoder bcpeStudent = new BCryptPasswordEncoder();
		String passwordStudent = bcpeStudent.encode("student"); 
		
		User student1 = new User();
		student1.setUsername("diegoZ");
		student1.setPassword(passwordStudent);
		student1.setSegmento(Segmento.STUDENT);
		student1.setIdSegmento(1);
		student1.setEnable(true);
		
		User student2 = new User();
		student2.setUsername("merkoF");
		student2.setPassword(passwordStudent);
		student2.setSegmento(Segmento.STUDENT);
		student2.setIdSegmento(2);
		student2.setEnable(true);
		
		// Teacher Account
		BCryptPasswordEncoder bcpeTeacher = new BCryptPasswordEncoder();
		String passwordTeacher = bcpeTeacher.encode("teacher");
		
		User teacher1 = new User();
		teacher1.setUsername("ricardoG");
		teacher1.setPassword(passwordTeacher);
		teacher1.setSegmento(Segmento.TEACHER);
		teacher1.setIdSegmento(3);
		teacher1.setEnable(true);
		
		User teacher2 = new User();
		teacher2.setUsername("JulioD");
		teacher2.setPassword(passwordTeacher);
		teacher2.setSegmento(Segmento.TEACHER);
		teacher2.setIdSegmento(4);
		teacher2.setEnable(true);
		
		// Role user: ROLE_STUDENT, ROLE_TEACHER
		student1.addAuthority("ROLE_STUDENT");
		student2.addAuthority("ROLE_STUDENT");
		teacher1.addAuthority("ROLE_TEACHER");
		teacher2.addAuthority("ROLE_TEACHER");
		
		// Accesos a recursos
		student1.addAuthority("ACCESS_STUDENT");
		student2.addAuthority("ACCESS_STUDENT");
		teacher1.addAuthority("ACCESS_TEACHER");
		teacher2.addAuthority("ACCESS_TEACHER");
		
		// SAVE
		userRepository.save(student1);
		userRepository.save(student2);
		
		userRepository.save(teacher1);
		userRepository.save(teacher2);
		*/
		
	}

}
