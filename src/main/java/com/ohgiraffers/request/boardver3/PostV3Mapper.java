package com.ohgiraffers.request.boardver3;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PostV3Mapper {
    List<PostV3DTO> selectPostById(@Param("boardId")long boardId);
}
