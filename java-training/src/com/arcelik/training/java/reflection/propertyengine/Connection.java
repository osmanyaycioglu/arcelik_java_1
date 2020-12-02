package com.arcelik.training.java.reflection.propertyengine;

@PropFile("connection.properties")
public class Connection {

    @Prop("con.name")
    private String  name;
    @Prop("con.ip")
    private String  ip;
    @Prop("con.port")
    private Integer port;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(final String ipParam) {
        this.ip = ipParam;
    }

    public Integer getPort() {
        return this.port;
    }

    public void setPort(final Integer portParam) {
        this.port = portParam;
    }

    @Override
    public String toString() {
        return "Connection [name=" + this.name + ", ip=" + this.ip + ", port=" + this.port + "]";
    }


}
