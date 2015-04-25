package com.isbao.controller;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Record;

import java.util.List;

public class IndexController extends Controller {

    public void index(){
        render("/views/index.jsp");
    }

    public void login(){
        render("/views/admin/login.jsp");
    }


    public void sync(){
        redirect("/");
    }
}
