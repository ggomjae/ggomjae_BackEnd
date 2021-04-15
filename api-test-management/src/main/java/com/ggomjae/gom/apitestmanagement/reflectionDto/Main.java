package com.ggomjae.gom.apitestmanagement.reflectionDto;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ReflectiveOperationException {
        ParentObject parentObject = new SonObject("SON");
        Class sonObjectClass = SonObject.class;
        Method sonObjectSayMethod = sonObjectClass.getMethod("say");
        sonObjectSayMethod.invoke(parentObject);
    }
}
