package cn.com.cxsw.dialog;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;

import cn.com.cxsw.utils.SetDialogLocation;

/**
 *类说明
 *@author sgs
 *@description名词解释Dialog
 */
public class NounExplanationDialog extends Dialog {

	protected Object result;
	protected Shell shell;

	public NounExplanationDialog(Shell parent, int style) {
		super(parent, style);
		setText("名词解释");
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
		shell = new Shell(getParent(), SWT.DIALOG_TRIM | SWT.RESIZE | SWT.APPLICATION_MODAL);
		shell.setSize(753, 513);
		shell.setText(getText());
		SetDialogLocation.setDialogLocation(shell);
		SetDialogLocation.setDialogBgImg(NounExplanationDialog.class, shell);
	}

}
