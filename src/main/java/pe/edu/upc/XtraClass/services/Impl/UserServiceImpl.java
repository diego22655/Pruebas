package pe.edu.upc.XtraClass.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.XtraClass.model.entity.User;
import pe.edu.upc.XtraClass.model.repository.UserRepository;
import pe.edu.upc.XtraClass.services.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public JpaRepository<User, Integer> getRepository() {
		return userRepository;
	}

}
