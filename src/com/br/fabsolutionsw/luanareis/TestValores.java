package com.br.fabsolutionsw.luanareis;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestValores extends TestCase{

	private Valores val;
	
	@Before
	protected void setUp() throws Exception{
	super.setUp();
		val = new Valores();
		val.ins(5);
		val.ins(12);
		val.ins(1);
		val.ins(30);
		val.ins(152);
		val.ins(6);
	}

	@Test
	public void testIns() {
		assertEquals(false, val.ins(-10));
		assertEquals(false, val.ins(0));
		val.ins(2);
		assertEquals(7, val.size());
		val.ins(3);
		assertEquals(8, val.size());
		val.ins(4);
		assertEquals(9, val.size());
		val.ins(5);
		assertEquals(10, val.size());
		assertEquals(false, val.ins(11));
	}
	
	@Test
	public void testDel() {
		assertEquals(5, val.del(0));
		assertEquals(6, val.del(4));
		assertNotSame(-1, val.del(4));
		assertNotSame(152, val.del(0));
		assertNotSame(-1, val.del(0));
	}

}
