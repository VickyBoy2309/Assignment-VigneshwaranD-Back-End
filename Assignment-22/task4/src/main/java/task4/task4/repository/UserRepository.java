package task4.task4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import task4.task4.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}