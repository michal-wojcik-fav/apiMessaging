package fav.apiMessaging.controller;

import fav.apiMessaging.exceptions.MessageNotFoundException;
import fav.apiMessaging.model.Message;
import fav.apiMessaging.repository.MessageRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@RestController
public class MessageController {


    private final MessageRepository repository;

    public MessageController(MessageRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/messages")
    List<Message> messages(){
        return repository.findAll();
    }


    @PostMapping("/messages")
    Message newMessage(@RequestBody Message newMessage){
        return repository.save(newMessage);
    }


    @GetMapping("/messages/{id}")
    Message oneMessage(@PathVariable Long id){
        return repository.findById(id).orElseThrow(()-> new MessageNotFoundException(id));
    }

    @DeleteMapping("/messages/{id}")
    void deleteMapping(@PathVariable Long id){
        repository.deleteById(id);
    }

}
