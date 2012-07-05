/**
 * 
 */
package com.hangum.tadpole.mongodb.core.utils;

import java.util.Date;

import junit.framework.TestCase;

/**
 * mongodb java type string to java object convert test
 * 
 * @author hangum
 *
 */
public class MongoDBJavaStrToJavaObjTest extends TestCase {

	/**
	 * Test method for {@link com.hangum.tadpole.mongodb.core.utils.MongoDBJavaStrToJavaObj#convStrToObj(java.lang.String, java.lang.String)}.
	 */
	public void testConvStrToObjStringString() {
		try {
			Object obj = MongoDBJavaStrToJavaObj.convStrToObj("java.lang.String", "aa");
			if(obj instanceof String) {				
			} else fail("java string convert fail");
		} catch (Exception e) {
			e.printStackTrace();
			fail("java String convert fail");
		}		
	}
	
	/**
	 * Test method for {@link com.hangum.tadpole.mongodb.core.utils.MongoDBJavaStrToJavaObj#convStrToObj(java.lang.String, java.lang.String)}.
	 */
	public void testConvStrToObjStringDouble() {
		try {
			Object obj = MongoDBJavaStrToJavaObj.convStrToObj("java.lang.Double", "12");
			if(obj instanceof Double) {				
			} else fail("java Double convert fail");
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("java String convert fail");
		}
		
	}
	
	/**
	 * Test method for {@link com.hangum.tadpole.mongodb.core.utils.MongoDBJavaStrToJavaObj#convStrToObj(java.lang.String, java.lang.String)}.
	 */
	public void testConvStrToObjStringDouble2() {
		try {
			Object obj = MongoDBJavaStrToJavaObj.convStrToObj("java.lang.Double", "12asdf");
			if(obj instanceof Double) {
			} else {
				fail("java Double convert fail");
			}
		} catch(Exception e) {
		}
	}
	
	/**
	 * Test method for {@link com.hangum.tadpole.mongodb.core.utils.MongoDBJavaStrToJavaObj#convStrToObj(java.lang.String, java.lang.String)}.
	 */
	public void testConvStrToObjStringDate() {
		try {
			Object obj = MongoDBJavaStrToJavaObj.convStrToObj("java.util.Date", "2011-11-11");
			if(obj instanceof Date) {				
			} else fail("java Date convert fail");
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("java Date convert fail");
		}
		
	}
	
	/**
	 * Test method for {@link com.hangum.tadpole.mongodb.core.utils.MongoDBJavaStrToJavaObj#convStrToObj(java.lang.String, java.lang.String)}.
	 */
	public void testConvStrToObjStringDate2() {
		try {
			Object obj = MongoDBJavaStrToJavaObj.convStrToObj("java.util.Date", "20111111");
			if(obj instanceof Date) {				
			} else fail("java Date convert fail");
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("java Date convert fail");
		}
		
	}
	
	/**
	 * Test method for {@link com.hangum.tadpole.mongodb.core.utils.MongoDBJavaStrToJavaObj#convStrToObj(java.lang.String, java.lang.String)}.
	 */
	public void testConvStrToObjStringDate3() {
		try {
			Object obj = MongoDBJavaStrToJavaObj.convStrToObj("java.util.Date", "20111111 12:12");
			System.out.println(obj.toString());
			if(obj instanceof Date) {				
			} else fail("java Date convert fail");
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("java Date convert fail");
		}
		
	}

	/**
	 * Test method for {@link com.hangum.tadpole.mongodb.core.utils.MongoDBJavaStrToJavaObj#convStrToObj(java.lang.String, java.lang.String[])}.
	 */
	public void testConvStrToObjStringStringArray() {
		String[] values = {"10", "20", "30"};
		try {
			Object[] objs = MongoDBJavaStrToJavaObj.convStrToObj("java.lang.Double", values);
		} catch (Exception e) {
			fail("java array Dobule convert error");
		}
	}

}
