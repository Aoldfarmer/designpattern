package chain;

public class NumberFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.setRequestStr(request.getRequestStr() + "12345");
        chain.doFilter(request, response, chain);
    }
}
