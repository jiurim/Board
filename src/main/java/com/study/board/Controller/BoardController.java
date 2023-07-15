package com.study.board.Controller;

import com.study.board.entity.Board;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

    @GetMapping("/board/write") //localhost:8080/board/write 이 주소에 접속하면 boardwrite html을 보여줌
    public String boardWriteForm(){
        return "boardwrite";
    }


    @PostMapping("/board/writepro")
    public String boardWritepro(Board board){
        System.out.println(board.getTitle());
        return "";
    }


}
