package com.cgi.jenkinsdemo3.test;

import org.junit.Assert;
import org.junit.Test;

import com.cgi.jenkinsdemo3.Jenkinsdemo;

public class JenkinsdemoTest{
	
	@Test
	public void test() {
		Assert.assertEquals(2, new Jenkinsdemo().demo());
		
	}

}
