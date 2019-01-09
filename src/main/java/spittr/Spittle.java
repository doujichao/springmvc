package spittr;


import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.Date;

public class Spittle {

    private  Long id;
    private  String message;
    private  Date time;
    private Double latitude;
    private Double longitude;
    public Spittle(String message,Date time){
        this(message,time,null,null);
    }

    public Spittle() {
        System.out.println("Spittle创建了");
    }

    public Spittle(String message, Date time, Double longitude, Double latitude) {
        this.id=null;
        this.message=message;
        this.time=time;
        this.longitude=longitude;
        this.latitude=latitude;
    }


    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    @Override
    public boolean equals(Object that){
        return EqualsBuilder.reflectionEquals(this,that,new String[]{"id","time"});
    }

    @Override
    public int hashCode(){
        return HashCodeBuilder.reflectionHashCode(this,new String[]{"id","time"});
    }
}
