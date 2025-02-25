package pe.edu.idat.demo_feign_client_basic.client.placeholder.iuserservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//@AllArgsConstructor  para constructor con argumentos
//@NoArgsConstructor   para constructor vacio
//@Builder
//@Data para getters and setter
public class User {
    private Long id;
    private String name;
    private String username;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
