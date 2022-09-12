import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testSubtract() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 6;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator); //  3/6 - 1/6 ==> 2/6 ==> 1/3
        Assert.assertEquals(3, x.denominator);
    }

    @Test
    public void testMultiply() {
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 3;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(6, x.denominator);
    }


    @Test
    public void testDivide() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.divide(y);
        Assert.assertEquals(2, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }

    @Test
    public void testEquals() {
        Rational x = new Rational();
        Rational y = new Rational();

        // true if the given rational number equals to the current
        x.numerator = 2;
        x.denominator = 8;
        y.numerator = 1;
        y.denominator = 4;
        Assert.assertTrue( x.equals(y) );

        // false otherwise (false if the given rational number is not equals to the current)
        x.numerator = 3;
        x.denominator = 8;
        y.numerator = 1;
        y.denominator = 4;
        Assert.assertFalse( x.equals(y) );
    }

    @Test
    public void testCompareTo() {
        Rational x = new Rational();
        Rational y = new Rational();

        // -1 if the current rational number is less than the given number
        x.numerator = 3;
        x.denominator = 4;
        y.numerator = 5;
        y.denominator = 4;
        Assert.assertEquals(-1, x.compareTo(y)); // x = this, y = currentNumber

        // 0 if they're equal
        x.numerator = 3;
        x.denominator = 4;
        y.numerator = 3;
        y.denominator = 4;
        Assert.assertEquals(0, x.compareTo(y));

        // 1 if the current rational number is larger than the given number
        x.numerator = 3;
        x.denominator = 4;
        y.numerator = 1;
        y.denominator = 4;
        Assert.assertEquals(1, x.compareTo(y));
    }

    @Test
    public void testToString() {
        Rational x = new Rational();
        x.numerator = 5;
        x.denominator = 7;
        Assert.assertEquals("5/7", x.toString());
    }
}
