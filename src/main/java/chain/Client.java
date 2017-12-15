package chain;

public class Client {

    public static void main(String[] args) {
        Request request = new Request();
        request.setRequestStr("PPP");
        Response response = new Response();
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new NumberFilter());
        filterChain.addFilter(new AlphaFilter());
        filterChain.doFilter(request, response, filterChain);
        System.out.println("Request" + request.getRequestStr());
    }
}
