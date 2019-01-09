package spittr;

import com.sun.istack.internal.NotNull;

import javax.validation.constraints.Size;

public class Spitter {

    private Long id;

    private String email;


    @NotNull
    @Size(max =22)
    private String firstName;

    @NotNull
    @Size(max =22)
    private String lastName;
    @NotNull
    @Size(max =22)
    private String username;
    @NotNull
    @Size(max =22)
    private String password;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
