package pe.edu.pucp.a20152252.myfirstlogin.data.api.base;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("baseInRO")
public class BaseInRO {

    private String applicationName;

    public String getApplicationName() {
        return applicationName;
    }

    public BaseInRO(String applicationName) {
        this.applicationName = applicationName;
    }
}
