package cn.com.cxsw.core;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.wb.swt.SWTResourceManager;

import cn.com.cxsw.view.IndexView;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

	public ApplicationWorkbenchWindowAdvisor(
			IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	public ActionBarAdvisor createActionBarAdvisor(
			IActionBarConfigurer configurer) {
		return new ApplicationActionBarAdvisor(configurer);
	}

	public void preWindowOpen() {
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		configurer.setShellStyle(SWT.NO_TRIM | SWT.CENTER | SWT.NO_BACKGROUND);
		configurer.setInitialSize(new Point(400, 300));
		configurer.setShowCoolBar(true);
		configurer.setShowStatusLine(false);
		configurer.setTitle("彩分析11"); //$NON-NLS-1$

	}

	public void postWindowCreate() {
		getWindowConfigurer().getWindow().getShell().setMaximized(true);
	}

	public void postWindowOpen() {
		setToorbarBG();

	}

	public void setToorbarBG() {
		Object[] childrens = getWindowConfigurer().getWindow().getShell()
				.getChildren();
		for (int i = 0; i < childrens.length; i++) {
			String clazz = childrens[i].getClass().getName();
			// 获取 RCP 框架默认生成的工具条对象
			// 为工具栏设置图片
			((Composite) childrens[i]).setBackground(new Color(Display.getDefault(), 255, 255, 255));;
			((Composite) childrens[i]).setBackgroundMode(SWT.INHERIT_FORCE);
			System.out.println(((Composite) childrens[i]).getBorderWidth());
		}
	}

}
