/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npbernhardt;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Dipendra
 */
public class URLEquality {
    public static void main(String[] args) throws MalformedURLException {
        URL url1 = new URL("https://www.kbc.edu.np/");
        URL url2 = new URL("https://www.kbc.edu.np");
        System.out.println(url1.equals(url2));
        System.out.println(url1.hashCode());
        System.out.println(url2.hashCode());
    }
 
}
