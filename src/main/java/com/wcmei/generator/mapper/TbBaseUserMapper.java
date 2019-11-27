package com.wcmei.generator.mapper;

import com.wcmei.generator.domain.TbBaseUser;

public interface TbBaseUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbBaseUser record);

    int insertSelective(TbBaseUser record);

    TbBaseUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbBaseUser record);

    int updateByPrimaryKey(TbBaseUser record);
}