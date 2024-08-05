package com.kh.exception.run;

import java.io.IOException;

import com.kh.exception.controller.A_UnchekedException;
import com.kh.exception.controller.B_CheckedException;

public class ExceptionRun {
		
		/*
		 * * 명심할 사항 : 항상 프로그램은 사용자가 종료를 원할 경우에만 종료되야 한다!!
		 *  
		 * * 에러(오류)의 종류
		 * - 시스템 에러 : 컴퓨터의 오작동으로 인해 발생하는 에러
		 * 				소스코드로 절대 해결 불가능
		 * 				즉, 개발자 선에서 해결할 수 없다. (제일 심각한 에러)
		 * - 컴파일 에러 : 소스코드 상의 문법적인 문제로 발생하는 에러
		 * 				소스코드 수정으로 해결 가능
		 * 				애초에 이클립스에서 빨간 밑줄로 알려줌!!
		 * - 런타임 에러 : 소스코드 상으로는 문제가없는데
		 * 				"프로그램 실행 중" 발생하는 에러
		 * 				사용자의 잘못일 수도 있고, 개발자가 예측 가능한 오류 발생의
		 * 				경우를 제대로 처리 안해놓은 것 일수도 있음
		 * - 논리 에러 :  소스코드 상의 문법적인 문제도 없고,
		 * 			    실행했을때에도 굳이 문제가 되지 않지만
		 * 				프로그램 의도상 반대로 작동하는 것
		 * 
		 * 
		 * 
		 * > 시스템 에러를 제외한 컴파일 에러, 런타임 에러, 논리 에러와 같은
		 * 	 비교적 덜 심각한 것들 가지고 "예외(Exception)" 라고 부른다.
		 * > 이러한 "예외" 들이 "발생" 했을 경우에 대비해서
		 *   "처리" 하는 방법을 정의해두는 것 == "예외 처리" 라고 부른다.
		 * > 예외처리를 해야 하는 이유 : 예외 발생 시 프로그램이 비정상적으로 종료되는 것을
		 * 							막기 위해서!!
		 * 				
		 * * 예외 처리 방법
		 * 1. try ~ catch문 이용
		 * 2. throws 키워드 이용
		 * 
		 */
	
	// main 메소드 또한 에외처리를 throws 떠넘길 수 있다.
	// main 메소드는 JVM 이 호출해주기 때문에, JVM이 예외처리를 해줄 것!!
	// > 권장사항은 아님..
	// > 
	public static void main(String[] args)throws IOException {
		A_UnchekedException a = new A_UnchekedException();
		//a.method1();
		//a.method2();
		//a.method3();
		B_CheckedException b = new B_CheckedException();
		/*
		try {
		b.method2();
		}catch(IOException e) {
			System.out.println("예외 발생됨");
		}*/
		
		//b.method1();
		a.method4();
		
	}

}
