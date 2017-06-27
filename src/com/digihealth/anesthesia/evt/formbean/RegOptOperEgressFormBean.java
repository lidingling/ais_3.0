package com.digihealth.anesthesia.evt.formbean;

import java.util.List;

public class RegOptOperEgressFormBean {

	private Integer ioDefId;
	private String name;
	private String unit;
	private String dosageUnit;
	private List<SearchOptOperEgress> egressList;

	public String getDosageUnit()
    {
        return dosageUnit;
    }

    public void setDosageUnit(String dosageUnit)
    {
        this.dosageUnit = dosageUnit;
    }

    public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIoDefId() {
		return ioDefId;
	}

	public void setIoDefId(Integer ioDefId) {
		this.ioDefId = ioDefId;
	}

	public List<SearchOptOperEgress> getEgressList() {
		return egressList;
	}

	public void setEgressList(List<SearchOptOperEgress> egressList) {
		this.egressList = egressList;
	}

}