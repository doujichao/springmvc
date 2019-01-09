package com.spring.aop;

import com.spring.aop.perfromace.cdplayer.TrackCounter;
import com.spring.aop.perfromace.cdplayer.TrackCounterConfig;
import com.spring.demo.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCountTest {

    @Autowired
    private CompactDisc cd;

    @Autowired
    private TrackCounter counter;

    @Test
    public  void testTrackCounter(){
        cd.playTrack(1);
        cd.playTrack(2);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);

        assertEquals(1,counter.getPlayCount(1));
        assertEquals(1,counter.getPlayCount(2));
        assertEquals(4,counter.getPlayCount(3));
        assertEquals(0,counter.getPlayCount(5));
        assertEquals(0,counter.getPlayCount(6));

    }
}
