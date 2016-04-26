package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyC_oi5v-QwyHirz_xbDzwcdcAROWrZ-xwc";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bGB-ZbeyCtLP_QRNQE5zu4Y-1LgRlTFiIMh2vDrhtgVwL5vTo5DYiE_YFo4ftOjxk4Nihykt_LSTPL9T_7FX64I7EQoe-l_eQ_4-T36BwAdOgAioktNUE1fwFoaPe6fdzQ1Aayx");

        c.createData("Working!!", "Test message");

        return c;
    }
}

