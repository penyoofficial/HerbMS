package com.penyo.herbms.service;

import com.penyo.herbms.pojo.ItemDifferentiation;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * 条辩的业务代理
 *
 * @author Penyo
 * @see ItemDifferentiation
 * @see GenericService
 */
@Service
public class ItemDifferentiationService extends GenericService<ItemDifferentiation> {
  @Override
  public int add(ItemDifferentiation o) {
    return itemDifferentiationDAO.add(o);
  }

  @Override
  public int delete(int id) {
    return itemDifferentiationDAO.delete(id);
  }

  @Override
  public int update(ItemDifferentiation o) {
    return itemDifferentiationDAO.update(o);
  }

  @Override
  public ItemDifferentiation selectById(int id) {
    return itemDifferentiationDAO.selectById(id);
  }

  @Override
  public List<ItemDifferentiation> selectByFields(List<String> fields) {
    return itemDifferentiationDAO.selectByFields(fields);
  }
}
