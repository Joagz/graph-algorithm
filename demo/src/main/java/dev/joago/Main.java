package dev.joago;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import dev.joago.util.GraphUtils;

public class Main {
    public static void main(String[] args) {
        graph();
    }

    public static void graph() {

        List<List<Integer>> MA = new ArrayList<List<Integer>>();

        Random rand = new Random();
        int size = rand.nextInt(3, 5);
        for (int i = 0; i < size; i++) {

            List<Integer> A = new ArrayList<>();

            for (int j = 0; j < size; j++) {

                A.add(0);

            }
            MA.add(A);
        }

        List<Map<Integer, Integer>> relations = new ArrayList<>();

        // 'j' = the vector in Y and 'i' = the vector in X

        for (int i = 0; i < MA.size(); i++) {
            List<Integer> A = MA.get(i);

            for (int j = 0; j < A.size(); j++) {

                if (rand.nextInt(2) == 1) {
                    Map<Integer, Integer> map = new HashMap<>();

                    List<Integer> B = MA.get(j);

                    B.set(i, 1);
                    A.set(j, 1);

                    MA.set(i, A);
                    MA.set(j, B);

                    map.put(i, j);
                    map.put(j, i);

                    relations.add(map);
                }

            }
        }
        GraphUtils.printGraphMatrix(MA);
        GraphUtils.printGraphMap(relations);

        List<Vertex> V = new ArrayList<>();

        for (int i = 0; i < MA.size(); i++) {
            V.add(new Vertex(i, null));
        }

        for (Vertex vertex : V) {

            List<Vertex> connections = new ArrayList<>();

            for (Map<Integer, Integer> rel : relations) {
                if (rel.containsKey(vertex.getIndex())) {
                    connections.add(V.get(rel.get(vertex.getIndex())));
                }
            }

            vertex.setConnectedTo(connections);

        }

    }

}