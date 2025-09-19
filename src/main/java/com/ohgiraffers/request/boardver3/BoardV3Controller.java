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
        List<PostV3DTO> postV3DTOs =boardV3Service.findAllPosts();

        for (BoardV3DTO boards : boardV3DTOs) {
            System.out.println(boards);
        }
        for(PostV3DTO posts:postV3DTOs){
            System.out.println(posts);
        }
        model.addAttribute("boardV3DTOs", boardV3DTOs);
        model.addAttribute("postV3DTOs", postV3DTOs);
        return "boardv3/description";
    }

}


