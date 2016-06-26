package cn.com.cxsw.dialog;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;

import cn.com.cxsw.utils.SetDialogLocation;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
/*
	@author sgs
 *  @description 软件说明
*/
public class IntroductionDialog extends Dialog {

	protected Object result;
	protected Shell shell;
	private Text text;
	private Text txtac;
	private Text text_1;
	private Text text_2;
	private Text text_3;

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
		shell = new Shell(getParent(), SWT.DIALOG_TRIM | SWT.RESIZE | SWT.APPLICATION_MODAL);
		shell.setSize(905, 593);
		shell.setText(getText());
		SetDialogLocation.setDialogLocation(shell);
		SetDialogLocation.setDialogBgImg(NounExplanationDialog.class, shell);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		lblNewLabel.setText("\u8BE5\u8F6F\u4EF6\u4E3B\u754C\u9762\u5171\u7531\u4E94\u4E2A\u90E8\u5206\u7EC4\u6210\uFF0C\u5206\u522B\u662F\u8F6F\u4EF6\u8BF4\u660E\u533A\u3001\u6570\u636E\u5206\u6790\u533A\u3001\u65B9\u6848\u8BBE\u7F6E\u533A\u3001\u5386\u53F2\u9057\u6F0F\u68C0\u6D4B\u533A\u3001\u53F7\u7801\u663E\u793A\u533A\u3002");
		lblNewLabel.setBounds(10, 10, 867, 32);
		
		Group group = new Group(shell, SWT.NONE);
		group.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.NORMAL));
		group.setText("\u8F6F\u4EF6\u8BF4\u660E\u533A\uFF1A");
		group.setBounds(10, 48, 867, 109);
		
		text = new Text(group, SWT.READ_ONLY | SWT.WRAP);
		text.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 10, SWT.NORMAL));
		text.setText("\u4E3B\u8981\u7531\u540D\u8BCD\u89E3\u91CA\u3001\u7CFB\u7EDF\u7279\u70B9\u3001\u6982\u7387\u6307\u6807\u3001\u6295\u6CE8\u65B9\u6CD5\u3001\u8F6F\u4EF6\u6CE8\u518C\u7B49\u90E8\u5206\u7EC4\u6210\u3002\u540D\u8BCD\u89E3\u91CA\u4E3B\u8981\u5BF9\u5947\u5076\u3001\u8D28\u5408\u7B49\u540D\u8BCD\u7ED9\u4E88\u51C6\u786E\u5B9A\u4E49\u3002\u7CFB\u7EDF\u7279\u70B9\u5BF9\u8BE5\u8F6F\u4EF6\u7684\u7279\u70B9\u8FDB\u884C\u5206\u6790\u5F52\u7EB3\u3002\u6295\u6CE8\u65B9\u6CD5\u662F\u5BF9\u5404\u7C7B\u6295\u6CE8\u7684\u5177\u4F53\u65B9\u6CD5\u4F5C\u8BF4\u660E\u3002\u6982\u7387\u6307\u6807\u4E3B\u8981\u5BF9\u4E94\u661F\u3001\u56DB\u661F\u3001\u4E09\u661F\u7684\u8D70\u52BF\u3001\u5F62\u6001\u7684\u6982\u7387\u8FDB\u884C\u8BF4\u660E\u3002\u6982\u7387\u76F4\u63A5\u51B3\u5B9A\u201C\u4E0B\u671F\u54EA\u4E9B\u53F7\u7801\u51FA\u73B0\u7684\u6982\u7387\u8F83\u4F4E\uFF0C\u54EA\u4E9B\u53F7\u7801\u51FA\u73B0\u7684\u6982\u7387\u8F83\u9AD8\u201D\uFF0C\u662F\u65B9\u6848\u4F18\u5316\u8BBE\u7F6E\u7684\u6700\u91CD\u8981\u7684\u6307\u6807\u4E4B\u4E00\u3002\u8F6F\u4EF6\u6CE8\u518C\u4E3B\u8981\u662F\u5BF9\u8F6F\u4EF6\u7684\u5E94\u7528\u4F5C\u7B80\u8981\u8BF4\u660E\u3002");
		text.setBounds(10, 25, 847, 74);
		
		Group group_1 = new Group(shell, SWT.NONE);
		group_1.setText("\u6570\u636E\u5206\u6790\u533A\uFF1A");
		group_1.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.NORMAL));
		group_1.setBounds(10, 163, 867, 109);
		
		txtac = new Text(group_1, SWT.READ_ONLY | SWT.WRAP);
		txtac.setText("\u4E3B\u8981\u5BF9\u5947\u5076\u3001\u8D28\u5408\u3001\u5927\u5C0F\u7B4924\u4E2A\u6307\u6807\u53C2\u6570\u8FDB\u884C\u5206\u6790\u3002\u5176\u4E2D\u76F4\u63A5\u6D89\u53CA\u6295\u6CE8\u65B9\u6848\u8BBE\u7F6E\u7684\u53C2\u657017\u79CD\uFF0C\u4E3B\u8981\u662F\u5947\u5076\u3001\u8D28\u5408\u3001\u5927\u5C0F\u3001\u5927\u4E2D\u5C0F\u3001012\u8DEF\u30010123\u8DEF\u30011234\u8DEF\u3001\u4E94\u884C\u3001\u7EFC\u5408\u8D70\u52BF\u3001\u51FA\u7403\u4E2A\u6570\u3001\u91CD\u7403\u3001\u5B9A\u4F4D\u53F7\u7801\u3001\u4E0D\u5B9A\u4F4D\u53F7\u7801\u3001\u548C\u503C\u3001\u548C\u5C3E\u3001\u8DE8\u5EA6\u3001AC\u503C\u7B49\uFF1B\u8F85\u52A9\u5206\u6790\u53C2\u65707\u79CD\uFF0C\u4E3B\u8981\u662F\u7EFC\u5408\u5F62\u6001\u3001\u5B9A\u4F4D\u7C7B\u578B\u3001\u5408\u5DEE\u3001\u7EFC\u5408\u9057\u6F0F\u3001\u7EFC\u5408\u8FDE\u51FA\u3001\u80C6\u7801\u4E00\u3001\u80C6\u7801\u4E8C\u7B49\u3002\u8FD9\u4E9B\u53C2\u6570\u5BF9\u65B9\u6848\u7684\u4F18\u5316\u8BBE\u7F6E\u548C\u8F85\u52A9\u5206\u6790\u5341\u5206\u91CD\u8981\u3002\u5E94\u4ED4\u7EC6\u7814\u7A76\uFF0C\u5BFB\u627E\u89C4\u5F8B\u3002");
		txtac.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 10, SWT.NORMAL));
		txtac.setBounds(10, 25, 847, 74);
		
		Group group_2 = new Group(shell, SWT.NONE);
		group_2.setText("\u65B9\u6848\u8BBE\u7F6E\u533A\uFF1A");
		group_2.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.NORMAL));
		group_2.setBounds(10, 278, 867, 109);
		
		text_1 = new Text(group_2, SWT.READ_ONLY | SWT.WRAP);
		text_1.setText("\u4E3B\u8981\u5305\u62EC\u4E94\u661F\u3001\u56DB\u661F\u3001\u524D\u4E09\u3001\u540E\u4E09\u7B49\u56DB\u79CD\u4E3B\u8981\u6295\u6CE8\u65B9\u5F0F\u7684\u65B9\u6848\u8BBE\u7F6E\u3001\u65B9\u6848\u4F18\u9009\u3001\u6307\u6807\u68C0\u6D4B\u4EE5\u53CA\u6295\u6CE8\u65B9\u6848\u56DB\u90E8\u5206\u7EC4\u6210\u3002\u65B9\u6848\u8BBE\u7F6E\u4E3B\u8981\u662F\u5BF9\u4E94\u661F700\u591A\u4E2A\u6570\u636E\u3001\u56DB\u661F400\u591A\u4E2A\u6570\u636E\u3001\u4E09\u661F300\u591A\u4E2A\u6570\u636E\u8FDB\u884C\u4F18\u5316\u914D\u7F6E\uFF0C\u4EE5\u5F62\u6210\u6295\u6CE8\u65B9\u6848\uFF1B\u6307\u6807\u68C0\u6D4B\u5206\u522B\u5BF9\u4E94\u661F\u3001\u56DB\u661F\u3001\u4E09\u661F\u65B9\u6848\u8BBE\u7F6E\u7684\u53C2\u6570\u8FDB\u884C\u5386\u53F2\u68C0\u6D4B\uFF0C\u5206\u6790\u4E2D\u5956\u60C5\u51B5\uFF1B\u65B9\u6848\u4F18\u5316\u662F\u5BF9\u4E94\u661F\u3001\u56DB\u661F\u3001\u524D\u4E09\u3001\u540E\u4E09\u8BBE\u7F6E\u768415\u4E2A\u65B9\u6848\u8FDB\u884C\u5BF9\u6BD4\uFF0C\u4F18\u9009\u786E\u5B9A\u6295\u6CE8\u65B9\u6848\u3002\u6295\u6CE8\u65B9\u6848\u662F\u6307\u4ECE15\u4E2A\u65B9\u6848\u4E2D\u9009\u62E9\u4E00\u4E2A\u6216\u51E0\u4E2A\u65B9\u6848\u7528\u4E8E\u6295\u6CE8\u3002\u540C\u65F6\u8FD8\u8BBE\u7F6E\u4E86\u201C\u624B\u52A8\u9009\u53F7\u201D\u8FC7\u6EE4\u5668\uFF0C\u7528\u4E8E\u5F69\u6C11\u6839\u636E\u6570\u636E\u5206\u6790\u533A\u7684\u6570\u636E\u81EA\u884C\u6295\u6CE8\u3002");
		text_1.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 10, SWT.NORMAL));
		text_1.setBounds(10, 25, 847, 81);
		
		Group group_3 = new Group(shell, SWT.NONE);
		group_3.setText("\u5386\u53F2\u9057\u6F0F\u68C0\u6D4B\u533A\uFF1A");
		group_3.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.NORMAL));
		group_3.setBounds(10, 393, 867, 52);
		
		text_2 = new Text(group_3, SWT.READ_ONLY | SWT.WRAP);
		text_2.setText("\u4E3B\u8981\u662F\u6307\u201C\u5386\u53F2\u9057\u6F0F\u53F7\u7801\u67E5\u8BE2\u201D\uFF0C\u5BF9\u4E94\u661F\u3001\u56DB\u661F\u3001\u524D\u4E09\u3001\u540E\u4E09\u3001\u8C79\u5B50\u5386\u53F2\u4E0A\u672A\u5F00\u51FA\u7684\u9057\u6F0F\u53F7\u7801\u8FDB\u884C\u81EA\u52A8\u5206\u671F\u68C0\u6D4B\uFF0C\u4E3B\u8981\u7528\u4E8E\u8FFD\u53F7\u6295\u6CE8\u3002");
		text_2.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 10, SWT.NORMAL));
		text_2.setBounds(10, 25, 847, 24);
		
		Group group_4 = new Group(shell, SWT.NONE);
		group_4.setText("\u53F7\u7801\u663E\u793A\u533A\uFF1A");
		group_4.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.NORMAL));
		group_4.setBounds(10, 451, 867, 103);
		
		text_3 = new Text(group_4, SWT.READ_ONLY | SWT.WRAP);
		text_3.setText("\u4E3B\u8981\u663E\u793A\u4E94\u661F\u3001\u56DB\u661F\u3001\u524D\u4E09\u3001\u540E\u4E09\u4E2D\u9009\u62E9\u6295\u6CE8\u7684\u65B9\u6848\u53F7\u7801\uFF0C\u53EF\u590D\u5236\u76F4\u63A5\u5728\u7F51\u7AD9\u6295\u6CE8\uFF0C\u4E5F\u53EF\u4FDD\u5B58\u6253\u5370\u540E\u5728\u5F69\u7968\u6295\u6CE8\u7AD9\u6295\u6CE8\u3002\u8BE5\u533A\u8FD8\u53EF\u663E\u793A\u5386\u53F2\u68C0\u6D4B\u533A\u68C0\u6D4B\u7684\u201C\u5386\u53F2\u9057\u6F0F\u53F7\u7801\u67E5\u8BE2\u201D\u4E2D\u5386\u53F2\u4E0A\u672A\u5F00\u5956\u7684\u53F7\u7801\uFF0C\u7528\u6765\u8FFD\u53F7\u6295\u6CE8\u3002\u8FD8\u53EF\u8FDB\u884C\u76F4\u9009\u53D8\u7EC4\u9009\u3001\u7EC4\u9009\u53D8\u5355\u9009\u7684\u8F6C\u6362\u3002\u4E5F\u53EF\u5BF9\u6295\u6CE8\u53F7\u7801\u5BFC\u5165\u201C\u624B\u52A8\u9009\u53F7\u201D\u8FC7\u6EE4\u5668\u518D\u6B21\u7CBE\u9009\u3002");
		text_3.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 10, SWT.NORMAL));
		text_3.setBounds(10, 25, 847, 68);
	}
}
