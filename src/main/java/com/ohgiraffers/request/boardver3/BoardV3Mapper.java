package com.ohgiraffers.request.boardver3;

import com.ohgiraffers.request.post.PostDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface BoardV3Mapper {
    List<BoardV3DTO> findAllBoards();
    List<PostV3DTO> findAllPosts();
}
