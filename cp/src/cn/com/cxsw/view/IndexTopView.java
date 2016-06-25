package cn.com.cxsw.view;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Label;

public class IndexTopView extends ViewPart {

	public static final String ID = "cn.com.cxsw.view.IndexTopView"; //$NON-NLS-1$

	public IndexTopView() {
	}

	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));
		{
			Composite composite = new Composite(container, SWT.BORDER);
			{
				Label lblNewLabel = new Label(composite, SWT.NONE);
				lblNewLabel.setBounds(89, 87, 61, 17);
				lblNewLabel.setText("New Label");
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
