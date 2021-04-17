package com.ggomjae.gom.modulemodifycode;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;
import java.io.File;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class ClassLoaderAndByteCode {

    public static void main(String[] args) throws Exception {
        ClassLoader loader = ClassLoaderAndByteCode.class.getClassLoader();
        System.out.println(loader);
        System.out.println(loader.getParent());

        new ByteBuddy().redefine(Gomjae.class)
                .method(named("call")).intercept(FixedValue.value("GOMJAE!"))
                .make().saveIn(new File("C:\\Users\\user\\Desktop\\Intellij_project\\ggomjae_BackEnd" +
                "\\module-modifycode\\build\\classes\\java\\main"));

         System.out.println(new Gomjae().call());
    }
}