package com.company;

import java.nio.charset.Charset;

public class TesteEncoding {
    public static void main(String[] args) {
        String s = "C";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());
    }
}
