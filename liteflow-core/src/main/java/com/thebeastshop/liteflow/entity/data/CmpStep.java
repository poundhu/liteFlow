/**
 * <p>Title: liteFlow</p>
 * <p>Description: 轻量级的组件式流程框架</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author Bryan.Zhang
 * @email weenyc31@163.com
 * @Date 2017-12-8
 * @version 1.0
 */
package com.thebeastshop.liteflow.entity.data;

import java.text.MessageFormat;

public class CmpStep {
	private String nodeId;
	
	private CmpStepType stepType;
	
	public CmpStep(String nodeId, CmpStepType stepType) {
		this.nodeId = nodeId;
		this.stepType = stepType;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public CmpStepType getStepType() {
		return stepType;
	}

	public void setStepType(CmpStepType stepType) {
		this.stepType = stepType;
	}
	
	@Override
	public String toString() {
		if(stepType.equals(CmpStepType.SINGLE)) {
			return MessageFormat.format("{0}", nodeId);
		}else {
			return MessageFormat.format("{0}({1})", nodeId,stepType);
		}
		
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}else {
			if(getClass() != obj.getClass()) {
				return false;
			}else {
				if(((CmpStep)obj).getNodeId().equals(this.getNodeId())) {
					return true;
				}else {
					return false;
				}
			}
		}
	}
}
