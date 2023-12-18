import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
        public static void main(String[] args) {
                FriendNetwork friendNetwork = new FriendNetwork();

                friendNetwork.addFriend("Alice", Arrays.asList("Bob", "Charlie"), true);
                friendNetwork.addFriend("Bob", Arrays.asList("Alice", "David"), false);
                friendNetwork.addFriend("Charlie", Arrays.asList("Alice", "Eve"), true);
                friendNetwork.addFriend("David", Collections.singletonList("Bob"), true);
                friendNetwork.addFriend("Eve", Collections.singletonList("Charlie"), false);

                System.out.println("Friend Network:");
                friendNetwork.printNetwork();

                String startPerson = "Eve";
                List<String> friendsWithCar = friendNetwork.findFriendsWithCar(startPerson);

                System.out.println("\nFriends with a car starting from " + startPerson + ":");
                if (!friendsWithCar.isEmpty()) {
                        System.out.println(friendsWithCar);
                } else {
                        System.out.println("No one with a car found.");
                }
        }
}
