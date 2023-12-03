package kaketom.app.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Predmet {

    @Id
    private String id;
    @Field
    private String name;
    @Field
    private String material;
    @Field
    private String website;

    public Predmet(String name, String material, String website) {
        this.name = name;
        this.material = material;
        this.website = website;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return String.format("User[id='%s', name='%s', material='%s', website='%s']", id, name, material, website);
    }
}
