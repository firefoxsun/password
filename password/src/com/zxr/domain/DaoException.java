package com.zxr.domain;

/**
 * @author zxr:zhaoxinran_dlmuit@163.com
 * @version ����ʱ�䣺2017��12��21�� ����9:16:04 
 * ��˵�� �Զ����쳣��
 */
public class DaoException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DaoException() {

	}

	public DaoException(Exception e) {
		super(e);
	}

	public DaoException(String msg) {
		super(msg);
	}

	public DaoException(String msg, Exception e) {
		super(msg, e);
	}
}
