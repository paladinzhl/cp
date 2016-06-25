package cn.com.cxsw.core;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import cn.com.cxsw.view.IndexView;
import cn.com.cxsw.view.Test1View;
import cn.com.cxsw.view.Test2View;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
		layout.addStandaloneView(IndexView.ID, false, IPageLayout.LEFT, 0.78f, layout.getEditorArea());
		layout.addStandaloneView(Test1View.ID, false, IPageLayout.TOP, 0.5f, layout.getEditorArea());
		layout.addStandaloneView(Test2View.ID, false, IPageLayout.BOTTOM, 0.5f, layout.getEditorArea());
	}
}
