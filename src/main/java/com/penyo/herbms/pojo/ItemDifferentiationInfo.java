package com.penyo.herbms.pojo;

/**
 * 条辨概要的数据容器
 *
 * @author Penyo
 * @see GenericBean
 */
public class ItemDifferentiationInfo extends GenericBean {
  /**
   * 唯一识别码
   */
  private int id;
  /**
   * 编号
   */
  private int code;
  /**
   * 内容
   */
  private String content;
  /**
   * 注释
   */
  private String annotation;

  public ItemDifferentiationInfo() {
  }

  public ItemDifferentiationInfo(int id, int code, String content, String annotation) {
    this.id = id;
    this.code = code;
    this.content = content;
    this.annotation = annotation;
  }

  @Override
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getAnnotation() {
    return annotation;
  }

  public void setAnnotation(String annotation) {
    this.annotation = annotation;
  }
}
