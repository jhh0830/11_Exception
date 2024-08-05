package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Checked Exception �� �ٷ�� ���
public class B_CheckedException {
	
	/*
	 * * Checked Exception �� �ݵ�� ����ó���� ����� �ϴ� ���ܵ� 
	 * (����ó�� ������ ������ ����ϴ� ���ܵ�)
	 * ��, ���� �Ұ��� ������ �߻��ϱ� ������ �̸� ���� ó�� ������ �ۼ��ؾ� ��!!
	 * > �ַ� "�ܺ� ��ü" �� � ����� �� �߻�
	 */
	public void method1() throws IOException{
		/*
		try {
			method2();
		}catch(IOException e) {
			System.out.println("���� �߻���");
		}
		System.out.println("���α׷� ����");
		*/
		method2();
		
	}
	
	
	
	public void method2() throws IOException{
		
		// Checked Exception �� �߻��ҹ��� ����
		
		// Ű����� ���� �Է¹��� �� �ִ� ��ü - Scanner ��ü
		// Scanner sc = new Scanner(System.in);
		
		// Scanner �� ���� Ű����� ���� �Է¹޸� �� �ִ� ��ü
		// ��, ���ڿ��θ� �Է� ����
		BufferedReader br 
		= new BufferedReader( new InputStreamReader(System.in));
		
		System.out.print("�ƹ� ���ڿ��� �Է����ּ��� : ");
		//String str = br.readLine();
		// > �� �޼ҵ带 ȣ�� �� IOException�� �߻��� �� ������
		// ������ ������ �˷��� (���� ����)
		
		//1. try ~ catch �� �̿�
		/*
		try {
			String str = br.readLine();
			System.out.println("���ڿ��� ���� : " + str.length());
		}catch(IOException e) {
			System.out.println("���� �߻���");
			// > ���� ���ܰ� �߻����� ��
			// 	 �׷��� ���� ó�� ������ �ʼ���!!
		}*/
		
		// 2. throws Ű���� �̿�
		/*
		 * * throws Ű����
		 * ���� ���⼭ ���ܸ� ó������ �ʰ�
		 * �ٸ���ļ� ����ó���� �ϵ��� ���ѱ�ڴ� ��� �� (�����Ѵ�)
		 * 
		 * > method2 ���� try ~ catch���� �̿��Ͽ� ����ó���� ���� �ʰڴ�.
		 *   ���� ȣ���ߴ� ������ try ~ catch���� �̿��ؼ� ����ó���� �ϵ���
		 *   ���ѱ�ڴ�.
		 * * ���� ó�� �� �ظ��ؼ��� �ش� ��������
		 * ��ٷ� try ~ catch���� �̿��ؼ� ���ڸ����� ����ó���� �ϰ� �Ѿ��!!
		 * * Unchecked �迭�� throws �� ���ѱ� �� �ִ�!!
		 * 
		 *  * Checked �迭�� �޼ҵ� ���Ǻο� throws �� �̹� ���ѱ�� �ִ�.
		 *  > �׷��� ������ ������ ��� ����ó�� �϶�� �����ߴ� ��!!
		 * 
		 */
		String str = br.readLine();
		System.out.println("���ڿ��� ���� : "+ str.length());
		
		
		//System.out.println("���α׷� ����");
	}
		
	
}
