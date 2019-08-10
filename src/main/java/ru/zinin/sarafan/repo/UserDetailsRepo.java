package ru.zinin.sarafan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zinin.sarafan.domain.User;

public interface UserDetailsRepo extends JpaRepository<User,String> {
}
