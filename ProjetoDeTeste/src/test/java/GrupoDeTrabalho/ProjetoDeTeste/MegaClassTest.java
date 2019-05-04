/**
 * 
 */
package GrupoDeTrabalho.ProjetoDeTeste;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author PC2
 *
 */
public class MegaClassTest {

	MegaClass mega;

	@Test
	public void testSum() {
		mega = new MegaClass(2, 3);
		assertEquals(5, mega.sum());
	}

}
