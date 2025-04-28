


package org.example.projekt;

import jakarta.annotation.PostConstruct;
import org.openapitools.client.api.DefaultApi;
import org.openapitools.client.model.GameInputDto;
import org.springframework.stereotype.Component;
import org.openapitools.client.model.GameDto;

@Component
public class StartupBeam {
    @PostConstruct
    public void init(){
        DefaultApi defaultApi = new DefaultApi();
        GameInputDto gameInput = new GameInputDto();
        gameInput.setGroupName ("Spiel 1");

        GameDto response = defaultApi.gamePost(gameInput);
    }
}
