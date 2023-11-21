package com.penyo.herbms.service;

import com.penyo.herbms.pojo.ExperienceBean;

import java.util.ArrayList;
import java.util.List;

/**
 * 中药使用心得的业务层
 *
 * @author Penyo
 */
public class ExperienceService extends AbstractService<ExperienceBean> {
  @Override
  public int add(ExperienceBean o) {
    return expDAO.add(o);
  }

  @Override
  public int deleteById(int id) {
    return expDAO.delete(id);
  }

  @Override
  public int update(ExperienceBean o) {
    return expDAO.update(o);
  }

  @Override
  public ExperienceBean selectById(int id) {
    return expDAO.select(id);
  }

  @Override
  public List<ExperienceBean> selectByField(String field) {
    if (field.isEmpty()) return expDAO.selectAll();

    List<ExperienceBean> hs = new ArrayList<>();
    for (ExperienceBean h : expDAO.selectAll())
      if (h.getDerivation().contains(field) || h.getContent().contains(field)) hs.add(h);
    return hs;
  }

  /**
   * 根据中药 ID 查找元素。
   */
  public List<ExperienceBean> selectByHerbId(int herbId) {
    List<ExperienceBean> hs = new ArrayList<>();
    for (ExperienceBean h : expDAO.selectAll())
      if (h.getHerbId() == herbId) hs.add(h);
    return hs;
  }

  /**
   * 根据字段查找心得。
   */
  public List<String> selectExperiencesByField(String field) {
    List<String> hs = new ArrayList<>();
    for (ExperienceBean h : expDAO.selectAll()) {
      String c = h.getContent();
      if (c.contains(field)) hs.add(c);
    }
    return hs;
  }
}
