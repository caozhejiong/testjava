package com.hpe.testjava;

import org.apache.commons.codec.binary.Base64;

public class TestBase64 {
	
	public static void main(String[] args) {
		String originalInput = "test input";
		Base64 base64 = new Base64();
		String encodedString = new String(base64.encode(originalInput.getBytes()));
		System.out.println("encodedString: " + encodedString);
	}

}
