package com.example.Clinica.security;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {


    private UserRepository userRepository;
    @Autowired
    public DataLoader(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode("password");
        String password2 = passwordEncoder.encode("password2");

        userRepository.save(new AppUser("Dario", "Nani", "darioplaza@hotmail.com", password, UserRol.ADMIN));
        userRepository.save(new AppUser("Dario2", "Nani2", "darioplaza2@hotmail.com", password2, UserRol.ADMIN));
    }
}
