package pe.edu.upc.XtraClass.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.XtraClass.model.entity.Reservation;
import pe.edu.upc.XtraClass.model.repository.ReservationRepository;
import pe.edu.upc.XtraClass.services.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService{

	@Autowired
	private ReservationRepository reservationRespository;
	@Override
	public JpaRepository<Reservation, Integer> getRepository() {
		// TODO Auto-generated method stub
		return reservationRespository;
	}

}
