package com.isbao.controller;

import com.jfinal.core.Controller;

public class AdminController extends Controller {

    public void index(){
        render("/views/index.jsp");
    }


    public void sync(){
        redirect("/");
    }
}
