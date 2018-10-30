package com.model;

import lombok.*;


@Getter @Setter @ToString @Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Greetings {
    private long timestamp;
    private String message;
    private int age;
    private String firstName;
    private String lastName;
}
