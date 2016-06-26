package cn.com.cxsw.utils;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

/**
 *类说明
 *@author sgs
 *@description：设置Dialog的工具类
 */
public class SetDialogLocation {
	//方法一：设置Dialog的位置
	public static void setDialogLocation(Shell shell){
		int height = shell.getMonitor().getClientArea().height;
		int y = shell.getSize().y;
		if (y > height) {
		shell.getSize().y = height;
		}
		shell.setLocation(20, (height - y) / 2);
	}
	//方法二：设置Dialog的背景图片
	public static void setDialogBgImg(Class clazz,Shell shell){
		shell.setBackgroundImage(SWTResourceManager.getImage(clazz, "/cn/com/cxsw/images/bg.png"));
	}

}
