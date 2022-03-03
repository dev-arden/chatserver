# Chat app 

## Stacks
> Springboot + Java + Mysql

> Vue.js + HTML

## chat and private-message Protocols
> STOMP(Websocket)
- why I use the STOMP?
> make a channel from Server to Client 

> Using HTTP, it is impossible to send from Server to Client

## login, join, create room, enter room Protocols
> Rest API

## flow
> request scenario
![1](images/requestscenario.png)
> accept scenario (accept)
![1](images/acceptscenario.png)
> accept scenario (deny)
![1](images/acceptscenario2.png)
> enter scenario 
![1](images/enterscenario.png)


## Screen capture
### join
![1](images/join.png)

### login
![1](images/login.png)

### chatroom list
![1](images/chatroomlist1.png)

### request (when accepted)
![1](images/request.png)
![1](images/request2.png)
![1](images/request3.png)
![1](images/request4.png)

### request (when denied)
![1](images/reqnopermission.png)
![1](images/reqnopermission2.png)
![1](images/reqnopermission3.png)

### request simulation
- [request simulation](images/requestvideo.mov)

### accept simulation
- [accept simulation](images/acceptvideo.mov)

### chat
![1](images/chat.png)
![1](images/chat2.png)

### chat simulation
- [chat simulation](images/chatvideo.mov)

### create room simulation
- [create room simulation](images/createroom.mov)


## Need to improve
1. error handling based on Http status code
2. join column - add creationDate, modifyDate, quitDate field for record
3. package structure for domain (divide chat, account)
- com.websocket.chat.account.controller
- com.websocket.chat.chatroom.controller
5. In mapper, parameter is not delivered @Param, but VO(model)
6. either REST API or STOMP API, API name must be clear(api name is exposed)
