package com.kashanok.tms.ptternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherExmple {
    public static void main(String[] args) {

//		String text = "This paTTern should be presented: mail@example . Another doesn't metter...";
//
//		 String patternString = ".*mail@example.*";
//
//		 Pattern pattern = Pattern.compile(patternString);
//
//		 Matcher matcher = pattern.matcher(text);
//
//		 boolean matches = matcher.matches();
//
//		 System.out.println("Our text matches: " + matches);

//        String text = "This pattern should be presented: mail@example . Another doesn't metter...";
//
//        String patternString = "This pattern should";
//
//        Pattern pattern = Pattern.compile(patternString);
//        Matcher matcher = pattern.matcher(text);
//
//        System.out.println("lookingAt = " + matcher.lookingAt());
//        System.out.println("Our text matches: " + matcher.matches());

		String text = "This pattern should be presented: mail@example . Another doesn't metter...";
		String patternString = "te";

		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(text);

		int count = 0;

		while (matcher.find()) {
			count++;
			System.out.println("found: " + count + " : " + matcher.start() + " - " + matcher.end());
		}

    }
}
