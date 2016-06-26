package cn.com.cxsw.dialog;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import cn.com.cxsw.utils.SetDialogLocation;
import org.eclipse.swt.SWT;

/**
 *类说明
 *@author sgs
 *@description概率指标Dialog
 */
public class ProbabilityIndexDialog extends Dialog {

	protected Object result;
	protected Shell shell;
	public ProbabilityIndexDialog(Shell parent, int style) {
		super(parent, style);
		setText("概率指标");
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
		shell.setSize(681, 499);
		shell.setText(getText());
		SetDialogLocation.setDialogLocation(shell);
		SetDialogLocation.setDialogBgImg(ProbabilityIndexDialog.class, shell);
	}

}
