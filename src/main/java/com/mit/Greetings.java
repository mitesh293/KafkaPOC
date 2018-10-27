package com.mit;

import lombok.*;

import javax.validation.constraints.AssertFalse;
import java.beans.ConstructorProperties;


@Getter @Setter @ToString @Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Greetings {
    private long timestamp;
    private String message;

}
