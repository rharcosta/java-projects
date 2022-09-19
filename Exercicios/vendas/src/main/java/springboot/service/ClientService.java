package springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.model.Client;
import springboot.repository.ClientRepository;

@Service
public class ClientService {
    private final ClientRepository repository;

    @Autowired
    public ClientService(ClientRepository repository){
    this.repository = repository;
    }
    public void saveClient(Client client){
    validateClient(client);
    this.repository.persist(client);
    }
    public void validateClient(Client client){
    //instructions
    }
}
