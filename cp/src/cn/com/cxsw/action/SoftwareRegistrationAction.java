package cn.com.cxsw.action;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;

import cn.com.cxsw.dialog.SoftwareRegistrationDialog;

public class SoftwareRegistrationAction extends Action{
	public void run(){
		SoftwareRegistrationDialog srd=new SoftwareRegistrationDialog(new Shell(),SWT.None);
		srd.open();
	}
}
