package cn.com.cxsw.utils;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

/**
 *类说明
 *@author sgs
 *@description：设置Dialog的位置工具类型
 */
public class SetDialogLocation {
	public static void setDialogLocation(Shell shell){
		int width = shell.getMonitor().getClientArea().width;
		int height = shell.getMonitor().getClientArea().height;
		int x = shell.getSize().x;
		int y = shell.getSize().y;
		if (x > width) {
		shell.getSize().x = width;
		}
		if (y > height) {
		shell.getSize().y = height;
		}
		shell.setLocation((width - x) / 2, (height - y) / 2);
	}
	
	public static void setDialogBgImg(Class clazz,Shell shell){
		shell.setBackgroundImage(SWTResourceManager.getImage(clazz, "/cn/com/cxsw/images/bg.png"));
	}

}
