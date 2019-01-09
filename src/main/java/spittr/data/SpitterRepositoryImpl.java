package spittr.data;

import org.springframework.stereotype.Component;
import spittr.Spitter;

import java.util.HashMap;
import java.util.Map;


@Component
public class SpitterRepositoryImpl implements SpitterRepository{

    public SpitterRepositoryImpl() {
        System.out.println("SpittleRepositoryImpl创建了");
    }

    Map<String,Spitter> map=new HashMap<>();

    @Override
    public void save(Spitter spitter) {
        map.put(spitter.getUsername(),spitter);
    }

    @Override
    public Spitter findByUsername(String username) {
        return map.get(username);
    }
}
