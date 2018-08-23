package pl.com.springboot.jokesapp.services;

import org.springframework.stereotype.Service;
import pl.com.springboot.jokesapp.ChuckNorissQuotes;

@Service
public class JokeServicesImpl implements JokeServices {


    private final ChuckNorissQuotes chuckNorissQuotes;

    public JokeServicesImpl() {
        this.chuckNorissQuotes = new ChuckNorissQuotes();
    }

    @Override
    public String getJoke() {
        return null;
    }
}
