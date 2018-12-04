package com.udev.lightning.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.udev.lightning.beans.Message;

public interface MessageRepository extends CrudRepository<Message, Long> {
    Optional<Message> findById(Long id);
}


