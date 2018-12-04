package com.udev.lighning.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.udev.lightning.beans.Message;
import com.udev.lightning.exceptions.MessageIdMismatchException;
import com.udev.lightning.exceptions.MessageNotFoundException;
import com.udev.lightning.repo.MessageRepository;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
 
    @Autowired
    private MessageRepository messageRepository;
 
    @GetMapping
    public Iterable findAll() {
        return messageRepository.findAll();
    }
 
    @GetMapping("/message/{id}")
    public Optional<Message> findByTransmitter(@PathVariable Long id) {
        return messageRepository.findById(id);
    }
 
    @GetMapping("/{id}")
    public Message findOne(@PathVariable Long id) {
    	Optional<Message> message = messageRepository.findById(id);
    	message.isPresent();
    	return message.get();
    }
 
    @PostMapping
    public Message create(@RequestBody Message message) {
        return messageRepository.save(message);
    }
 
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
    	messageRepository.findById(id);
    	messageRepository.deleteById(id);
    }
 
    @PutMapping("/{id}")
    public Message updateBook(@RequestBody Message message, @PathVariable Long id) {
        if (message.getId() != id) {
          throw new MessageIdMismatchException("Les id ne corespondent pas");
        }
        messageRepository.findById(id);
        return messageRepository.save(message);
    }
}