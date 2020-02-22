package com.targettech.corejava;

public class Customerservice {
       private int service_id;
       private String service_type;
       private String service_status;

    public Customerservice(int service_id, String service_type, String service_status) {
        this.service_id = service_id;
        this.service_type = service_type;
        this.service_status = service_status;
    }

    @Override
    public String toString() {
        return "Customerservice{" +
                "service_id=" + service_id +
                ", service_type='" + service_type + '\'' +
                ", service_status='" + service_status + '\'' +
                '}';
    }
}
