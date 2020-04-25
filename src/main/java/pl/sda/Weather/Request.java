package pl.sda.Weather;

public class Request {
    public Request(String type, String query) {
        this.type = type;
        this.query = query;
    }

    public String getType() {
        return type;
    }

    public String getQuery() {
        return query;
    }

    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    private String query;
}
