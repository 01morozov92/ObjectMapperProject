
package ApiModel;



import com.google.gson.annotations.Expose;

import javax.annotation.processing.Generated;


@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Coordinates {

    @Expose
    private String latitude;
    @Expose
    private String longitude;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

}
