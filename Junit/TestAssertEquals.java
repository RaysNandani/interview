package Junit;

import static org.junit.Assert.assertEquals;

public class TestAssertEquals {

	
	public void update() throws Exception {

		UserBean bean = UserModel.findByPk(1);

		bean.setName("kapil");

		UserModel.update(bean);

		bean = UserModel.findByPk(1);

		assertEquals("kapil", bean.getName());
z-
	}

}