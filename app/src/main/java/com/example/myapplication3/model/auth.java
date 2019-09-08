package com.example.myapplication3.model;

public class auth {

    private String Auser;
    private String Apassword;

    private static final String EMAIL = "aaa";
    private static final String PASSWORD = "111";

    private static final String EMAIL2 = "bbb";
    private static final String PASSWORD2 = "222";
    public auth(String user, String password) {
        Auser = user;
        Apassword = password;
    }

    public boolean check1() {
        if (Auser.equals(EMAIL) && Apassword.equals(PASSWORD) ){
            return true;
        }
        else{

            return false;
        }

    }
    public boolean check2() {
        if (Auser.equals(EMAIL2) && Apassword.equals(PASSWORD2) ){
            return true;
        }
        else{

            return false;
        }

    }
}

//Intent intent = new Intent(....,.....);
//intent.putExtra("ชื่อ","aaaa")++++++++

//startA


//หน้าปลายทาง
//Intent intent =getIntent();
//String user =intent.getStringExtra("ชื่อ");