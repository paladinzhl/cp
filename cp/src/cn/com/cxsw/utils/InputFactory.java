package cn.com.cxsw.utils;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class InputFactory implements IEditorInput{
	
	private String name;
	private String toolTipText;

	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class adapter) {
		return null;
	}

	public boolean exists() {
		return false;
	}

	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	public String getName() {
		return name;
	}

	public IPersistableElement getPersistable() {
		return null;
	}

	public String getToolTipText() {
		return toolTipText;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setToolTipText(String toolTipText) {
		this.toolTipText = toolTipText;
	}

}
