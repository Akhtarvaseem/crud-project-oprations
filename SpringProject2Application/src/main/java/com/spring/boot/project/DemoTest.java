//package com.spring.boot.project;
//
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class DemoTest {
//
//	public static void main(String[] args) {
//
//		String regex = "(?<=[\\d])(,)(?=[\\d])";
//	        Pattern p = Pattern.compile(regex);
//	        System.out.println("Value?: ");
//	            Scanner scanIn = new Scanner(System.in);
//	            String str = scanIn.next();
//	        Matcher m = p.matcher(str);
//	        str = m.replaceAll("");
//	        System.out.println(str);
//	}
//}
