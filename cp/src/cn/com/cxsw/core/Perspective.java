package cn.com.cxsw.core;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import cn.com.cxsw.view.IndexBottomView;
import cn.com.cxsw.view.IndexMainView;
import cn.com.cxsw.view.IndexTopView;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
		layout.addStandaloneView(IndexMainView.ID, false, IPageLayout.LEFT, 0.78f, layout.getEditorArea());
		layout.addStandaloneView(IndexTopView.ID, false, IPageLayout.TOP, 0.5f, layout.getEditorArea());
		layout.addStandaloneView(IndexBottomView.ID, false, IPageLayout.BOTTOM, 0.5f, layout.getEditorArea());
	}
}
