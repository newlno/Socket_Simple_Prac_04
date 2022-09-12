package com.example.Socket_Simple_Prac_04.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessageDto {

    private String roomId;
    private String writer;
    private String message;
}
