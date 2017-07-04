package com.osigu.calculation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by eliud on 6/23/2017.
 */
public class PolygonsResolver {


    public static void main(String... rg) {
        new PolygonsResolver().classify("polygons.txt");
    }

    public void classify(String filePath) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.next();
                classifyLine(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void classifyLine(String line) {
        final String[] values = line.replaceAll("\\r\\n|\\r|\\n", "").split(",");
        String result;
        switch (values.length) {
            case 3:
                result = "Triangle";
                break;
            case 4:
                result = Arrays
                        .asList(values)
                        .stream()
                        .allMatch(values[0]::equals) ? "Square" : "Rectangle";
                break;
            default:
                result = values.length > 5 ? "Polygon" : "Not a polygon";
        }
        System.out.println(result);
    }

}
