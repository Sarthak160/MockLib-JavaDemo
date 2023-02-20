import io.keploy.service.mock.MockLib;
import org.example.HttpCall;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HttpCallTest {
    @Test
    public void testHttpCall() throws Exception {
        new MockLib("example test 2");

        HttpCall httpCall = new HttpCall();
        String response = httpCall.getResponse();
        if (response != null) {
            assertTrue(true);
        }
        assert response != null;
        assertTrue(response.contains("example"));
    }

    @Test
    public void testHttpCall2() throws Exception {
        new MockLib("google test 2");

        HttpCall httpCall = new HttpCall();
        String response = httpCall.getResponse2();
        if (response != null) {
            assertTrue(true);
        }
    }

}
