package cn.com.cxsw.view;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridLayout;
import swing2swt.layout.FlowLayout;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;

public class IndexTopView extends ViewPart {

	public static final String ID = "cn.com.cxsw.view.IndexTopView"; //$NON-NLS-1$

	public IndexTopView() {
	}

	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));
		Composite composite = new Composite(container, SWT.BORDER);
		{
			Group group = new Group(composite, SWT.NONE);
			group.setText("\u5F69\u79CD\u5207\u6362");
			group.setBounds(248, 10, 264, 202);
			{
				Button button = new Button(group, SWT.NONE);
				button.setText("\u65B0\u7586\u65F6\u65F6\u5F69");
				button.setBounds(143, 20, 93, 27);
			}
			{
				Button button = new Button(group, SWT.NONE);
				button.setText("\u91CD\u5E86\u65F6\u65F6\u5F69");
				button.setBounds(33, 20, 96, 27);
			}
			{
				Button button = new Button(group, SWT.NONE);
				button.setText("\u5929\u6D25\u65F6\u65F6\u5F69");
				button.setBounds(33, 65, 96, 27);
			}
			{
				Button button = new Button(group, SWT.NONE);
				button.setText("\u91CD\u5E86\u65F6\u65F6\u5F69");
				button.setBounds(143, 65, 93, 27);
			}
			{
				Button button = new Button(group, SWT.NONE);
				button.setText("\u4E0A\u6D77\u65F6\u65F6\u4E50");
				button.setBounds(143, 110, 93, 27);
			}
			{
				Button button = new Button(group, SWT.NONE);
				button.setText("\u798F\u5F693D");
				button.setBounds(143, 154, 93, 27);
			}
			{
				Button button = new Button(group, SWT.NONE);
				button.setText("\u6392\u5217\u4E94\uFF0F\u6392\u5217\u4E09");
				button.setBounds(33, 154, 96, 27);
			}
			{
				Button button = new Button(group, SWT.NONE);
				button.setText("\u9ED1\u9F99\u6C5F\u65F6\u65F6\u5F69");
				button.setBounds(33, 110, 96, 27);
			}
		}
		{
			Group group = new Group(composite, SWT.NONE);
			group.setText("\u5F00\u5956\u53F7\u7801");
			group.setBounds(10, 104, 232, 108);
		}
		{
			Label label = new Label(composite, SWT.NONE);
			label.setText("\u671F");
			label.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.BOLD));
			label.setBounds(125, 66, 23, 26);
		}
		{
			Label label = new Label(composite, SWT.CENTER);
			label.setText("1662609");
			label.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
			label.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.BOLD));
			label.setBounds(27, 63, 92, 29);
		}
		{
			Label label = new Label(composite, SWT.NONE);
			label.setText("\u7B2C");
			label.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.BOLD));
			label.setBounds(10, 66, 23, 26);
		}
		{
			Label label = new Label(composite, SWT.NONE);
			label.setText("\u91CD\u5E86\u65F6\u65F6\u5F69");
			label.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
			label.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.BOLD));
			label.setBounds(10, 10, 138, 38);
		}
		{
			Group group = new Group(composite, SWT.NONE);
			group.setText("\u8FD120\u671F\u5F00\u5956");
			group.setBounds(10, 218, 502, 211);
			{
				Label label = new Label(group, SWT.NONE);
				label.setBounds(22, 20, 35, 17);
				label.setText("\u671F\u6570");
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("\u53F7\u7801");
				label.setBounds(124, 20, 35, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setBounds(230, 20, 35, 17);
				label.setText("\u5927\u5C0F");
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("\u5947\u5076");
				label.setBounds(326, 20, 35, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("\u5947\u5076");
				label.setBounds(439, 20, 35, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setBounds(22, 43, 45, 17);
				label.setText("16178");
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("1 2 1 5 7");
				label.setBounds(114, 43, 88, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setBounds(230, 43, 35, 17);
				label.setText("3 : 5");
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("3 : 5");
				label.setBounds(326, 43, 35, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("3 : 5");
				label.setBounds(439, 43, 35, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("3 : 5");
				label.setBounds(439, 66, 35, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("3 : 5");
				label.setBounds(326, 66, 35, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("3 : 5");
				label.setBounds(230, 66, 35, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("1 2 1 5 7");
				label.setBounds(114, 66, 88, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("16178");
				label.setBounds(22, 66, 45, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("3 : 5");
				label.setBounds(439, 89, 35, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("3 : 5");
				label.setBounds(326, 89, 35, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("3 : 5");
				label.setBounds(230, 89, 35, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("1 2 1 5 7");
				label.setBounds(114, 89, 88, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("16178");
				label.setBounds(22, 89, 45, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("3 : 5");
				label.setBounds(439, 112, 35, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("3 : 5");
				label.setBounds(326, 112, 35, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("3 : 5");
				label.setBounds(230, 112, 35, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("1 2 1 5 7");
				label.setBounds(114, 112, 88, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("16178");
				label.setBounds(22, 112, 45, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("3 : 5");
				label.setBounds(439, 135, 35, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("3 : 5");
				label.setBounds(326, 135, 35, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("3 : 5");
				label.setBounds(230, 135, 35, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("1 2 1 5 7");
				label.setBounds(114, 135, 88, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("16178");
				label.setBounds(22, 135, 45, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("3 : 5");
				label.setBounds(439, 158, 35, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("3 : 5");
				label.setBounds(326, 158, 35, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("3 : 5");
				label.setBounds(230, 158, 35, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("1 2 1 5 7");
				label.setBounds(114, 158, 88, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("16178");
				label.setBounds(22, 158, 45, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("3 : 5");
				label.setBounds(439, 181, 35, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("3 : 5");
				label.setBounds(326, 181, 35, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("3 : 5");
				label.setBounds(230, 181, 35, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("1 2 1 5 7");
				label.setBounds(114, 181, 88, 17);
			}
			{
				Label label = new Label(group, SWT.NONE);
				label.setText("16178");
				label.setBounds(22, 181, 45, 17);
			}
		}

		createActions();
		initializeToolBar();
		initializeMenu();
	}

	private void createActions() {
	}

	private void initializeToolBar() {
		IToolBarManager toolbarManager = getViewSite().getActionBars()
				.getToolBarManager();
	}

	private void initializeMenu() {
		IMenuManager menuManager = getViewSite().getActionBars()
				.getMenuManager();
	}

	public void setFocus() {
	}

}
