package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

// Unchecked Exception 을 다루는 방법
public class A_UnchekedException {
	
	/*
	 * * 예외의 두가지 분류
	 * - Unchecked Exception
	 * 충분히 "예측 가능한 상황" 에 대한 오류들을 의미함
	 * (RuntimeException 클래스의 자식클래스들)
	 * 
	 * - Checked Exception 
	 * "예측 불가능한 상황" 에 대한 오류들을 의미함
	 * 
	 * 
	 * * UncheckedException 종류들
	 * (즉, RuntimeException 클래스의 자식클래스들)
	 * - ArrayIndexOutOfBoundsException
	 * : 배열의 부적절한 인덱스로 접근할 때 발생하는 예외
	 * - NegativArraySizeException
	 * : 배열의 크기를 음수로 지정할 경우 발생하는 에외
	 * - ClassCastException
	 * : 허용할 수 없는 형변환이 진행될 경우 발생하는 예외
	 * - NullPointerException
	 * : 참조변수가 아직 null 임에도 불구하고 접근하려고 할 때 발생하는 예외
	 * - ArithmeticException
	 * : 나누기 연산 시 0 으로 나눌 때 발생하는 예외
	 * - ...
	 * 
	 * > 이러한 RuntimeException 과 관련된 예외들은
	 * 	 개발자 입장에서 충분히 "예측 가능" 한 상황이기 때문에
	 * 	 굳이 예외처리 구문을 쓰지 않고 조건문을 이용해서 충분히 방지할 수 있다.
	 *  - 조건문 사용 : 애초에 예외가 발생하지 않도록 "예방" 의 의미 (권장)
	 *  - 예외처리 구문 사용 : 예외 발생 후 "수습" 의 의미
	 */
	// Scanner 객체를 "전역 변수" 로 생성
	
	private Scanner sc= new Scanner(System.in);
	
	
	public void method1() {
		
		// ArithmeticException
		// > 나누기 연산 시 0으로 나눌 때 발생하는 예외
		
		// 사용자에게 두개의 정수값을 입력받아 나눗셈 연산 결과 출력
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두번째 정수 (0 제외): ");
		int num2 = sc.nextInt();
		//System.out.println("나눗셈 연산 결과 : " + (num1 / num2));
		// > 사용자가 num2에 0 을 입력한 경우 예외 발생 후 비정상 종료
		
		// 해결방법1)
		// 조건문을 이용해서 처리 가능
		// 애초에 예외 자체가 발생하지 않게끔 if문으로 조건검사 후에
		// 나눗셈 연산 진행 (예외처리 구문을 사용 X)
		
		/*
		if(num2 != 0) {
			System.out.println("나눗셈 연산 결과 : " + (num1/num2));
		}else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		*/
		// 해결방법2)
		// 대놓고 예외처리 구문을 사용하는 방법
		// (예외가 발생했을 경우를 대비해서 실행할 내용을 정의해두는 것)
		
		/*
		 * * try ~ catch문
		 * [ 표현법 ]
		 * try{
		 * 		예외가 발생될법한 구문;
		 *  } catch(발생될예외클래스명 변수명){
		 *  	해당 예외가 발생했을 때 실행할 구문;
		 * }
		 * 
		 */
		
		try {
			System.out.println("나눗셈 연산 결과 : +" + (num1/num2));
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다.");
			// e.printStackTrace();
			// > 오류가 어디서 어떻게 났는지 추적하는 구문
			//   현재 예외가 발생한 정보를 볼 수 있다.
			
		}
		System.out.println("프로그램 종료");
		
		
	}
	public void method2() {
		
		// method1 보완
		
		System.out.print("정수 입력 (0 제외) : ");
		// 예외 처리 구문으로 해결
		try {
			int num = sc.nextInt();
			// > 정수 이외의 값을 입력하면 InputMismatchException 발생
			
			sc.nextLine();
			
			System.out.println("나눗셈 연산 결과 : "+ (10 / num));
			// > 0 을 입력하면 ArithmeticException 발생
		}catch(InputMismatchException e){
			System.out.println("정수로 제대로 입력해야합니다.");
		} catch(ArithmeticException e) {
			System.out.println("0 으로 나눌 수 없습니다.");
		}
		// > 예외가 여러개 발생할 가능성이 있을 경우
		//   catch 블럭을 종류별로 여러개 작성 가능하다.
		// (다중 catch 블럭)
		
		
		
		System.out.println("프로그램 종료");
		
	}
	public void method3() {
		
		// ArrayInedxOutOfBoundsException
		// > 배열의 부적절한 인덱스로 접근할 때 발생하는 예외
		
		// NegativeArraySizeException
		// > 배열의 크기를 음수로 지정할 경우 발생하는 예외
		
		System.out.print("배열의 크기 : ");
		
		
		int size = sc.nextInt();
		sc.nextLine();
		/*
		int[] arr= new int[size];
		// > 정수를 음수로 입력했을때 NegativeArraySizeException 발생
		
		System.out.println("100번 인덱스의 값 : " + arr[100]);
		// > 정수를 101 보다 작게 제시했을 때 
		// ArrayInedxOutOfBoundsException 발생
		*/
		
		/*
		if(size > 0) {
			int[] arr = new int[size];
			
			if(size >= 101) {
				System.out.println("100번 인덱스의 값 : " + arr[100]);
				
			}else {
				System.out.println("부적절한 인덱스로 접근할 수 없습니다.");
			}
			
		}else {
			System.out.println("배열의 크기로는 음수를 제시할 수 없습니다.");
		}
		*/
		/*
		try {
			
			int[] arr = new int[size];
			System.out.println("100번 인덱스의 값 : " +arr[100]);
			
		}catch(NegativeArraySizeException e){
			System.out.println("배열의 크기로는 음수를 제시할 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스로 접근할 수 없습니다.");
		}
		*/
		// > 처리해야하는 catch 블럭의 갯수가 늘어난다면?
		/*
		try {
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		}catch(RuntimeException e) {
			System.out.println("예외가 발생하긴 했음");
		}
		*/
		// > 다중 catch 블럭의 경우
		// 부모 타입의 예외 클래스 catch 블럭하나만으로
		// 다양한 자식 타입의 예외를 받아 쳐줄 수 있다. (다형성 적용)
		// > 정확하게 어떤 예외가 발생했는지는 알 수 없다!!
		
		try {
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
			
		
			
		} catch(NegativeArraySizeException e){
			System.out.println("배열의 크기로는 음수를 제시할 수 없습니다.");
		}catch(RuntimeException e){
			System.out.println("예외가 발생하긴 했음... 원인은 ㅁ?ㄹ");
		}
		
		// > 다중 catch 및 다형성을 활용 시 catch 블럭의 작성 순서가 중요함!!
		//   범위가 작은 자식타입의 예외 클래스부터 먼저 기술해야 한다.
		// (Unreachable Catch block)
		
		System.out.println("프로그램 종료");
		
		
		
	}
	
	/*
	 * * RuntimeException 관련된 예외는
	 * - 충분히 조건문으로 해결 가능
	 * : 예외 자체가 발생 안되게끔 "예방" 하는 개념
	 *   개발자가 직접 조건문 구문을 통해서 핸들링 가능하다. (예외 처리 구문 x)
	 * - 예외 처리 구문으로도 해결 가능
	 *  : 예외가 발생했을 때를 대비해서 그 때 실행할 내용을 정의해 두는 
	 *    "수습" 하는 개념
	 *    
	 * 예측이 가능한 상황 : Unchecked Exception
	 * > 조건문으로 해결하는걸 더 권장한다.   
	 *  
	 * 예측이 불가능한 상황 : checked Exception
	 * > 예외 처리 구문을 쓸 수 밖에 없음!!
	 * 
	 * * RuntimeException 계열은 충분히 예측 가능한 상황이기 때문에
	 * 	 조건문으로 해결하는 것을 권장함. 필수는 아님!!
	 * 
	 */
	public void method4() {
		System.out.println("숫자로 변환할 문자열 (정수 형식) : ");
		String str = sc.nextLine();
		
		// 힌트)
		// int num = Integer.parseInt("123"); // 됨
		// int nmu = Integer.parseInt("1abc.1"); // 안됨
		// > NumberFormatException 발생
		
		// 이 점을 참고해서 해당
		// 정수로 변환할 수 있는지 검사하는 프로그램
		
		
		// 실행 결과)
		// 숫자로 변환할 문자열 (정수 형식) : 123
		// 변환할 수 있습니다.
		// 결과 : 123
		// 숫자로 변환할 문자열 (정수 형식) : 1abc.1
		// 변환할 수 없습니다.
		
		// 프로그램 종료
	
		try {
			 // 입력받은 값을 정수로변환하려는 (파싱하려는) 시도 - try
			int num = Integer.parseInt(str); 
			System.out.println("변환할 수 있습니다.");
			System.out.println("결과 : "+num);
		}catch(NumberFormatException e) {
			System.out.println("변환할 수 없습니다.");
		}
	
		
		System.out.println("프로그램 종료");
	}
		
		
	
	
}
