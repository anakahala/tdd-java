/**
 *
 */
package tdd.test;

import junit.framework.TestCase;

import org.junit.Test;

import tdd.code.Dollar;

/**
 * @author anakahara
 * 
 */
public class DollarTest extends TestCase {

    @Test
    public void testMultiplication() {
	Dollar five = new Dollar(5);
	Dollar product = five.times(2);
	assertEquals(10, product.amount);
	product = five.times(3);
	assertEquals(15, product.amount);
    }

    public void testEquality() {
	assertTrue(new Dollar(5).equals(new Dollar(5)));
    }
}
