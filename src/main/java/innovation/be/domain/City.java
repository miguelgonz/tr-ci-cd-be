package innovation.be.domain;

import org.springframework.data.annotation.Id;

public class City {

    @Id
    private String id;

    private String name;

    private int offset;

    public City(String name, int offset) {
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
