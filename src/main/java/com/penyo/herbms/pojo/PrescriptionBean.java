package com.penyo.herbms.pojo;

/**
 * 处方的数据容器。
 * 
 * @author Penyo
 */
public class PrescriptionBean extends Bean {
  /** 中药处方 ID（外键） */
  private int prescriptionId;
  /** 药品 ID（外键） */
  private int herbId;
  /** 用量 */
  private String dosage;
  /** 用法 */
  private String usage;

  public PrescriptionBean() {
  }

  public PrescriptionBean(int id, int prescriptionId, int herbId, String dosage, String usage) {
    super(id);
    this.prescriptionId = prescriptionId;
    this.herbId = herbId;
    this.dosage = dosage;
    this.usage = usage;
  }

  public int getPrescriptionId() {
    return prescriptionId;
  }

  public void setPrescriptionID(int prescriptionId) {
    this.prescriptionId = prescriptionId;
  }

  public int getHerbId() {
    return herbId;
  }

  public void setHerbId(int herbId) {
    this.herbId = herbId;
  }

  public String getDosage() {
    return dosage;
  }

  public void setDosage(String dosage) {
    this.dosage = dosage;
  }

  public String getUsage() {
    return usage;
  }

  public void setUsage(String usage) {
    this.usage = usage;
  }
}
