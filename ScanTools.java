package 扫描器;

import java.util.Scanner;

/*
 * 扫描控制台输入的工具类
 */
public class ScanTools {
	public static Scanner input = new Scanner(System.in);
	/**
	 * 获得整形数字的方法
	 * @param msg：输入之前的提示语句
	 * @param start：起始值（最小值）
	 * @param end：结束值（最大值）
	 * @return：扫描到的符合要求的数字
	 */
	public static int getInt(String msg,int start,int end){
		while(true){
			System.out.print(msg);
			if(input.hasNextInt()){
				int num = input.nextInt();
				if(num>=start && num<=end){
					return num;
				}else{
					System.out.println("请输入从"+start+"到"+end+"之间的数字！");
				}
			}else{
				System.out.println("请输入整形数字！");
				input.next();
			}
		}
	}
	
	
	public static String getString(String msg){
		System.out.print(msg);
		return input.next();
	}
	
	
	
	
}








