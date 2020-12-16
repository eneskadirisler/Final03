package tr.edu.medipol.yazilimaraclari;

import static org.junit.Assert.*;

import org.junit.Test;

public class HarfSaydirmaTest {

	@Test
	public void testHarfleriSaydir() {
		
		String cumle = "Medipol Universitesi ?";
		
		int sonuc = HarfSayd�rmaApp.harfleriSaydir(cumle);
		
		assertEquals(19, sonuc);
	}

}

