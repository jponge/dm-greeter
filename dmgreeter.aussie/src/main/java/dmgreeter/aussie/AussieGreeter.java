package dmgreeter.aussie;

import dmgreeter.greeter.Greeter;

import static java.lang.String.format;

public class AussieGreeter implements Greeter {

    public String greet(String who) {
        return format("G'day %s", who);
    }

}