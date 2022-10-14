package com.bootcoding.basic.collections.app;

import com.bootcoding.basic.collections.Customer;
import com.bootcoding.basic.collections.MenuItem;
import com.bootcoding.basic.collections.Order;
import com.bootcoding.basic.collections.OrderMenuItem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Applications {
    public static void main(String[] args) {

        Applications applications = new Applications();


    }



    public void add(Customer customer, MenuItem menuItem, OrderMenuItem orderMenuItem, Order order) {

        if (customer instanceof Customer) {

            customer.setCustomerId(12345);
            customer.setName("Name");
            customer.setAddress("Nagpur");
            customer.setCity("nagpur");
            customer.setPhoneNumber(987654321);
            customer.setState("Maharastra");
            customer.setEmailId("ahsyuxjsguybs@gmai;.com");
        }
        Map<Long, Customer> map =  new HashMap<>();
        map.put(customer.getCustomerId(),customer);

        if (menuItem instanceof MenuItem){

            menuItem.setPrice(250);
            menuItem.setMenuItemId(1234);
            menuItem.setCategory("Chinese");
            menuItem.setMenuItemId(5262761);

        }
        Map<Long, MenuItem> mapMenuItem =  new HashMap<>();
        mapMenuItem.put(customer.getCustomerId(),menuItem);

    }

        /*      Applications applications = new Applications();

         *//*
        Object o = applications.addValues(new MenuItem());
*//*

        System.out.println((MenuItem)o);



    }

   *//* public Object addValues(Object o){

        if(o instanceof  Customer){
            Customer c = (Customer) o;c.setCustomerId(10);
          c.setName("vastav");
          c.setCity("nagpur");
          c.setPhoneNumber(456789999);
          return  c;
        }
        if(o instanceof  MenuItem){
            MenuItem m =(MenuItem) o;

            m.setMenuItemId(1000);
            m.setCategory("food");
            m.setPrice(12322.8);

            return m;

        }

        return  null;

    }*//*

    public Map addCollection(Map<String,Object> map){
        Customer customer = new Customer();
        customer.setAddress("bcak");
        customer.setState("jcahc");
        customer.setEmailId("Rahhajj");
        customer.setCustomerId(100);
        map.put("customer",customer);

        return map;

    }*/

}