package com.websocket.chat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websocket.chat.mapper.ChatMapper;
import com.websocket.chat.model.ChatRoom;

@Service
public class ChatRoomService {
	 @Autowired
	 private ChatMapper chatmapper;

	 public List<ChatRoom> findAllRoom() {
		 return chatmapper.findAllRoom();
	 }

	 public ChatRoom findRoomById(String roomId) {
		 return chatmapper.findRoomById(roomId);
	 }

	 public void createRoom(String name, String ownerId) {
	     ChatRoom chatRoom = ChatRoom.create(name, ownerId);
	     chatmapper.createRoom(chatRoom.getRoomId(), chatRoom.getName(), chatRoom.getOwnerId());
	     String userId = ownerId;
	     chatmapper.createRoomAuth(chatRoom.getRoomId(), userId);
	 }
	
	 
	 
	 public String findOwner(String roomId) {
		 return chatmapper.findOwner(roomId);
	 }
	 
	 public ChatRoom findRoomOwnerById(String roomId, String ownerId) {
		 return chatmapper.findRoomOwnerById(roomId,ownerId);
	 }
}
