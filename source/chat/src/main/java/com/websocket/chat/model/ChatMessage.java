package com.websocket.chat.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {
    // 메시지 타입 : 입장, 채팅
    public enum MessageType {
        ENTER, TALK, NOTI, ASK
    }
    private MessageType type; // 메시지 타입
    private String roomId; // 방번호
    private String sender; // 메시지 보낸사람
    private String message; // 메시지
    
    /*
     * 방 권한 -> localsetStorage                         
     * 0 : permission denied
     * 1 : permission accepted
     * findOwner -> 
     * 	if owner
     * 		enter 
     *  else 
     *  	owner한테 메시지 
     * */
    private int auth; 
}
