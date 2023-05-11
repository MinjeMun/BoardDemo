package com.example.Boarddemo.dto;

import com.example.Boarddemo.entity.BoardEntity;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {
    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private int boardHits;
    private LocalDateTime boardCreatedTime;
    private LocalDateTime boardUpdatedTime;

    public static BoardDTO toBoardDTO(BoardEntity boardEntity) {
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setId(boardEntity.getId());
        boardDTO.setBoardWriter(boardEntity.getBoardWriter());
        boardDTO.setBoardPass(boardEntity.getBoardPass());
        boardDTO.setBoardTitle((boardEntity.getBoardTitle()));
        boardDTO.setBoardContents((boardEntity.getBoardContents()));
        boardDTO.setBoardHits(boardEntity.getBoardHits());
        boardDTO.setBoardCreatedTime(boardEntity.getCreatedTime());
        if(boardEntity.getUpdatedTime()==null) {
            boardDTO.setBoardCreatedTime(boardEntity.getCreatedTime());
        } else{
            boardDTO.setBoardCreatedTime(boardEntity.getUpdatedTime());
        }
        boardDTO.setBoardUpdatedTime((boardEntity.getUpdatedTime()));
        return boardDTO;
    }
}
