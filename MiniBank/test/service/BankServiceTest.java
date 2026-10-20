package service;

import org.junit.Test;
import static org.junit.Assert.*;

public class BankServiceTest {
    @Test
    public void testStart() {
        BankService service = new BankService();
        service.start();
        assertNotNull(service);
    }
}
