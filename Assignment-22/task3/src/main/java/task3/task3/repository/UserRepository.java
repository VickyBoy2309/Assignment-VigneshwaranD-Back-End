package task3.task3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import task3.task3.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
  
}