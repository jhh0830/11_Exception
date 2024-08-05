package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

// Unchecked Exception �� �ٷ�� ���
public class A_UnchekedException {
	
	/*
	 * * ������ �ΰ��� �з�
	 * - Unchecked Exception
	 * ����� "���� ������ ��Ȳ" �� ���� �������� �ǹ���
	 * (RuntimeException Ŭ������ �ڽ�Ŭ������)
	 * 
	 * - Checked Exception 
	 * "���� �Ұ����� ��Ȳ" �� ���� �������� �ǹ���
	 * 
	 * 
	 * * UncheckedException ������
	 * (��, RuntimeException Ŭ������ �ڽ�Ŭ������)
	 * - ArrayIndexOutOfBoundsException
	 * : �迭�� �������� �ε����� ������ �� �߻��ϴ� ����
	 * - NegativArraySizeException
	 * : �迭�� ũ�⸦ ������ ������ ��� �߻��ϴ� ����
	 * - ClassCastException
	 * : ����� �� ���� ����ȯ�� ����� ��� �߻��ϴ� ����
	 * - NullPointerException
	 * : ���������� ���� null �ӿ��� �ұ��ϰ� �����Ϸ��� �� �� �߻��ϴ� ����
	 * - ArithmeticException
	 * : ������ ���� �� 0 ���� ���� �� �߻��ϴ� ����
	 * - ...
	 * 
	 * > �̷��� RuntimeException �� ���õ� ���ܵ���
	 * 	 ������ ���忡�� ����� "���� ����" �� ��Ȳ�̱� ������
	 * 	 ���� ����ó�� ������ ���� �ʰ� ���ǹ��� �̿��ؼ� ����� ������ �� �ִ�.
	 *  - ���ǹ� ��� : ���ʿ� ���ܰ� �߻����� �ʵ��� "����" �� �ǹ� (����)
	 *  - ����ó�� ���� ��� : ���� �߻� �� "����" �� �ǹ�
	 */
	// Scanner ��ü�� "���� ����" �� ����
	
	private Scanner sc= new Scanner(System.in);
	
	
	public void method1() {
		
		// ArithmeticException
		// > ������ ���� �� 0���� ���� �� �߻��ϴ� ����
		
		// ����ڿ��� �ΰ��� �������� �Է¹޾� ������ ���� ��� ���
		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�ι�° ���� (0 ����): ");
		int num2 = sc.nextInt();
		//System.out.println("������ ���� ��� : " + (num1 / num2));
		// > ����ڰ� num2�� 0 �� �Է��� ��� ���� �߻� �� ������ ����
		
		// �ذ���1)
		// ���ǹ��� �̿��ؼ� ó�� ����
		// ���ʿ� ���� ��ü�� �߻����� �ʰԲ� if������ ���ǰ˻� �Ŀ�
		// ������ ���� ���� (����ó�� ������ ��� X)
		
		/*
		if(num2 != 0) {
			System.out.println("������ ���� ��� : " + (num1/num2));
		}else {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
		*/
		// �ذ���2)
		// ����� ����ó�� ������ ����ϴ� ���
		// (���ܰ� �߻����� ��츦 ����ؼ� ������ ������ �����صδ� ��)
		
		/*
		 * * try ~ catch��
		 * [ ǥ���� ]
		 * try{
		 * 		���ܰ� �߻��ɹ��� ����;
		 *  } catch(�߻��ɿ���Ŭ������ ������){
		 *  	�ش� ���ܰ� �߻����� �� ������ ����;
		 * }
		 * 
		 */
		
		try {
			System.out.println("������ ���� ��� : +" + (num1/num2));
		}catch(ArithmeticException e){
			System.out.println("0���� ���� �� �����ϴ�.");
			// e.printStackTrace();
			// > ������ ��� ��� ������ �����ϴ� ����
			//   ���� ���ܰ� �߻��� ������ �� �� �ִ�.
			
		}
		System.out.println("���α׷� ����");
		
		
	}
	public void method2() {
		
		// method1 ����
		
		System.out.print("���� �Է� (0 ����) : ");
		// ���� ó�� �������� �ذ�
		try {
			int num = sc.nextInt();
			// > ���� �̿��� ���� �Է��ϸ� InputMismatchException �߻�
			
			sc.nextLine();
			
			System.out.println("������ ���� ��� : "+ (10 / num));
			// > 0 �� �Է��ϸ� ArithmeticException �߻�
		}catch(InputMismatchException e){
			System.out.println("������ ����� �Է��ؾ��մϴ�.");
		} catch(ArithmeticException e) {
			System.out.println("0 ���� ���� �� �����ϴ�.");
		}
		// > ���ܰ� ������ �߻��� ���ɼ��� ���� ���
		//   catch ���� �������� ������ �ۼ� �����ϴ�.
		// (���� catch ��)
		
		
		
		System.out.println("���α׷� ����");
		
	}
	public void method3() {
		
		// ArrayInedxOutOfBoundsException
		// > �迭�� �������� �ε����� ������ �� �߻��ϴ� ����
		
		// NegativeArraySizeException
		// > �迭�� ũ�⸦ ������ ������ ��� �߻��ϴ� ����
		
		System.out.print("�迭�� ũ�� : ");
		
		
		int size = sc.nextInt();
		sc.nextLine();
		/*
		int[] arr= new int[size];
		// > ������ ������ �Է������� NegativeArraySizeException �߻�
		
		System.out.println("100�� �ε����� �� : " + arr[100]);
		// > ������ 101 ���� �۰� �������� �� 
		// ArrayInedxOutOfBoundsException �߻�
		*/
		
		/*
		if(size > 0) {
			int[] arr = new int[size];
			
			if(size >= 101) {
				System.out.println("100�� �ε����� �� : " + arr[100]);
				
			}else {
				System.out.println("�������� �ε����� ������ �� �����ϴ�.");
			}
			
		}else {
			System.out.println("�迭�� ũ��δ� ������ ������ �� �����ϴ�.");
		}
		*/
		/*
		try {
			
			int[] arr = new int[size];
			System.out.println("100�� �ε����� �� : " +arr[100]);
			
		}catch(NegativeArraySizeException e){
			System.out.println("�迭�� ũ��δ� ������ ������ �� �����ϴ�.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�������� �ε����� ������ �� �����ϴ�.");
		}
		*/
		// > ó���ؾ��ϴ� catch ���� ������ �þ�ٸ�?
		/*
		try {
			int[] arr = new int[size];
			System.out.println("100�� �ε��� �� : " + arr[100]);
		}catch(RuntimeException e) {
			System.out.println("���ܰ� �߻��ϱ� ����");
		}
		*/
		// > ���� catch ���� ���
		// �θ� Ÿ���� ���� Ŭ���� catch ���ϳ�������
		// �پ��� �ڽ� Ÿ���� ���ܸ� �޾� ���� �� �ִ�. (������ ����)
		// > ��Ȯ�ϰ� � ���ܰ� �߻��ߴ����� �� �� ����!!
		
		try {
			int[] arr = new int[size];
			System.out.println("100�� �ε��� �� : " + arr[100]);
			
		
			
		} catch(NegativeArraySizeException e){
			System.out.println("�迭�� ũ��δ� ������ ������ �� �����ϴ�.");
		}catch(RuntimeException e){
			System.out.println("���ܰ� �߻��ϱ� ����... ������ ��?��");
		}
		
		// > ���� catch �� �������� Ȱ�� �� catch ���� �ۼ� ������ �߿���!!
		//   ������ ���� �ڽ�Ÿ���� ���� Ŭ�������� ���� ����ؾ� �Ѵ�.
		// (Unreachable Catch block)
		
		System.out.println("���α׷� ����");
		
		
		
	}
	
	/*
	 * * RuntimeException ���õ� ���ܴ�
	 * - ����� ���ǹ����� �ذ� ����
	 * : ���� ��ü�� �߻� �ȵǰԲ� "����" �ϴ� ����
	 *   �����ڰ� ���� ���ǹ� ������ ���ؼ� �ڵ鸵 �����ϴ�. (���� ó�� ���� x)
	 * - ���� ó�� �������ε� �ذ� ����
	 *  : ���ܰ� �߻����� ���� ����ؼ� �� �� ������ ������ ������ �δ� 
	 *    "����" �ϴ� ����
	 *    
	 * ������ ������ ��Ȳ : Unchecked Exception
	 * > ���ǹ����� �ذ��ϴ°� �� �����Ѵ�.   
	 *  
	 * ������ �Ұ����� ��Ȳ : checked Exception
	 * > ���� ó�� ������ �� �� �ۿ� ����!!
	 * 
	 * * RuntimeException �迭�� ����� ���� ������ ��Ȳ�̱� ������
	 * 	 ���ǹ����� �ذ��ϴ� ���� ������. �ʼ��� �ƴ�!!
	 * 
	 */
	public void method4() {
		System.out.println("���ڷ� ��ȯ�� ���ڿ� (���� ����) : ");
		String str = sc.nextLine();
		
		// ��Ʈ)
		// int num = Integer.parseInt("123"); // ��
		// int nmu = Integer.parseInt("1abc.1"); // �ȵ�
		// > NumberFormatException �߻�
		
		// �� ���� �����ؼ� �ش�
		// ������ ��ȯ�� �� �ִ��� �˻��ϴ� ���α׷�
		
		
		// ���� ���)
		// ���ڷ� ��ȯ�� ���ڿ� (���� ����) : 123
		// ��ȯ�� �� �ֽ��ϴ�.
		// ��� : 123
		// ���ڷ� ��ȯ�� ���ڿ� (���� ����) : 1abc.1
		// ��ȯ�� �� �����ϴ�.
		
		// ���α׷� ����
	
		try {
			 // �Է¹��� ���� �����κ�ȯ�Ϸ��� (�Ľ��Ϸ���) �õ� - try
			int num = Integer.parseInt(str); 
			System.out.println("��ȯ�� �� �ֽ��ϴ�.");
			System.out.println("��� : "+num);
		}catch(NumberFormatException e) {
			System.out.println("��ȯ�� �� �����ϴ�.");
		}
	
		
		System.out.println("���α׷� ����");
	}
		
		
	
	
}
