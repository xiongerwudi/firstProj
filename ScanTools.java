package ɨ����;

import java.util.Scanner;

/*
 * ɨ�����̨����Ĺ�����
 */
public class ScanTools {
	public static Scanner input = new Scanner(System.in);
	/**
	 * ����������ֵķ���
	 * @param msg������֮ǰ����ʾ���
	 * @param start����ʼֵ����Сֵ��
	 * @param end������ֵ�����ֵ��
	 * @return��ɨ�赽�ķ���Ҫ�������
	 */
	public static int getInt(String msg,int start,int end){
		while(true){
			System.out.print(msg);
			if(input.hasNextInt()){
				int num = input.nextInt();
				if(num>=start && num<=end){
					return num;
				}else{
					System.out.println("�������"+start+"��"+end+"֮������֣�");
				}
			}else{
				System.out.println("�������������֣�");
				input.next();
			}
		}
	}
	
	
	public static String getString(String msg){
		System.out.print(msg);
		return input.next();
	}
	
	
	
	
}








