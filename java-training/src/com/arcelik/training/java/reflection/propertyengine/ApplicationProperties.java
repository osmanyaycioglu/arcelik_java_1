package com.arcelik.training.java.reflection.propertyengine;

@PropFile("app.properties")
public class ApplicationProperties {

    @Prop("app.name")
    private String  name;
    @Prop("app.version")
    private String  version;
    @Prop("app.desc")
    private String  desc;
    @Prop("app.length")
    private Integer length;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(final String versionParam) {
        this.version = versionParam;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(final String descParam) {
        this.desc = descParam;
    }

    public Integer getLength() {
        return this.length;
    }

    public void setLength(final Integer lengthParam) {
        this.length = lengthParam;
    }

    @Override
    public String toString() {
        return "ApplicationProperties [name="
               + this.name
               + ", version="
               + this.version
               + ", desc="
               + this.desc
               + ", length="
               + this.length
               + "]";
    }


}
