package pe.edu.idat.demo_feign_client_basic.client.placeholder.iuserservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient (name = "userClient", url = "https://jsonplaceholder.typicode.com")
public interface UserClient {

    @GetMapping("/users")
    List<User> obtenerUsuario();

    @GetMapping("/users/{id}")
    User obtenerUsuarioXId(@PathVariable("id") Long id, @RequestHeader("Authorization") String token);

    @PostMapping("/users")
    User guardarUsuario(@RequestBody User user);
}
