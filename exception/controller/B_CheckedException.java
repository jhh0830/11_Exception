package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Checked Exception 을 다루는 방법
public class B_CheckedException {
	
	/*
	 * * Checked Exception 은 반드시 예외처리를 해줘야 하는 예외들 
	 * (예외처리 구문을 무조건 써야하는 예외들)
	 * 즉, 예측 불가한 곳에서 발생하기 때문에 미리 예외 처리 구문을 작성해야 함!!
	 * > 주로 "외부 매체" 와 어떤 입출력 시 발생
	 */
	public void method1() throws IOException{
		/*
		try {
			method2();
		}catch(IOException e) {
			System.out.println("예외 발생됨");
		}
		System.out.println("프로그램 종료");
		*/
		method2();
		
	}
	
	
	
	public void method2() throws IOException{
		
		// Checked Exception 이 발생할법한 구문
		
		// 키보드로 값을 입력받을 수 있는 객체 - Scanner 객체
		// Scanner sc = new Scanner(System.in);
		
		// Scanner 와 같이 키보드로 값을 입력받를 수 있는 객체
		// 단, 문자열로만 입력 가능
		BufferedReader br 
		= new BufferedReader( new InputStreamReader(System.in));
		
		System.out.print("아무 문자열을 입력해주세요 : ");
		//String str = br.readLine();
		// > 이 메소드를 호출 시 IOException이 발생할 수 있음을
		// 컴파일 에러로 알려줌 (빨간 밑줄)
		
		//1. try ~ catch 문 이용
		/*
		try {
			String str = br.readLine();
			System.out.println("문자열의 길이 : " + str.length());
		}catch(IOException e) {
			System.out.println("예외 발생됨");
			// > 언제 예외가 발생할지 모름
			// 	 그래서 예외 처리 구문이 필수임!!
		}*/
		
		// 2. throws 키워드 이용
		/*
		 * * throws 키워드
		 * 지금 여기서 예외를 처리하지 않고
		 * 다른고셍서 예외처리를 하도록 떠넘기겠다 라는 뜻 (위임한다)
		 * 
		 * > method2 에서 try ~ catch문을 이용하여 예외처리를 하지 않겠다.
		 *   나를 호출했던 곳에서 try ~ catch문을 이용해서 예외처리를 하도록
		 *   떠넘기겠다.
		 * * 예외 처리 시 왠만해서는 해당 구문에서
		 * 곧바로 try ~ catch문을 이용해서 그자리에서 예외처리를 하고 넘어가자!!
		 * * Unchecked 계열도 throws 로 떠넘길 수 있다!!
		 * 
		 *  * Checked 계열은 메소드 정의부에 throws 로 이미 떠넘기고 있다.
		 *  > 그래서 컴파일 에러로 계속 예외처리 하라고 유도했던 것!!
		 * 
		 */
		String str = br.readLine();
		System.out.println("문자열의 길이 : "+ str.length());
		
		
		//System.out.println("프로그램 종료");
	}
		
	
}
