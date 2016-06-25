package cn.com.cxsw.action;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;

import cn.com.cxsw.dialog.SystemCharacteristicDialog;

/**
 * @author zhl
 * @description 系统特点
 */
public class SystemCharacteristicAction extends Action {
	public void run(){
		SystemCharacteristicDialog scd=new SystemCharacteristicDialog(new Shell(), SWT.None);
		scd.open();
	}
}
