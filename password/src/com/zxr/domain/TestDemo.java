package com.zxr.domain;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author zxr:zhaoxinran_dlmuit@163.com
 * @version ����ʱ�䣺2017��12��21�� ����9:17:38 ��˵�� ���Թ�����
 */
public class TestDemo {
	public static void main(String[] args) {
		char flag = 'y';

		UserService userService = new UserService();

		while (true && flag == 'y') {
			System.out.println("===��ΰ��Ľ���֢����ѽ!^_^��ӭ��������ϵͳ===");
			System.out.println("1 ��");
			System.out.println("2 ɾ");
			System.out.println("3 ��");
			System.out.println("4 ��");
			Scanner scanner = new Scanner(System.in);
			System.out.println("����������Ҫ�Ĳ���");
			int num = scanner.nextInt();
			switch (num) {
				case 1: {
					System.out.println("�����û�:");
					
					
				
					User user = new User("acbs", "https://www.csdn.net/", "firefoxsun", "zhaoxinran_dlmuit@163.com",
							"1998111522222", "18098847785", "123456");
					userService.regist(user);
					break;
				}
				case 2:{
					System.out.println("ɾ���û�:");
					User user = new User("ac", "https://www.csdn.net/", "firefoxsun", "zhaoxinran_dlmuit@163.com",
							"1998111522222", "18098847785",  "123456");
					userService.delete(user);
					break;
				}
				case 3:{
					System.out.println("�����û�:");
					String website = "aoo";
					System.out.println(userService.query(website));
					break;
				}
				case 4:{
					System.out.println("�����û�:");
					User user = new User("aooo", "https://www.ac.net/", "firefoxsun", "zhaoxinran_dlmuit@163.com",
							"1998111SDFD522222", "1807785",  "123456");
					userService.update(user);
					break;
				}
			
			}
			scanner.close();
		}

	}
	public static String tranDate(){
		SimpleDateFormat sdf = new SimpleDateFormat();
		String date = sdf.format(new Date());
		System.out.println(date);
		return date;
	}
}