package com.lvb.docmgr.Dao;

import com.lvb.docmgr.Model.Industry;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IndustryDao {
    @Select("Select * From industry")
    List<Industry> getAll();
    @Insert("INSERT INTO industry(name) VALUES (#{name});")
    @Options(useGeneratedKeys = true, keyProperty = "industryid")
    void insert(Industry industry);
}
