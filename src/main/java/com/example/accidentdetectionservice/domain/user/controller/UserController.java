package com.example.accidentdetectionservice.domain.user.controller;

import com.example.accidentdetectionservice.domain.user.dto.MessageResponseDto;
import com.example.accidentdetectionservice.domain.user.dto.SignupRequestDto;
import com.example.accidentdetectionservice.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @GetMapping("/user/sign-up")
    public ResponseEntity<MessageResponseDto> signUp(@RequestBody SignupRequestDto requestDto) {
        return userService.signup(requestDto);
    }

}
