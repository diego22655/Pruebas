package pe.edu.upc.XtraClass.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Pays")
public class Pay {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "pay_id")
	private Integer id;
	
	@Column(name = "pay_date")
	@Temporal(TemporalType.DATE)
	private Date payDate;
	@ManyToOne
	@JoinColumn(name = "reservation_id")
	private Reservation reservation;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
}
