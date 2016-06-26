package cn.com.cxsw.action;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;

import cn.com.cxsw.dialog.NounExplanationDialog;

/**
 * @author zhl
 * @description √˚¥ Ω‚ Õ
 */
public class DefinitionsAction extends Action {
	public void run() {
		NounExplanationDialog ned=new NounExplanationDialog(new Shell(),SWT.None);
		ned.open();
	}
}
