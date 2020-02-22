package com.techtarget.corejava;

public class cars {
    private String address;
    private String phone;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public cars (String address, String phone, String name){
        this.address = address;
        this. phone = phone;
        this. name = name;

    }

    @Override
    public String toString() {
        return "cars{" +
                "address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[]args) {
        cars Nissan = new cars("799 stl", "00000", "Nissan");
        System.out.println(Nissan);
    }
    public class types{
        private String vehiclename;
        private int prize;
        private String features;

        public String getVehiclename() {
            return vehiclename;
        }

        public void setVehiclename(String vehiclename) {
            this.vehiclename = vehiclename;
        }
    }


}