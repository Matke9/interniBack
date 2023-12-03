package kaketom.app.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;

@Document
public class UserLogin {
    @NotBlank(message = "Name is required")
    @Field
    private String name;

    @NotBlank(message = "Name is required")
    @Field
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
