import org.joda.time.DateTime;

/**
 * Created by ckale on 10/29/14.
 */
public class PojoDTO {

    private DateTime dateTime;
    private String something;

    public PojoDTO(DateTime dateTime, String something) {
        this.dateTime = dateTime;
        this.something = something;
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public String getSomething() {
        return something;
    }
}
