package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.dao.Dao;

class JUnit_testaa_asiakkaat {

	@Test
	public void testPoistaKaikkiAsiakkaat() {
		Dao dao = new Dao();
		dao.poistaKaikkiAsiakkaat("nimda");
		Arraylist<Asiakas> asiakas = dao.listaaKaikki();
		assertEquals(0,asiakkaat.size());
	}

}
