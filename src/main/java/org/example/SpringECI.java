package org.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SpringECI {
    public static void main(String[] args) throws ClassNotFoundException, MalformedURLException, InvocationTargetException, IllegalAccessException {

        Class c =Class.forName(args[0]);
        Map<String, Method> services = new HashMap();


        //Cargar componentes
        if(c.isAnnotationPresent(RestController.class)){
            Method[] methods = c.getDeclaredMethods();
            for(Method m : methods){
                if(m.isAnnotationPresent(GetMapping.class)){
                    String key = m.getAnnotation(GetMapping.class).value();
                    services.put(key, m);
                }
            }

        }

        //Ejemplo
        URL serviceurl = new URL("http://localhost:8080/App/Suma");
        String path = serviceurl.getPath();
        System.out.println("Path" + path);
        String servicename = path.substring(4);
        System.out.println("Service name: "+ servicename);

        Method ms = services.get(servicename);
        ms.invoke(ms);
        System.out.println("Respuesta servicio: " + ms.invoke(null));

    }
}
