package network.tcp.autocloseable;

public class ResourceV1 {
    private String name;

    public ResourceV1(String name) {
        this.name = name;
    }

    public void call(){
        System.out.printf(name + " call");
    }

    public void callEx() throws CallException {
        System.out.printf(name + " callEx");
        throw new CallException(name + " ex");
    }

    public void close(){
        System.out.println(name + " close");
    }

    public void closeEx() throws CloseException {
        System.out.println(name + " closeEx");
        throw new CloseException(name + " ex");
    }
}
