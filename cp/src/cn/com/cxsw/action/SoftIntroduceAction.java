package cn.com.cxsw.action;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;

import cn.com.cxsw.dialog.IntroductionDialog;

/**
 * @author zhl
 * @description ศํผþหตร๗
 */
public class SoftIntroduceAction extends Action{
	
	public void run(){
		IntroductionDialog idd=new IntroductionDialog(new Shell(), SWT.None);
		idd.open();
	}
}
