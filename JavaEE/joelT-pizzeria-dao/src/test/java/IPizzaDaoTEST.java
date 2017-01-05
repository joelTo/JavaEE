import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.dao.PizzaDao;
import fr.model.CategoriePizza;
import fr.model.Pizza;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringDAOTestConfig.class)
public class IPizzaDaoTEST {

	@Autowired
	private PizzaDao pizzaDao;

	@Test
	public void test() {
		Assert.assertEquals((pizzaDao.findAllPizza().get(0)),
				new Pizza(1, "PEP", "PEPERONI", CategoriePizza.valueOf("VIANDE"), 11.2));
		// fail("Not yet implemented");
	}

	@Test
	public void testcreate() {
		pizzaDao.create(new Pizza("MAT", "MATTIEU", CategoriePizza.VIANDE, 10));
		Assert.assertEquals((pizzaDao.findAllPizza().get(1)), new Pizza("MAT", "MATTIEU", CategoriePizza.VIANDE, 10));
	}

	@Test
	public void testupdate() {
		pizzaDao.update(new Pizza("MET", "MATTIE2", CategoriePizza.VIANDE, 14), "MAT");
		Assert.assertEquals((pizzaDao.findAllPizza().get(1)), new Pizza("MET", "MATTIE2", CategoriePizza.VIANDE, 14));
	}

}
