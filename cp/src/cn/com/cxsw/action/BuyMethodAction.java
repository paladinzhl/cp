package cn.com.cxsw.action;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;

import cn.com.cxsw.dialog.BuyMethodDialog;

public class BuyMethodAction extends Action {
	public void run() {
		BuyMethodDialog bmd=new BuyMethodDialog(new Shell(),SWT.None);
		bmd.open();
	}
}
