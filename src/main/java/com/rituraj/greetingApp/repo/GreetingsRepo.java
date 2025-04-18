package com.rituraj.greetingApp.repo;

import com.rituraj.greetingApp.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingsRepo extends JpaRepository<Greeting, String> {
}
