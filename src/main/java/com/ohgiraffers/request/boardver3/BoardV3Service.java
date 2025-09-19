package com.ohgiraffers.request.boardver3;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardV3Service {
    private final BoardV3Mapper boardV3Mapper;
    private final PostV3Mapper postV3Mapper;
    public BoardV3Service(BoardV3Mapper boardV3Mapper,PostV3Mapper postV3Mapper){
    this.boardV3Mapper=boardV3Mapper;
    this.postV3Mapper=postV3Mapper;
}
    public List<BoardV3DTO> findAllBoards() {
        return boardV3Mapper.findAllBoards();
    }
    public List<PostV3DTO> findPostById(long boardId) {
        return postV3Mapper.selectPostById(boardId);
    }
    public BoardV3DTO findBoardById(long boardId) {
        return boardV3Mapper.selectBoardById(boardId);
    }
}
