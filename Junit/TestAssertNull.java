package Junit;

import junit.framework.TestCase;

public class TestAssertNull extends TestCase {

	
	public void testFindByPk() throws Exception {

		UserBean bean = UserModel.findByPk(33); 

		assertNull("user is not null", bean);
		 assertTrue(bean == null);
		//assertTrue("is not true", bean == null);

	}
}