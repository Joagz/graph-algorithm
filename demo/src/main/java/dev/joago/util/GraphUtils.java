package dev.joago.util;

import java.util.List;
import java.util.Map;

import dev.joago.Vertex;

public class GraphUtils {

    public static void printGraphMatrixVerbose(List<List<Integer>> MA) {
        for (int i = 0; i < MA.size(); i++) {
            System.out.print(i + ": [");
            for (int j = 0; j < MA.size(); j++) {
                System.out.print(j + ": " + MA.get(i).get(j));
                if (j != MA.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            if (i != MA.size() - 1) {
                System.out.println(",");
            }
        }
    }

    public static void printGraphMatrix(List<List<Integer>> MA) {
        for (int i = 0; i < MA.size(); i++) {
            System.out.print("[");
            for (int j = 0; j < MA.size(); j++) {
                System.out.print(MA.get(i).get(j));
                if (j != MA.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            if (i != MA.size() - 1) {
                System.out.println(",");
            }
        }
    }

    public static void printGraphMap(List<Map<Integer, Integer>> relations) {
        for (int i = 0; i < relations.size(); i++) {

            System.out.print(relations.get(i).toString() + "  ");

        }
    }

    public static void printVertex(List<Vertex> V) {
         for (Vertex v : V) {
            System.out.println("[");

            System.out.println(v);
            if (v.getConnectedTo() != null) {
                System.out.println("CONNECTIONS: ");
                for (Vertex v2 : v.getConnectedTo()) {
                    System.out.println("\t"+v2);
                }
            }
            System.out.println("]");

            System.out.println("\n");
        }

    }

}
