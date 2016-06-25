package cn.com.cxsw.core;


import java.util.Date;

import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.wb.swt.ResourceManager;

import cn.com.cxsw.action.BuyMethodAction;
import cn.com.cxsw.action.DefinitionsAction;
import cn.com.cxsw.action.ProbabilityIndexAction;
import cn.com.cxsw.action.SoftIntroduceAction;
import cn.com.cxsw.action.SoftwareRegistrationAction;
import cn.com.cxsw.action.SystemCharacteristicAction;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {
	private DefinitionsAction da; // ���ʽ���
	private ProbabilityIndexAction pia;// ����ָ��
	private SoftIntroduceAction sia; // �������
	private SystemCharacteristicAction sca;// ϵͳ�ص�
	private BuyMethodAction bma;// Ͷע����
	private SoftwareRegistrationAction sra;// ���ע��

	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}

	protected void makeActions(IWorkbenchWindow window) {
		da = new DefinitionsAction();
		da.setImageDescriptor(ResourceManager.getImageDescriptor(ApplicationActionBarAdvisor.class, "/cn/com/cxsw/images/mcjs.jpg"));
		da.setText("���ʽ���");

		pia = new ProbabilityIndexAction();
		pia.setImageDescriptor(ResourceManager.getImageDescriptor(ApplicationActionBarAdvisor.class, "/cn/com/cxsw/images/glzb.jpg"));
		pia.setText("����ָ��");


		sia = new SoftIntroduceAction();
		sia.setImageDescriptor(ResourceManager.getImageDescriptor(ApplicationActionBarAdvisor.class, "/cn/com/cxsw/images/rjsm.jpg"));

		sca = new SystemCharacteristicAction();
		sca.setImageDescriptor(ResourceManager.getImageDescriptor(ApplicationActionBarAdvisor.class, "/cn/com/cxsw/images/xttd.jpg"));
		sca.setText("ϵͳ�ص�");

		bma = new BuyMethodAction();
		bma.setImageDescriptor(ResourceManager.getImageDescriptor(ApplicationActionBarAdvisor.class, "/cn/com/cxsw/images/tzff.jpg"));
		bma.setText("Ͷע����");

		sra = new SoftwareRegistrationAction();
		sra.setImageDescriptor(ResourceManager.getImageDescriptor(ApplicationActionBarAdvisor.class, "/cn/com/cxsw/images/rjzc.jpg"));
		sra.setText("���ע��");
	}

	protected void fillMenuBar(IMenuManager menuBar) {
	}

	protected void fillCoolBar(ICoolBarManager coolBar) {
		IToolBarManager toolGroup = new ToolBarManager();
		toolGroup.add(sia);
		toolGroup.add(sca);
		toolGroup.add(da);
		toolGroup.add(pia);
		toolGroup.add(bma);
		toolGroup.add(sra);
		coolBar.add(toolGroup);
	}

	protected void fillStatusLine(IStatusLineManager statusLine) {
	}
	
	

}
