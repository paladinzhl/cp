package cn.com.cxsw.core;

import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.wb.swt.ResourceManager;

import cn.com.cxsw.action.DefinitionsAction;
import cn.com.cxsw.action.ProbabilityIndexAction;
import cn.com.cxsw.action.SoftIntroduceAction;
import cn.com.cxsw.action.SystemCharacteristicAction;
import org.eclipse.jface.action.Action;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {
	private DefinitionsAction da; // 名词解释
	private ProbabilityIndexAction pia;// 概率指标
	private SoftIntroduceAction sia; // 软件介绍
	private SystemCharacteristicAction sca;// 系统特点
	private Action action;
	private Action action_1;

	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}

	protected void makeActions(IWorkbenchWindow window) {
		da = new DefinitionsAction();
		da.setImageDescriptor(ResourceManager.getImageDescriptor(ApplicationActionBarAdvisor.class, "/cn/com/cxsw/images/mcjs.jpg"));
		da.setText("名词解释");

		pia = new ProbabilityIndexAction();
		pia.setImageDescriptor(ResourceManager.getImageDescriptor(ApplicationActionBarAdvisor.class, "/cn/com/cxsw/images/glzb.jpg"));
		pia.setText("概率指标");

		sia = new SoftIntroduceAction();
		sia.setImageDescriptor(ResourceManager.getImageDescriptor(ApplicationActionBarAdvisor.class, "/cn/com/cxsw/images/rjsm.jpg"));
		sia.setText("软件介绍");

		sca = new SystemCharacteristicAction();
		sca.setImageDescriptor(ResourceManager.getImageDescriptor(ApplicationActionBarAdvisor.class, "/cn/com/cxsw/images/xttd.jpg"));
		sca.setText("系统特点");
	}

	protected void fillMenuBar(IMenuManager menuBar) {
	}

	protected void fillCoolBar(ICoolBarManager coolBar) {
		IToolBarManager toolGroup = new ToolBarManager();
		toolGroup.add(sia);
		toolGroup.add(sca);
		toolGroup.add(da);
		toolGroup.add(pia);
		coolBar.add(toolGroup);
	}

}
