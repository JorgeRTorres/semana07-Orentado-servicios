package pe.edu.idat.demo_feign_client_basic.controller;

import org.springframework.web.bind.annotation.*;
import pe.edu.idat.demo_feign_client_basic.client.placeholder.iuserservice.User;
import pe.edu.idat.demo_feign_client_basic.service.IUserService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final IUserService iUserService;

    public UserController(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @GetMapping
    public List<User>  getUser(){
        return iUserService.obtenerUserClient();
    }
    @GetMapping("/{id}")
    public User obtenerxId (@PathVariable Long id){
        return  iUserService.obtenerUserClientXId(id);
    }
    @PostMapping
    public User guardarUsuario(@RequestBody User usaurio){
        return iUserService.guardarUsuario(usaurio);
    }
}
