package com.digivision.stringtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Stack;

import static com.digivision.stringtest.ReverseInsideParentheses.reverseInsideParentheses;

@SpringBootApplication
public class StringtestApplication {

	public static void main(String[] args) {
		//SpringApplication.run(StringtestApplication.class, args);
		// Test cases
		String input1 = "abd(jnb)asdf";
		String output1 = reverseInsideParentheses(input1);
		System.out.println("Input: " + input1 + "\nOutput: " + output1);

		String input2 = "abdjnbasdf";
		String output2 = reverseInsideParentheses(input2);
		System.out.println("Input: " + input2 + "\nOutput: " + output2);

		String input3 = "dd(df)a(ghhh)";
		String output3 = reverseInsideParentheses(input3);
		System.out.println("Input: " + input3 + "\nOutput: " + output3);

	}



}
