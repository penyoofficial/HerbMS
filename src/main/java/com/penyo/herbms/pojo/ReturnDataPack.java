package com.penyo.herbms.pojo;

import java.util.List;

/**
 * 返回数据包
 *
 * @author Penyo
 * @see GenericBean
 */
public class ReturnDataPack<T> extends GenericBean {
  /**
   * 影响行数
   */
  private int affectedRows = -114514;
  /**
   * 结果
   */
  private List<T> objs;

  public ReturnDataPack() {
  }

  public ReturnDataPack(List<T> objs) {
    this.objs = objs;
  }

  public ReturnDataPack(int affectedRows, List<T> objs) {
    this.affectedRows = affectedRows;
    this.objs = objs;
  }

  public int getAffectedRows() {
    return affectedRows;
  }

  public void setAffectedRows(int affectedRows) {
    this.affectedRows = affectedRows;
  }

  public List<T> getObjs() {
    return objs;
  }

  public void setObjs(List<T> objs) {
    this.objs = objs;
  }
}
