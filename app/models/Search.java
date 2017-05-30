package models;

import com.avaje.ebean.Model;

/**
 * Created by andi on 30.05.17.
 */
public class Search extends Model {

    private String suchbegriff;

    public String getSuchbegriff() {
        return suchbegriff;
    }

    public void setSuchbegriff(String suchbegriff) {
        this.suchbegriff = suchbegriff;
    }
}
