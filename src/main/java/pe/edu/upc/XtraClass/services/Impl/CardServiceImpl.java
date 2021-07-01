package pe.edu.upc.XtraClass.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.XtraClass.model.entity.Card;
import pe.edu.upc.XtraClass.model.repository.CardRepository;
import pe.edu.upc.XtraClass.services.CardService;

@Service
public class CardServiceImpl implements CardService{

	@Autowired
	private CardRepository cardRepository;
	
	@Override
	public JpaRepository<Card, Integer> getRepository() {
		// TODO Auto-generated method stub
		return cardRepository;
	}

}
