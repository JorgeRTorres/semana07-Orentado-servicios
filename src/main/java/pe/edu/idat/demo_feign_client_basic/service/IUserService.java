package pe.edu.idat.demo_feign_client_basic.service;

import pe.edu.idat.demo_feign_client_basic.client.placeholder.iuserservice.User;

import java.util.List;

public interface IUserService {
    List<User> obtenerUserClient();
    User obtenerUserClientXId(Long id);
}
