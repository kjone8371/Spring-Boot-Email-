package com.kjone.spring_google_email;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
public class MailController {
    private final MailService mailService;

    @GetMapping("/")
    public String MailPage(){
        return "Main";
    }

    @PostMapping("/emailConfirm")
    public String mailConfirm(@RequestBody User user){
        int num = mailService.sendEmail(user.getId());

        return "코드 발급" + num;
    }

    @ResponseBody
    @PostMapping("/mail")
    public String MailSend(String mail){

        int number = mailService.sendEmail(mail);

        String num = "" + number;

        return num;
    }


}
