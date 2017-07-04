package com.osigu.calculation;

/**
 * Created by eliud on 6/23/2017.
 */
public class Request {
    private String requestId;
    private Long startedAt;
    private Long ttl;

    public Request(String requestId, Long startedAt, Long ttl) {
        this.requestId = requestId;
        this.startedAt = startedAt;
        this.ttl = ttl;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Long getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Long startedAt) {
        this.startedAt = startedAt;
    }

    public Long getTtl() {
        return ttl;
    }

    public void setTtl(Long ttl) {
        this.ttl = ttl;
    }
}