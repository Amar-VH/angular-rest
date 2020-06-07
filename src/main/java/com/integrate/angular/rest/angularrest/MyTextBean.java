package com.integrate.angular.rest.angularrest;

public class MyTextBean {

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MyTextBean{" +
                "message='" + message + '\'' +
                '}';
    }

    private String message;

    MyTextBean(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


}
