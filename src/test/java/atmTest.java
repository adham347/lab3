import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class atmTest
{
    atm x;
    deposit d;
    withdraw w;
    String s;

    @BeforeEach
    public void init() {
        x = new atm();
        d = new deposit();
        w = new withdraw();
    }

    class moneyGrabber {
        int insert(int x) {
            if (x > 0) return x;
            else return 0;
        }
    }

    @Test
    public void atmstub() {
        moneyGrabber y = new moneyGrabber();
        x.operate(2, y.insert(5000));
        assertEquals(x.balance, 5000);
    }

    @Test
    public void withdrawstub() {
        moneyGrabber y = new moneyGrabber();
        double z = w.withdraw(2000, y.insert(5000));
        assertEquals(z, 3000);
    }

    @Test
    public void depositstub() {
        moneyGrabber y = new moneyGrabber();
        double z = d.deposit(2000, y.insert(5000));
        assertEquals(z, 7000);
    }

    @AfterEach
    public void clean() {
        x = null;
    }
}