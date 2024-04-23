package fav.apiMessaging.repository;

import fav.apiMessaging.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
