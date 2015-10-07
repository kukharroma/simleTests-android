package instrumentation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by roma on 06.10.15.
 */
public class SimpleUnitUserTest {

    @Test
    public void user_name_is_correct() throws Exception {
        User user = new User();
        user.setName("test");
        String testUserName = user.getName();
        assertEquals("test", testUserName);
    }


}
