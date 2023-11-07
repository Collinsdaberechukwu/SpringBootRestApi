package com.example.springbootrestapi.Common.dto.Request;

import jakarta.persistence.Column;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class SignUpRequest {
    private String firstname;
    private String lastname;
    private String email;

}
