package chain;

public class AlphaFilter implements Filter {


    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.setRequestStr(request.getRequestStr() + "aaaasw");
        chain.doFilter(request, response, chain);
    }
}
