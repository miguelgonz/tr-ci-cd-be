package innovation.be.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

public class City {

    @Id
    private String id;

    private String name;

    private int offset;

    @JsonCreator
    public City(@JsonProperty("name") String name, @JsonProperty("offset") int offset) {
        this.name = name;
        this.offset = offset;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getOffset() {
        return offset;
    }
}
