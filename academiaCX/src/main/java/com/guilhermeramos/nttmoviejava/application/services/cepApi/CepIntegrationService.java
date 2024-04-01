package com.guilhermeramos.nttmoviejava.application.services.cepApi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.guilhermeramos.nttmoviejava.application.dtos.user.UserDTO;

@Service
public class CepIntegrationService {

    private final RestTemplate restTemplate;

    public CepIntegrationService() {
        this.restTemplate = new RestTemplate();
    }

    public UserDTO getUserAddressData(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        CepApiResponse response = restTemplate.getForObject(url, CepApiResponse.class);
        if (response != null) {
            UserDTO userDTO = new UserDTO();
            userDTO.setCep(response.getCep());
            userDTO.setLogradouro(response.getLogradouro());
            userDTO.setBairro(response.getBairro());
            userDTO.setLocalidade(response.getLocalidade());
            userDTO.setUf(response.getUf());
            return userDTO;
        }
        return null;
    }
}
