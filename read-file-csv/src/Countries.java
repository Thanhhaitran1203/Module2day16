public class Countries {
    private String id,code,name;
    public Countries(){}

    public Countries(String id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Countries{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
