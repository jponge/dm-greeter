package dmgreeter.consumer;

import dmgreeter.greeter.Greeter;

import java.util.Map;

public class Consumer {

    public void bind(Greeter greeter, Map properties) {
        System.out.println("A greeter has been bound!");
        System.out.println(greeter.greet("Julien"));
    }

    public void unbind(Greeter greeter, Map properties) {
        System.out.println("A greeter has been unbound...");
    }

}