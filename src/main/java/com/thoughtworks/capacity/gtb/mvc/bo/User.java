package com.thoughtworks.capacity.gtb.mvc.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private int id;
    @NotNull
    private String username;
    @NotNull
    private String password;
    @Email
    private String email;

    @JsonIgnore
    public void setId(int id) {
        this.id = id;
    }
}