package cn.com.cxsw.dialog;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;

import cn.com.cxsw.utils.SetDialogLocation;
import org.eclipse.swt.widgets.Label;

/**
 *类说明
 *@author sgs
 *@description投注方法
 *
 *
 *
 */
public class BuyMethodDialog extends Dialog {

	protected Object result;
	protected Shell shell;

	public BuyMethodDialog(Shell parent, int style) {
		super(parent, style);
		setText("投注方法");
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
		shell.setSize(683, 494);
		shell.setText(getText());
		SetDialogLocation.setDialogLocation(shell);
		SetDialogLocation.setDialogBgImg(BuyMethodDialog.class, shell);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(122, 122, 61, 17);
		lblNewLabel.setText("New Label");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(388, 212, 61, 17);
		lblNewLabel_1.setText("New Label");
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(208, 315, 61, 17);
		lblNewLabel_2.setText("New Label");
	}

}
