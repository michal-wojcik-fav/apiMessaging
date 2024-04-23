package fav.apiMessaging.exceptions;

public class MessageNotFoundException extends RuntimeException {
    public MessageNotFoundException(Long id){
        super("Message of id: "+ id +" not found");
    }
}
