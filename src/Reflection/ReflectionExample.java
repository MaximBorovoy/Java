package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class ReflectionExample {

    public static void main(String[] args) throws Exception {
        SomeClass someClass = new SomeClass();
        Class clss = someClass.getClass();
        Class clss2 = SomeClass.class;
        Class clss3 = Class.forName("Reflection.SomeClass");
        SomeClass someClass1 = (SomeClass) clss.newInstance();

        Constructor [] constructors = clss.getDeclaredConstructors();
        for (Constructor constructor: constructors) {
            System.out.println(constructor.getName());
            Parameter [] parameters = constructor.getParameters();
            for (Parameter parameter: parameters) {
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());
            }
        }
        Method [] methods = clss.getDeclaredMethods();
        for (Method method: methods) {
            System.out.println(method.getName());
            Parameter [] parameters = method.getParameters();
            for (Parameter parameter: parameters) {
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());
            }
            System.out.println(Modifier.toString(method.getModifiers()));
        }
    }
}

class SomeClass {
    private static transient int i;
    String s;

    public SomeClass() {
    }

    public SomeClass(String s) {
        this.s = s;
    }

    public String someMethod(String s) {
        System.out.println("this is s: " + s);
        return s;
    }
}
