package io.openliberty.guides.graphql.models;

import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Type;

@Type("systemLoad")
@Description("Information of system usage")
public class SystemLoad {

    @NonNull
    private String hostname;

    @NonNull
    private SystemLoadData loadData;

    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public SystemLoadData getLoadData() {
        return this.loadData;
    }

    public void setLoadData(SystemLoadData loadData) {
        this.loadData = loadData;
    }

}
