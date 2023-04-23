package com.logicbig.example.data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyConfigurationService {
    private final MyConfigurationRepository configurationRepository;
    @Autowired
    public MyConfigurationService(MyConfigurationRepository configurationRepository){
        this.configurationRepository = configurationRepository;
    }
    public MyConfiguration addConfiguration(MyConfiguration configuration){
        return configurationRepository.save(configuration);
    }
    public MyConfiguration getConfiguration(String username){
        return configurationRepository.findByUsername(username).get(1);
    }
    public List<MyConfiguration> getAllConfiguration(){
        return configurationRepository.findAll();
    }
    public MyConfiguration updateConfiguration(MyConfiguration configuration){
        if(configurationRepository.findByUsername(configuration.getUsername()).size() == 0){
            return configurationRepository.save(configuration);
        }
        return null;
    }
    public void deleteConfiguration(Long username){
        configurationRepository.deleteById(username);
    }

    public void flush() {
        configurationRepository.flush();
    }

    public String getValorOfPremio() {
        return configurationRepository.findByUsername("premio").get(0).getPassword();
    }
}
