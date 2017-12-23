package com.zxr.domain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author zxr:zhaoxinran_dlmuit@163.com
 * @version ����ʱ�䣺2017��12��21�� ����8:48:04 
 * ��˵�� ����ģʽ����ʵ����UserDao����
 */
public class DaoFactory {
	// ����ģʽ
	private static UserDao userDao = null; //ʵ�������ָ��ӿ�����
	private static DaoFactory instance = new DaoFactory();

	private DaoFactory() {
		// ͨ�������ļ���̬���� Dao����
		Properties prop = new Properties();
		
			try {
				FileInputStream fis = new FileInputStream("F:/Project/java_password/password/src/com/zxr/domain/daoconfig.properties");
				prop.load(fis);
				String className = prop.getProperty("userDaolmpl");
				Class<?> clazz = Class.forName(className);
				userDao = (UserDao) clazz.newInstance();//���Դ�����Ӧ������ʱ��Ķ���
				fis.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				System.out.println("DaoFactory:ClassNotFoundException");
			} catch (InstantiationException e) {
				System.out.println("DaoFactory:InstantiationException");
			} catch (IllegalAccessException e) {
				System.out.println("DaoFactory:IllegalAccessException");
			} catch (IOException e) {
				System.out.println("DaoFactory:IOException");
			}
		
	}
	//���ʵ��
	public static DaoFactory getInstance(){
		return instance;
	}
	//���ʵ��
	public static UserDao createUserDao(){
		return userDao;
	}
}