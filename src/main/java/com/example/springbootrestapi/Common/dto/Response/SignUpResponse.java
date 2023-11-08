package com.example.springbootrestapi.Common.dto.Response;

//import com.example.springbootrestapi.domain.model.Student;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class SignUpResponse {
    private Long id;
    private String firstname;
    private String email;
}
