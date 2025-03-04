package pe.edu.idat.demo_feign_client_basic.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.demo_feign_client_basic.client.placeholder.iuserservice.User;
import pe.edu.idat.demo_feign_client_basic.client.placeholder.iuserservice.UserClient;

import java.util.List;

@Service
public class UserService implements IUserService{

    private final UserClient userClient;

    public UserService(UserClient userClient) {
        this.userClient = userClient;
    }

    @Override
    public List<User> obtenerUserClient() {
        return userClient.obtenerUsuario();
    }

    @Override
    public User obtenerUserClientXId(Long id) {
        return userClient.obtenerUsuarioXId(id, "token");
    }

    @Override
    public User guardarUsuario(User usuario) {
        return userClient.guardarUsuario(usuario);
    }

}
