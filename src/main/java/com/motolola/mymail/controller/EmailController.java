package com.motolola.mymail.controller;

import com.motolola.mymail.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    @Qualifier("com.motolola.mymail")
    public MailSender mailSender;

    @GetMapping("/send")
    public String send()
    {
        mailSender.sendMail("motolola@icloud.com",
                "motolola@icloud.com",
                "Subject",
                "Message Body");
        return "Sent";
    }
}