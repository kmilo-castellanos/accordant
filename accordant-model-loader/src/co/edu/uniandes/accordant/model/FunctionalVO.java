package co.edu.uniandes.accordant.model;

import java.util.Map;

import co.edu.uniandes.accordant_fv.Component;
import co.edu.uniandes.accordant_fv.Connector;
import co.edu.uniandes.accordant_fv.FunctionalView;

public class FunctionalVO {
	private FunctionalView fv;
	private Map<String,Component> compMap;
	public FunctionalView getFv() {
		return fv;
	}
	public void setFv(FunctionalView fv) {
		this.fv = fv;
	}
	public Map<String, Component> getCompMap() {
		return compMap;
	}
	public void setCompMap(Map<String, Component> compMap) {
		this.compMap = compMap;
	}
	public Map<String, Connector> getConnMap() {
		return connMap;
	}
	public void setConnMap(Map<String, Connector> connMap) {
		this.connMap = connMap;
	}
	private Map<String,Connector> connMap;

}
