package spittr.data;

import org.springframework.stereotype.Component;
import spittr.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class SpittleRepositoryImpl implements SpittleRepository{

    public SpittleRepositoryImpl() {
        System.out.println("SpittleRepositoryImpl创建了");
    }

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> list=new ArrayList<>();
        for (int i=0;i<count;i++){
            list.add(new Spittle("Spittles"+i,new Date()));
        }
        return list;
    }
}
