package com.ohgiraffers.request.boardver3;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import java.util.List;

@Controller
@RequestMapping("/boardv3")
public class BoardV3Controller {
    private final BoardV3Service boardV3Service;
    public BoardV3Controller(BoardV3Service boardV3Service) {
        this.boardV3Service = boardV3Service;
    }

    @GetMapping
    public String homeBoard(Model model) {
        List<BoardV3DTO> boardV3DTOs = boardV3Service.findAllBoards();

        for (BoardV3DTO boards : boardV3DTOs) {
            System.out.println(boards);
        }
        model.addAttribute("boardV3DTOs", boardV3DTOs);
        return "boardv3/description";
    }
    @GetMapping("test")
    public String homeBoard1(Model model) {
        List<PostV3DTO> popstV3DTOs = boardV3Service.findPostById(1);

        return "boardv3/description";
    }

    @GetMapping("/{boardId}")
    public String viewBoard(@PathVariable long boardId, Model model) {
        BoardV3DTO boardV3DTO = boardV3Service.findBoardById(boardId);
        List<PostV3DTO> postV3DTO = boardV3Service.findPostById(boardId);

        model.addAttribute("boardDTO", boardV3DTO);
        System.out.println("controller" + boardV3DTO);
        return "boardv3/" + boardId;
    }
}


