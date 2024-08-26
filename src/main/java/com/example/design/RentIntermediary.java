package com.example.design;

/**
 * @author czq
 * @date 2024/8/15 15:11
 * @Description:
 */
public class RentIntermediary  extends Intermediary{

    private Person landlord;

    private Person tenant;

    @Override
    void contract(Person person, String msg) {
        if(person==landlord){
            tenant.getMsg(msg);
        }else {
            landlord.getMsg(msg);
        }

    }


    public static void main(String[] args) {
        RentIntermediary intermediary = new RentIntermediary();
        Person landlord = new Person("房东",intermediary);
        Person tenant = new Person("租房的",intermediary);
        intermediary.setLandlord(landlord);
        intermediary.setTenant(tenant);


        landlord.contract("你想租多少钱的房子");
        tenant.contract("没钱了，便宜点");

    }


    public Person getLandlord() {
        return landlord;
    }

    public void setLandlord(Person landlord) {
        this.landlord = landlord;
    }

    public Person getTenant() {
        return tenant;
    }

    public void setTenant(Person tenant) {
        this.tenant = tenant;
    }
}
