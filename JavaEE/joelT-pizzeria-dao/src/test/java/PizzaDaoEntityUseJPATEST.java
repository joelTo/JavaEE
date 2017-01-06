import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.dao.PizzaDaoEntityUseJPA;
import fr.model.CategoriePizza;
import fr.model.Pizza;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringDAOTestConfig.class)
public class PizzaDaoEntityUseJPATEST {
	@Inject
	private PizzaDaoEntityUseJPA pizzaDao;

	@Test
	public void test() {
		Assert.assertEquals((pizzaDao.findAllPizza().stream().filter(x -> "PEP".equals(x.getCode())).findAny().get()),
				new Pizza(1, "PEP", "PEPERONI", CategoriePizza.valueOf("VIANDE"), 11.2));
	}

	@Test
	public void testcreate() {
		pizzaDao.save((new Pizza("MAT", "MATTIEU", CategoriePizza.VIANDE, 10, "test_url")));

		Assert.assertEquals(pizzaDao.findAllPizza().stream().filter(x -> "MAT".equals(x.getCode())).findAny().get(),
				new Pizza("MAT", "MATTIEU", CategoriePizza.VIANDE, 10, "test_url"));
	}

}
