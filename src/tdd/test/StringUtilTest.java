package tdd.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tdd.code.StringUtil;

public class StringUtilTest {

    @Test
    public void testIsEmpty() {
	assertEquals(true, StringUtil.isEmpty(""));
	assertEquals(false, StringUtil.isEmpty("a"));
	assertEquals(true, StringUtil.isEmpty(null));
    }

    @Test
    public void testIsNumber() {
	assertEquals(false, StringUtil.isNumber(""));
	assertEquals(false, StringUtil.isNumber("a"));
    }

}
