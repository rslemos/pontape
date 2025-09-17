package io.openliberty.guides.graphql.models;

import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Type;

@Type("systemMetrics")
@Description("System metrics")
public class SystemMetrics {

    @NonNull
    private Integer processors;

    @NonNull
    private Long heapSize;

    @NonNull
    private Long nonHeapSize;

    public Integer getProcessors() {
        return processors;
    }

    public void setProcessors(int processors) {
        this.processors = processors;
    }

    public Long getHeapSize() {
        return heapSize;
    }

    public void setHeapSize(long heapSize) {
        this.heapSize = heapSize;
    }

    public Long getNonHeapSize() {
        return nonHeapSize;
    }

    public void setNonHeapSize(Long nonHeapSize) {
        this.nonHeapSize = nonHeapSize;
    }

}
