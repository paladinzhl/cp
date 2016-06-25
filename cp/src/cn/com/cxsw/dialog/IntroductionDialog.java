package cn.com.cxsw.dialog;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;

import cn.com.cxsw.utils.SetDialogLocation;
/*
	@author sgs
 *  @description 软件说明
*/
public class IntroductionDialog extends Dialog {

	protected Object result;
	protected Shell shell;

	public IntroductionDialog(Shell parent, int style) {
		super(parent, style);
		setText("软件说明");
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
		shell = new Shell(getParent(), SWT.SHELL_TRIM | SWT.BORDER);
		shell.setSize(669, 478);
		shell.setText(getText());
		SetDialogLocation.setDialogLocation(shell);
		
	}

}
