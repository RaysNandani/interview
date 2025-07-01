package Junit;

import static org.junit.Assert.assertNotNull;

import junit.framework.TestCase;

public class TestAssertNotNull extends TestCase { 


	public void testFindByPk() throws Exception {

		UserBean bean = UserModel.findByPk(88);

		assertNotNull("user is null", bean);

	}

}