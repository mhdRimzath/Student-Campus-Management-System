package studentcampussystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
}