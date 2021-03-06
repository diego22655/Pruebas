package pe.edu.upc.XtraClass.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.XtraClass.model.entity.Pay;
import pe.edu.upc.XtraClass.model.repository.PayRepository;
import pe.edu.upc.XtraClass.services.PayService;

@Service
public class PayServiceImpl implements PayService{

	@Autowired
	private PayRepository payRepository;
	@Override
	public JpaRepository<Pay, Integer> getRepository() {
		// TODO Auto-generated method stub
		return payRepository;
	}

}
