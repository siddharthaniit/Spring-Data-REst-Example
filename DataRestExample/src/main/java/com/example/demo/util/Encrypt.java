package com.example.demo.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encrypt {
	public static String MDbytesToString(byte[] bytes) {
		String result = null;
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			md.update(bytes);
			byte[] mdbytes = md.digest();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < mdbytes.length; i++) {
				sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
			}
			result = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
