import java.util.*;

public class FriendNetwork {
    private Map<String, List<String>> network;
    private Map<String, Boolean> hasCarMap;

    public FriendNetwork() {
        this.network = new HashMap<>();
        this.hasCarMap = new HashMap<>();
    }

    public void addFriend(String person, List<String> friends, boolean hasCar) {
        network.put(person, friends);
        hasCarMap.put(person, hasCar);
    }

    public void printNetwork() {
        for (Map.Entry<String, List<String>> entry : network.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            System.out.println(entry.getValue());
        }
    }

    public List<String> getFriends(String person) {
        return network.get(person);
    }

    public List<String> findFriendsWithCar(String startPerson) {
        List<String> result = new ArrayList<>();

        if (hasCar(startPerson)) {
            result.add(startPerson);
            return result;
        }

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(startPerson);
        visited.add(startPerson);

        while (!queue.isEmpty()) {
            String currentPerson = queue.poll();

            List<String> friends = network.getOrDefault(currentPerson, Collections.emptyList());
            for (String friend : friends) {
                if (!visited.contains(friend)) {
                    visited.add(friend);
                    queue.add(friend);
                    if (hasCar(friend)) {
                        result.add(friend);
                    }
                }
            }
        }

        return result;
    }

    private boolean hasCar(String person) {
        return hasCarMap.getOrDefault(person, false);
    }
}
