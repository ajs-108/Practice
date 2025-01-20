package com.practice.other;

public class MultiBlockText {

    public static void main(String[] args) {
        String json = """
                {
                "name": "Arpan",
                "rollNo": 1,
                "class": "BE",
                "branch": "IT",
                "hobbies": ["Drawing", "Reading"]
                }
                """;
        String html = """
                
                <html>
                    <head>
                        <title>Page1</title>
                    </head>
                    <body>
                        <h1>Heading</h1>
                        <p></p>
                    </body>
                </html>
                """;

        System.out.println("JSON: "+json);
        System.out.println("HTML: "+html);
    }
}
