package com.example.demo;


import com.example.demo.domain.Message;
import org.springframework.data.repository.CrudRepository;

interface UserRepository extends CrudRepository<Message, Integer> {

}
