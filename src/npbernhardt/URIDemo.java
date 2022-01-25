
package npbernhardt;

import java.net.URI;
import java.net.URISyntaxException;

public class URIDemo {
    public static void main(String[] args) throws URISyntaxException {
        URI uri1 = new URI("tel:9843224985");
        URI uri2 = new URI("ISBN","AX09we7r0w97345","xyz");
        URI uri3 = new URI("https","www.abc.com","/index.html","xyz");
        System.out.println(uri1);
        System.out.println(uri2);
        System.out.println(uri3);
        URI today = new URI("http", "www.ibiblio.org", "/javafaq/index.html", "referrer=cnet&date=2014-02-23", "today");
        System.out.println(today);
        System.out.println(today.getScheme());
        System.out.println(today.getSchemeSpecificPart());
        System.out.println(today.getRawAuthority());
        System.out.println(today.getRawFragment());
        System.out.println(today.getRawQuery());
        System.out.println(today.getSchemeSpecificPart());
    }
    
}
