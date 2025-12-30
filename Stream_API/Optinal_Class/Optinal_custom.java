package optinal_class;

import java.util.Optional;

public class Optinal_custom {

	public static Optional<User> findUser(String username) {
		if (username.equals("Viraj")) {
			return Optional.of(new User("Viraj")); // if User exists its return New User (Signature of Constructor)
		}
		return Optional.empty();
	}

	public static void main(String[] args) {

		Optional<User> user = findUser("Viraj");

		user.ifPresent(u -> System.out.println("Welcome " + u.getUsername()));

		System.out.println(user.orElse(new User("Guest")).getUsername());

	}

}

class User {
	private String username;

	public User(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}
}
