package org.example;
@RestController
public class HelloService {
    @GetMapping("/hello")
    public static String hello(){
        return "Hello World!";
    }
    @GetMapping("/Pi")
    public static String pi(){
        return String.valueOf(Math.PI);
    }

    @GetMapping("/Prueba3")
    public static String Prueba3(){
        return "Esta es una pruebaaaaaa!";
    }
    @GetMapping("/Redondear")
    public static int[] Redondear(){
        float valor1 = 10.123123121F; // Primer valor
            return String.valueOf(Math.round(valor1));
    }

}
