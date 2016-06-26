package cn.com.cxsw.utils;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

/**
 *��˵��
 *@author sgs
 *@description������Dialog�Ĺ�����
 */
public class SetDialogLocation {
	//����һ������Dialog��λ��
	public static void setDialogLocation(Shell shell){
		int height = shell.getMonitor().getClientArea().height;
		int y = shell.getSize().y;
		if (y > height) {
		shell.getSize().y = height;
		}
		shell.setLocation(20, (height - y) / 2);
	}
	//������������Dialog�ı���ͼƬ
	public static void setDialogBgImg(Class clazz,Shell shell){
		shell.setBackgroundImage(SWTResourceManager.getImage(clazz, "/cn/com/cxsw/images/bg.png"));
	}

}
