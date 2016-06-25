package cn.com.cxsw.dialog;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import cn.com.cxsw.utils.SetDialogLocation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

/**
 *��˵��
 *@author sgs
 *@description��ϵͳ�ص�
 */
public class SystemCharacteristicDialog extends Dialog {

	protected Object result;
	protected Shell shell;

	public SystemCharacteristicDialog(Shell parent, int style) {
		super(parent, style);
		setText("ϵͳ�ص�");
	}

	public Object open() {
		createContents();
		shell.open();
		shell.layout();
		Display display = getParent().getDisplay();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
	}

	private void createContents() {
		shell = new Shell(getParent(), SWT.NONE);
		shell.setSize(547, 460);
		shell.setText(getText());
		SetDialogLocation.setDialogLocation(shell);
		SetDialogLocation.setDialogBgImg(SystemCharacteristicDialog.class, shell);
		
	
		
		
	}
}
