package studentcampussystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.Queue;

public class CampusGraph {

    private Map<String, ArrayList<String>>
            graph =
            new HashMap<>();

    public void addLocation(
            String location) {

        if (graph.containsKey(location)) {

            System.out.println(
                    "Location already exists.");

            return;
        }

        graph.put(
                location,
                new ArrayList<>());

        System.out.println(
                "Location added.");
    }

    public void removeLocation(
            String location) {

        if (!graph.containsKey(location)) {

            System.out.println(
                    "Location not found.");

            return;
        }

        graph.remove(location);

        for (ArrayList<String> neighbours
                : graph.values()) {

            neighbours.remove(location);
        }

        System.out.println(
                "Location removed.");
    }

    public void addConnection(
            String first,
            String second) {

        if (!graph.containsKey(first)
                || !graph.containsKey(second)) {

            System.out.println(
                    "Location not found.");

            return;
        }

        if (!graph.get(first)
                .contains(second)) {

            graph.get(first)
                    .add(second);

            graph.get(second)
                    .add(first);
        }
    }

    public void displayConnections() {

        for (String location
                : graph.keySet()) {

            System.out.println(
                    location
                    + " -> "
                    + graph.get(location));
        }
    }
    public void removeConnection(
        String first,
        String second) {

    if (!graph.containsKey(first)
            || !graph.containsKey(second)) {

        System.out.println(
                "Location not found.");

        return;
    }

    graph.get(first)
            .remove(second);

    graph.get(second)
            .remove(first);
}

public void bfs(
        String start) {

    if (!graph.containsKey(start)) {

        System.out.println(
                "Starting location not found.");

        return;
    }

    ArrayList<String> visited =
            new ArrayList<>();

    Queue<String> queue =
            new LinkedList<>();

    queue.add(start);
    visited.add(start);

    while (!queue.isEmpty()) {

        String current =
                queue.poll();

        System.out.print(
                current + " ");

        for (String neighbour
                : graph.get(current)) {

            if (!visited.contains(
                    neighbour)) {

                visited.add(
                        neighbour);

                queue.add(
                        neighbour);
            }
        }
    }

    System.out.println();
}
}