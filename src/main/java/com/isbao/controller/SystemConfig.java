package com.isbao.controller;

import com.jfinal.config.*;
import com.jfinal.ext.interceptor.SessionInViewInterceptor;
import com.jfinal.ext.plugin.quartz.QuartzPlugin;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.dialect.MysqlDialect;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;

public class SystemConfig extends JFinalConfig {

    public void configConstant(Constants me) {
        loadPropertyFile("application.properties");
        me.setDevMode(getPropertyToBoolean("devMode", false));
        me.setViewType(ViewType.JSP);
    }

    public void configRoute(Routes me) {
        me.add("/", IndexController.class);
        me.add("/admin", AdminController.class);
    }

    public void configPlugin(Plugins me) {
        C3p0Plugin dsSource = new C3p0Plugin(getProperty("source.url"), getProperty("source.user"), getProperty("source.password").trim());
        dsSource.setDriverClass(getProperty("source.driver"));
        me.add(dsSource);


        ActiveRecordPlugin arpSource = new ActiveRecordPlugin(dsSource);
        me.add(arpSource);
        arpSource.setDialect(new MysqlDialect());



        //任务调度
        QuartzPlugin quartzPlugin = new QuartzPlugin("job.properties");
        me.add(quartzPlugin);
    }

    public void configInterceptor(Interceptors me) {
        me.add(new SessionInViewInterceptor());

    }

    public void configHandler(Handlers me) {

    }
}
