
package app.com.feldmansoft.android.sunshine;

import com.google.gson.annotations.Expose;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class List {

    @Expose
    private Integer dt;
    @Expose
    private Temp temp;
    @Expose
    private Double pressure;
    @Expose
    private Integer humidity;
    @Expose
    private java.util.List<Weather> weather = new ArrayList<Weather>();
    @Expose
    private Double speed;
    @Expose
    private Integer deg;
    @Expose
    private Integer clouds;
    @Expose
    private Double rain;

    /**
     * 
     * @return
     *     The dt
     */
    public Integer getDt() {
        return dt;
    }

    /**
     * 
     * @param dt
     *     The dt
     */
    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public List withDt(Integer dt) {
        this.dt = dt;
        return this;
    }

    /**
     * 
     * @return
     *     The temp
     */
    public Temp getTemp() {
        return temp;
    }

    /**
     * 
     * @param temp
     *     The temp
     */
    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    public List withTemp(Temp temp) {
        this.temp = temp;
        return this;
    }

    /**
     * 
     * @return
     *     The pressure
     */
    public Double getPressure() {
        return pressure;
    }

    /**
     * 
     * @param pressure
     *     The pressure
     */
    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public List withPressure(Double pressure) {
        this.pressure = pressure;
        return this;
    }

    /**
     * 
     * @return
     *     The humidity
     */
    public Integer getHumidity() {
        return humidity;
    }

    /**
     * 
     * @param humidity
     *     The humidity
     */
    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public List withHumidity(Integer humidity) {
        this.humidity = humidity;
        return this;
    }

    /**
     * 
     * @return
     *     The weather
     */
    public java.util.List<Weather> getWeather() {
        return weather;
    }

    /**
     * 
     * @param weather
     *     The weather
     */
    public void setWeather(java.util.List<Weather> weather) {
        this.weather = weather;
    }

    public List withWeather(java.util.List<Weather> weather) {
        this.weather = weather;
        return this;
    }

    /**
     * 
     * @return
     *     The speed
     */
    public Double getSpeed() {
        return speed;
    }

    /**
     * 
     * @param speed
     *     The speed
     */
    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public List withSpeed(Double speed) {
        this.speed = speed;
        return this;
    }

    /**
     * 
     * @return
     *     The deg
     */
    public Integer getDeg() {
        return deg;
    }

    /**
     * 
     * @param deg
     *     The deg
     */
    public void setDeg(Integer deg) {
        this.deg = deg;
    }

    public List withDeg(Integer deg) {
        this.deg = deg;
        return this;
    }

    /**
     * 
     * @return
     *     The clouds
     */
    public Integer getClouds() {
        return clouds;
    }

    /**
     * 
     * @param clouds
     *     The clouds
     */
    public void setClouds(Integer clouds) {
        this.clouds = clouds;
    }

    public List withClouds(Integer clouds) {
        this.clouds = clouds;
        return this;
    }

    /**
     * 
     * @return
     *     The rain
     */
    public Double getRain() {
        return rain;
    }

    /**
     * 
     * @param rain
     *     The rain
     */
    public void setRain(Double rain) {
        this.rain = rain;
    }

    public List withRain(Double rain) {
        this.rain = rain;
        return this;
    }


    @Override
    public String toString() {
        Date date = new Date((long)getDt()*1000);
        SimpleDateFormat sdf = new SimpleDateFormat("E, MMM d");
        return sdf.format(date)+" " +getWeather().get(0).getDescription()+"  "+getTemp().getMax().intValue()+"/"+getTemp().getMin().intValue();
    }
}
