package com.lvb.docmgr.Dao;

import com.lvb.docmgr.Model.Seminar;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SeminarDao {
    @Select("Select * From seminar")
    List<Seminar> getAll();
}
