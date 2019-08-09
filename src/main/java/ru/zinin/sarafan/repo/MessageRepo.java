package ru.zinin.sarafan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zinin.sarafan.domain.Message;

public interface MessageRepo extends JpaRepository<Message, Long> {

}
