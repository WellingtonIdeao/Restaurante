package dao;

import javax.persistence.EntityManager;
import model.Reserva;

public class ReservaDAO extends PadraoDAO<Reserva> {

	public ReservaDAO(EntityManager manager) {
		super(manager);
	}

	@Override
	public Class<Reserva> entityClass() {
		return Reserva.class;
	}

}
