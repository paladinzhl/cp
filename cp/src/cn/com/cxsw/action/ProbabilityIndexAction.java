package cn.com.cxsw.action;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;

import cn.com.cxsw.dialog.ProbabilityIndexDialog;

/**
 * @author zhl
 * @description 系统特点
 */
public class ProbabilityIndexAction extends Action{
	public void run() {
		ProbabilityIndexDialog pid=new ProbabilityIndexDialog(new Shell(),SWT.None);
		pid.open();
	}
}
