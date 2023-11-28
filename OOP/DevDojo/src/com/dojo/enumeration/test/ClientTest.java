package com.dojo.enumeration.test;

import com.dojo.enumeration.domain.Client;
import com.dojo.enumeration.domain.ClientType;

public class ClientTest {
    public static void main(String[] args) {

        Client client01 = new Client("Alexandre", ClientType.PHYSICAL_PERSON);
        Client client02 = new Client("Maria", ClientType.PHYSICAL_PERSON);


        System.out.println(client01);
        System.out.println(client02);


    }
}
