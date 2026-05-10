package task2.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import task2.task2.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
  
}