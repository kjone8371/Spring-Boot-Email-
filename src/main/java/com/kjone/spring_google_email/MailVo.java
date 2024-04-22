package com.kjone.spring_google_email;

import lombok.Data;

@Data
public class MailVo {
    private String receiver;
    private String title;
    private String content;
}
